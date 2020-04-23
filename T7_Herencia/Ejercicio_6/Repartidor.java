//Marc Naval Lloret
package Ejercicio_6;

public class Repartidor extends Empleado{

	//Atributos
	protected String zona;

	
	//Constructores
	public Repartidor() {
		
	}
	
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	
	//Getters y Setters
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	
	//Métodos
	public String toString() {
		String todo = super.toString();
		todo = todo + "\nZona: "+ zona;
		return todo;
	}
	
	public void plus() {
		if (edad < 25 && zona == "zona 3") {
			salario = salario + PLUS;
		}
	}	
}
