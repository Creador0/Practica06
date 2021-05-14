public class Hilo extends Thread{
	private JLabel etiqueta;
	
	public Hilo(String nombre, JLabel etiqueta){
		this.nombre = nombre;
		this.etiqueta = etiqueta;
	}
}