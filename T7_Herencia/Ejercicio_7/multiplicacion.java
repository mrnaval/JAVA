//Marc Naval Lloret
package Ejercicio_7;

public class multiplicacion extends Operacion{

	int multiplicacion = num1 * num2;
	
	public multiplicacion(int num1, int num2) {
		super(num1, num2);
		operacion = '*';
		resultado = multiplicacion;
	}
}
