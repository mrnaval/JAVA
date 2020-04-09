//Marc Naval Lloret
package Ejercicio_5;

public class Perecedero extends Producto{
	
	//Atributos
	int diasACaducar;
	
	
	//Constructor por defecto
	public Perecedero() { 
	}
	
	//Constructor con parámetros
	public Perecedero(String nombre, double precio, int dias) {
		super(nombre, precio);
		diasACaducar = dias;
	}
	
	
	//Getters y Setters
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	
	//Metodo calcular (Utilizamos un switch)
	@Override 
	public double calcular(int cantidad) {
		double total = super.calcular(cantidad);
		switch (diasACaducar) {
			case 1:
		  		total = total/4;
		  		break;
		  	case 2:
		  		total = total/3;
		  		break;
		  	case 3:
		  		total = total/2;
		  		break;
		  	default:
		  		break;
		}
		return total;
	}
}

