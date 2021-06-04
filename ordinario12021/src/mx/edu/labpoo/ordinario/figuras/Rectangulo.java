//agregar el paquete correspondiente
package mx.edu.labpoo.ordinario.figuras;
import mx.edu.labpoo.ordinario.figuras.Figura;
public abstract class Rectangulo extends Figura {
	
	public Rectangulo(int base, int altura){
		super(base,altura);
	}
	
	public void setArea(){
		area = super.getBase() * super.getAltura();
	}
	
	public void setPerimetro(){
		perimetro = (2*super.getBase() + 2*super.getAltura());
	}
	
	public String toString(){
		setArea(area);
		setPerimetro(perimetro);
		return "Rectangulo Area: " + area + " Perimetro: " + perimetro + " Base: " + super.getBase() + " Altura " + super.getAltura();
	}
}
