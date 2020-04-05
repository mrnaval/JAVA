//Marc Naval Lloret
package Ejercicio_3;

public class Empleado {

	protected String nombre;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre) {
		this.setNombre(nombre);
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		String todo=this.nombre+" es un objeto de la clase Empleado";
		return todo;
	}
	
}
