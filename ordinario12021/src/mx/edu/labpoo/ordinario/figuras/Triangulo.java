package mx.edu.labpoo.ordinario.figuras;
import mx.edu.labpoo.ordinario.figuras.Figura;
public abstract class Triangulo extends Figura{
    
	private final int lado3;
	private final int lado4;
	
    public Triangulo(int base, int altura,int lado3, int lado4) {
		super(base, altura);
		this.lado3 = lado3;
		this.lado4 = lado4;
    }
	
	public void setArea(){
		area = (super.getBase() * super.getAltura()) / 2;
	}
	
	public void setPerimetro(){
		perimetro = (super.getBase() + lado3 + lado4);
	}
	
	public String toString(){
		setArea(area);
		setPerimetro(perimetro);
		return "Triangulo Area: " + area + " Perimetro: " + perimetro + "Lados: " + super.getBase() + " " + lado3 + " " + lado4;
	}
}
