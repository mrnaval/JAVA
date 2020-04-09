//Marc Naval Lloret
package Ejercicio_5;

public class NoPerecedero extends Producto {
	
	//Atributos
	int tipo;
	
	
	//Constructor por defecto
	public NoPerecedero() { 
	}
	
	//Constructor con parametros
	public NoPerecedero(String nombre, double precio, int tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	
	//Getters y Setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	//Metodo calcular
	@Override 
	public double calcular(int cantidad) {
		  double total = super.calcular(cantidad);
		  return total;
	}
}