package mx.preordi.elfinal.personas;
public abstract class Persona implements Comparable{
	protected String nombre;
	protected String apellido;
	public Persona(String nombre, String apellido){	
	}
	
	public abstract void setNombre(String nombre);
	
	public abstract void setApellido(String apellido);
	
	public abstract String getNombre();
	
	public abstract String getApellido();
	
	public boolean equals(Object x){
		boolean result = false;
		if ((x != null) && (x instanceof Persona)){
			Persona y = (Persona) x;
			if ((nombre==y.nombre)&&(apellido==y.apellido)){
				result = true;
			}
		}
		return result;
	}
	
	public String toString(){
		return nombre + "\t" + apellido;
	}
	
	public int compareTo(Persona p){
		int v = getApellido().compareTo(p.getApellido());
		if(valor != 0){
			return valor;
		}
		int v2 = getNombre().compareTo(p.getNombre());
	}
}