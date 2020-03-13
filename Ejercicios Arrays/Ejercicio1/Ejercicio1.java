//Marc Naval Lloret

package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 int n;
		 int pos = 0, neg = 0;
		 int[]num = new int[10];
		 double sumaPos = 0, sumaNeg = 0;
		 
		 for (n=0; n<num.length; n++) {
			 System.out.println("Introduzca 1 número: ");
			 num[n]=sc.nextInt();
		 }
		 
		 for (n=0; n<num.length; n++) {
			 if (num[n] > 0){
				 sumaPos += num[n];
		         pos++;
		     } else if (num[n] < 0){
		    	 sumaNeg += num[n];
		         neg++;
		     }
		  }
		 
		 if (pos != 0) {
	            System.out.println("Media de los números positivos: " + sumaPos / pos);
	        } else {
	            System.out.println("No ha introducido números positivos");
	        }
	        if (neg != 0) {
	            System.out.println("Media de los números negativos: " + sumaNeg / neg);
	        } else {
	            System.out.println("No ha introducido números negativos");
	        }
	    }
	}
