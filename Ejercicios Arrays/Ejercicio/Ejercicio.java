package Ejercicio;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double [] temperatura = new double[10];
		int i;
		for(i = 0; i<temperatura.length;i++){
		System.out.print("Elemento " + i + ": ");
		temperatura[i] = sc.nextDouble();
		}
		for(double t: temperatura){
		System.out.print(t + " ");
		}
		System.out.println();
	}

}
