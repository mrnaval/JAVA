//Marc Naval Lloret

package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[20];
		for(int cont = 0;cont < 20;cont++) {
			System.out.print("Introduce un numero: ");
			num[cont]=sc.nextInt();
		}
		System.out.print("Los siguientes numeros que has introducido son pares");
		for (int cont = 0;cont < 20;cont++) {
			if ((num[cont] % 2) == 0) {
				System.out.println(num[cont]);
			}
		}
	}
}
