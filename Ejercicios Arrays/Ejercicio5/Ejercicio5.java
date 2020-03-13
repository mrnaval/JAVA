//Marc Naval Lloret

package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int grande=0;
		int posicion=0;
		String[] empleado=new String[10];
		int[] sueldo=new int[10];
		
		
		
		
		for(int cont=0; cont<10; cont++) {
			System.out.print("Introduzca el nombre del empleado: ");
			empleado[cont]=sc.next();
		}
				 
		for(int cont=0; cont<10; cont++) {
			System.out.print("Introduzca el sueldo de " +empleado[cont]+ ": ");
			sueldo[cont]=sc.nextInt();
			
			if (sueldo[cont] > grande) {
				grande=sueldo[cont];
				posicion=cont;
			}
		}
		
		System.out.print("El empleado con el sueldo más alto es " +empleado[posicion]+ " y cobra "+sueldo[posicion]);
		sc.close();
	}

}
