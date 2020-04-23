//Marc Naval Lloret
package Ejercicio_7;

public class Operacion {

	protected int num1, num2, num3, resultado;
	protected char operacion;
	
	public Operacion(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void mostrarResultado(){
		System.out.println(num1+" " +operacion+ " " +num2+ " = " +resultado);
	}
}
