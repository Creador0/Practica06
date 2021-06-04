//agregar el paquete correspondiente
package mx.edu.labpoo.ordinario.figuras;
import java.util.Comparator;
public abstract class Figura implements Comparator<Figura>{
	
	private final int base;
	private final int altura;
	protected float area;
	protected float perimetro;
	
	public Figura(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	public abstract void setArea(float area);
	
	public abstract void setPerimetro(float perimetro);
	
	public abstract String toString();
	
	public boolean equals(Object x){
		boolean bandera = false;
		if((x!=null) && (x instanceof Figura)){
			Figura z = (Figura) x;
			if((base == z.base) && (altura == z.altura)){
				bandera = true;
			}
		}
		return bandera;
	}

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.base;
        hash = 17 * hash + this.altura;
        return hash;
    }
	
	public int compare(Figura F1, Figura F2){
		if ((F1.getArea() == F2.getArea()) && (F1.getPerimetro() == F2.getPerimetro())) {
			return 0;
		} 
		return 1;
	}
}
