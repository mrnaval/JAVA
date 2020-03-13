//Marc Naval Lloret

package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int pos = 0; 
        int neg = 0; 
        int cero = 0;
        int i;
        int[] numeros = new int[10];
        
        
        System.out.println("Este programa muestra por pantalla cuántos números negativos, positivos y cuántos 0 hay en el array: ");
        
        for (i = 0; i < numeros.length; i++) {
            System.out.print("números[" +i+ "]= ");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        System.out.println(" ");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
	}

}
