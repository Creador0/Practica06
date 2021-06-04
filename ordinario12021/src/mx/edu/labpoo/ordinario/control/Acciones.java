package mx.edu.labpoo.ordinario.control;
import java.io.*;
import java.util.TreeSet;
import mx.edu.labpoo.ordinario.figuras.Figura;
import mx.edu.labpoo.ordinario.vistas.Ventana;
public class Acciones {

    private Ventana v;
    //(1)Atributo privado de tipo TreeSet (lista) que almacena objetos de tipo Figura
	private TreeSet<Figura> ts = new TreeSet<Figura>();
    //(2)Atributo privado y entero (lados)
	private int lados;

    public Acciones(Ventana v) {
        this.v = v; 
    }

    private boolean validar(String dato, int min, int max) {
        //(3) Convertir (dato) a entero (valor)
		try{
			int dato_int = Integer.parseInt(dato);
			if(dato_int >= min && dato_int <= max){
				return true;
			} else {
				return false;
			}
		} catch(Exception e){
			return false;
		}
        //(4) Si es posible hacerlo, regresar:
            //verdadero si (valor >= min y valor <= max)
            //caso contrario, false
            //
        //No es posible convertir a entero, regresar falso
    }

    public void chkLados() {
		getBtnAdd().setEnabled(false);
        //deshabilitar el botón btnAdd 
        //Si el contenido de txtLados (texto) es una cadena vacia ("")
        //terminar el método con la palabre return;
		if(getTxtLados().getText() == ""){
			return "";
		} else {
			if(getTxtLados().validad() == true){
				lados = (int) (txtLados.getText());
				getBtnAdd().setEnabled(true);
			} else {
				showMessageDialog(v, "Valores incorrectos");
			}
		}

        //Usar el método validad con el contenido de txtLados
        // y los valores min = 3 max = 4
        //Si regresa verdadero
            //Atributo lados = Entero(txtLados.getText())
            //Habilitar el botón btnAdd
        //No regresa verdadero showMessageDialog(v, "Valores incorrectos")
    }

    public void addFigura() {
        //validar los lados 1 - 100
        boolean l1 = validar(getTxtLad1().getText(), 1, 100);
        boolean l2 = validar(getTxtLad2().getText(), 1, 100);
        boolean l3 = validar(getTxtLad3().getText(), 1, 100);
        boolean l4 = validar(getTxtLad4().getText(), 1, 100);
        //crear la figura
        Figura f = new Figura();
        if (lados == 3 && l1 && l2 && l3 && l4) {
            int a1 = Integer.parseInt(getTxtLad1().getText());
            int a2 = Integer.parseInt(getTxtLad2().getText());
            int a3 = Integer.parseInt(getTxtLad3().getText());
            int a4 = Integer.parseInt(getTxtLad4().getText());
            f = new Triangulo(a1, a2, a3, a4);
        }
        if (lados == 4 && l1 && l2) {
            int a1 = Integer.parseInt(getTxtLad1().getText());
            int a2 = Integer.parseInt(getTxtLad2().getText());
            f = new Rectangulo(a1, a2);
        }
        if (f != null) {
            System.out.println(f);
            lista.add(f);
        }
        showLista();
    }

    private void showLista() {
        getTxtFiguras().setText("");
        if (lista.size() > 0) {
            for (Figura figura : lista) {
                //agregar el toString de figura a txtFiguras
				getTxtFiguras().append(f.toString());
                //agregar un salto de linea a txtFiguras
				getTxtFiguras().append("\n");
            }
        }
    }

    public void saveFile() {
        //Verificar si el directorio de los documentos en HOME es
        //Documents o Documentos
        //Crear dentro de dicho directorio el archivo ordinario.out
        //Imprimir la ruta del archivo para verificar
        //Ejemplo System.out.println(file) <- ruta del archivo
        // NO MODIFICAR EL SIGIENTE CÓDIGO
        //Solo podrá cambiar la variable (file) <- ruta del archivo
        try{
            FileWriter fr = new FileWriter(user.home.documents); //<- (file) ruta del archivo 
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write(getTxtFiguras().getText());
            bw.close();
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
