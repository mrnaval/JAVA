//Marc Naval Lloret
package Ejercicio_7;

public class division extends Operacion{

	int division = num1 / num2;
	
	public division(int num1, int num2) {
		super(num1, num2);
		operacion = '/';
		resultado = division;
	}
}
