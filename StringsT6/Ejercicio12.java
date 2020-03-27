//Marc Naval Lloret
package StringsT6;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		String linea="";
		Boolean Palindrom=true;
		
		System.out.print("Introduce una frase: ");
		linea = sc.nextLine().toLowerCase();
		linea = linea.trim();
		
		for(int cont=0, cont2=linea.length()-1; cont<linea.length();cont++, cont2--) {
			if (linea.charAt(cont) == linea.charAt(cont2)) {
				Palindrom=true;
			}else Palindrom=false;
		}
		
		if (Palindrom==true) {
			System.out.print("La palabara " +linea+ " es capicua.");
		}
		else System.out.print("La palabara " +linea+ " no es capicua.");
		sc.close();	
	}

}
