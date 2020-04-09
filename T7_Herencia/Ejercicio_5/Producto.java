//Marc Naval Lloret
package Ejercicio_5;

public class Producto {
	
	//Atributos
	String nombre;
	double precio;
	
	//Constructor por defecto
	public Producto() { 		
		
	}
	
	//Constructor con atributos
	public Producto(String nombre, double precio) {		
		this.nombre=nombre;
		this.precio=precio;	
	}

	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	//Metodo toString	
	public String toString() {
		String todo = "Nombre: "+nombre+"\nPrecio: "+precio;
		return todo;	
	}

	//Metodo calcular
	public double calcular(int cantidad) {
		double total = precio * cantidad;
		return total;
	}
	
	
}
