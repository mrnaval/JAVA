//Marc Naval Lloret
package Ejercicio_4;

public class Electrodomesticos {

	//Atributos
	protected String color;
	protected char consumoEnergetico;
	protected float precioBase;
	protected float peso;
	
	
	//Constructor por defecto
	public Electrodomesticos() {
		color = "blanco";				//Colores: blanco, negro, rojo, azul y gris 	
		consumoEnergetico = 'F';		//Letras entre A y F
		precioBase = 100;
		peso = 5;
	}
	
	//Constructor con los parámetros precioBase y peso
	public Electrodomesticos(float precio, float peso) {
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.precioBase = 100;
		this.peso = 5;
	}
	
	//Constructor con todos los parámetros
	public Electrodomesticos(String color, char consumoEnergetico, float precioBase, float peso) {
		this.color=color;
		this.consumoEnergetico = consumoEnergetico;
		this.precioBase=precioBase;
		this.peso=peso;
	}

	
	//Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getconsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setconsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	//Metodos para comprovar el Consumo y el color
	private void comprobarConsumo(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'F') {
			consumoEnergetico = letra;
		}else consumoEnergetico = 'F';
	}
	
	private void comprobarColor(String color) {
		if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
			this.color=color;
		}else this.color = "blaco";
	}
	
	//Método precioFinal (Calcula el precio del producto)
	public double precioFinal() {
		double precio = 0;
		
		switch (consumoEnergetico) {
			
			case 'A':
				precio = precio + 100;
				break;
				
			case 'B':
				precio = precio + 80;
				break;
			
			case 'C':
				precio = precio + 60;
				break;
				
			case 'D':
				precio = precio + 50;
				break;
				
			case 'E':
				precio = precio + 30;
				break;
				
			case 'F':
				precio = precio + 10;
				break;
		}
		
		if (precio <= 19) {
			precio = precio + 10;
		}
		if (precio >= 20  &&  precio <= 49) {
			precio = precio + 50;
		}
		if (precio >= 50  &&  precio <= 79) {
			precio = precio + 80;
		}
		if (precio >= 79) {
			precio = precio + 100;
		}
		return precio;
	}
	
}
