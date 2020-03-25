//Marc Naval Lloret
package Ejercicio7;

import java.util.Scanner;

public class Notas {
	
	
	//Atributos
	private Scanner sc = new Scanner(System.in); 
	private double[] notas = new double[5];
		
	
	//Constructores
	public Notas() {
			
	}
	
	
	public void leer() {
		for (int cont = 0;cont < notas.length;cont++) {
			System.out.print("Nota asignatura "+(cont+1)+": ");
			notas[cont] = sc.nextDouble();
		}
	}
		
	
	public double media() {
		double media = 0;
		for (int cont = 0;cont < notas.length;cont++) {
			media = notas[cont] + media;
		}
		media = media / notas.length;
		return media;
	}
	
	
	public String mostrar() {
		String todo = "";
		for (int cont = 0;cont < notas.length;cont++) {
			 todo = todo + ("\nNota asignatura "+(cont+1)+": "+notas[cont]);
		}
		return todo;
	}
	
}
