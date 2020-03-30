//Marc Naval Lloret
package Ejercicio_0;

public class Estudiante extends Persona{

	//Atributos
	private int numExp;
	private String curso;
	private double notas[] = new double[7];
	
	//Contructores
	public Estudiante(String nombre, String curso, int numExp) {
		this.nombre = nombre;
		this.curso = curso;
		this.numExp = numExp;			
	}
	
	//Getters y Setters
	public int getNumExp() {
		return numExp;
	}
	
	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getNotaMedia() {
		double media=0;
		
		for (int cont=0; cont<notas.length; cont++) {
			media = media + notas[cont];
		}
		media = media/7;
		return media;
	}
	
}
