package mx.preordi.elfinal.personas;
public class Alumno extends Persona{
	private int calific;

	public Alumno(String nombre, String apellido, int calific){
		this(nombre,apellido,calific);
	}
	public Alumno(String nombre, String apellido){
		this(nombre,apellido,0);
	}
	
	public int getCalific(){
		return calific;
	}
	
	public String toString(){
		return super.toString() + "\t" + calific;
	}

	public void setCalific(int calific){
		if(calific >= 0 && calific <= 100){
			this.calific = calific;
		}
	}
	public int compareTo(Alumno a){
		this.getCalific().compareTo();
	}
}