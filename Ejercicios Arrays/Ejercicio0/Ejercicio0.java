//Marc Naval Lloret

package Ejercicio0;

import java.util.Scanner;

public class Ejercicio0 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0, neg = 0; 
        int[] temperatura = new int[10]; 
        double tempPos = 0, tempNeg = 0; 
        
        System.out.println("Introduzca 10 temperaturas enteras: ");
        for (i = 0; i < 10; i++) {
            System.out.print("temperaturas[" + i + "]= ");
            temperatura[i]=sc.nextInt();
        }

       
        for (i = 0; i < 10; i++) {
            if (temperatura[i] > 0){ 
            	tempPos += temperatura[i];
                pos++;
            } else if (temperatura[i] < 0){
            	tempNeg += temperatura[i];
                neg++;
            }
        }

        
        if (pos != 0) {
            System.out.println("Media de la temperatura positiva: " + tempPos / pos);
        } else {
            System.out.println("No ha introducido temperatura positiva");
        }
        if (neg != 0) {
            System.out.println("Media de la temperatura negativa: " + tempNeg / neg);
        } else {
            System.out.println("No ha introducido temperatura negativa");
        }
    }
}

