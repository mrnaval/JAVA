//Marc Naval Lloret
package Ejercicio_6;

public class Comercial extends Empleado{
	
	
	//Atributos
	protected double comision;

	
	//Constructores
	public Comercial() {
			
	}

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
	
	
	//Getters y Setters
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	
	//Métodos
	public String toString() {
		String todo = super.toString();
		todo = todo + "\nComision: "+ comision;
		return todo;
	}
		
	public void plus() {
		if (edad >= 30 && comision >= 200) {
			salario = salario + PLUS;
		}
	}
}
