//Marc Naval Lloret
package StringsT6;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		String linea = "";
		
		System.out.print("Escriba una frase: ");
		linea=sc.nextLine();
		linea=linea.trim();
		
		String[] palabras = linea.split(" ");
		
		System.out.print("La frase sin la última palabra:\n");
		
		for(int cont=0; cont<(palabras.length-1); cont++) {
			System.out.print(palabras[cont]+" ");
		}
		sc.close();
	}
}
