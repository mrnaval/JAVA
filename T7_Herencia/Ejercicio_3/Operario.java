//Marc Naval Lloret
package Ejercicio_3;

public class Operario extends Empleado{

	public Operario() {
		
	}
	
	public Operario(String nombre) {
		this.setNombre(nombre);
	}
	
	public String toString() {
		String todo=this.nombre+" es un obejeto de la clase Empleado > Operario";
		return todo;
	}
}
