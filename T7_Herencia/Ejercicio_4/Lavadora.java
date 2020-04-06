//Marc Naval Lloret
package Ejercicio_4;

public class Lavadora extends Electrodomesticos{

	//Atributos
	float carga;
	
	
	//Constructor por defecto
	public Lavadora() {
		super();
		carga = 5;
	}
	
	//Constructor con los parámetros precioBase y peso
	public Lavadora(float precioBase, float peso) {
		super(precioBase, peso);
		this.carga = 5;
	}
	
	//Constructor con todos los parámetros
	public Lavadora(String color, char consumoEnergetico, float precioBase, float peso, float carga) {
		super(color, consumoEnergetico, precioBase, peso);
		this.carga = carga; 
	}

	
	//Getters y Setters
	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}
	
	
	//Método precioFinal (Calcula el precio del producto)
	@Override public double precioFinal() {
		double precio = super.precioFinal();
		
		if (carga >= 30) {
			precio = precio + 50;
		}
		return precio;
	}
		
}
