package Ejercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] num = new double[10];
		
		for (int cont=0; cont<10; cont++) {
			float numeroAleatorio = (float) (Math.random()*1);
			num[cont]=numeroAleatorio;
			System.out.println("El numero aleatorio " +cont+ " = " +num[cont]);
		}
	}
}
