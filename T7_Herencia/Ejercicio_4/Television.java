//Marc Naval Lloret
package Ejercicio_4;

public class Television extends Electrodomesticos{

	//Atributos
	float resolucion;
	boolean smartTV;
	
	
	//Constructor por defecto
	public Television() {	
		super();
		resolucion = 20;
		smartTV = false;
	}
	
	//Constructor con los parámetros precioBase y peso
	public Television(float precioBase, float peso) {
		super(precioBase, peso);
		resolucion = 20;
		smartTV = false;
	}
	
	//Constructor con todos los parámetros
	public Television(String color, char consumoEnergetico, float precioBase, float peso, float resolucion, boolean smartTV) {
		super(color, consumoEnergetico, precioBase, peso);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}
	
	
	//Getters y Setters
	public float getResolucion() {
		return resolucion;
	}

	public void setResolucion(float resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}

	
	//Método precioFinal (Calcula el precio del producto)
	@Override public double precioFinal() {
		double precio = super.precioFinal();
		if (resolucion >= 40) {
			precio = precio*1.30;
		}
		if (smartTV == true) {
			precio = precio + 50;
		}
		return precio;
	}
}

