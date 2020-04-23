//Marc Naval Lloret
package Ejercicio_7;

public class resta extends Operacion{

	int resta = num1 - num2;
	
	public resta(int num1, int num2) {
		super(num1, num2);
		operacion = '-';
		resultado = resta;
	}
}
