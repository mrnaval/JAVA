//Marc Naval Lloret
package clases;

import java.util.Scanner;

public class Profesor extends MiembroUPV{

	private String despacho;
	private String horarioTutorias;
	private int nomina;
	
	//Constructores
	public Profesor() {
		
	}
	public Profesor(String nombre, String despacho) {
		this.nombre = nombre;
		this.despacho = despacho;
		
	}
	
	public Profesor(String nombre, String despacho, int nomina) {
		this.nombre = nombre;
		this.despacho = despacho;
		this.nomina = nomina;
	}
	
	//Getters y Setters
	public int getNomina() {
		return nomina;
	}

	public void setNomina(int nomina) {
		this.nomina = nomina;
	}
	
	public void getConsultas() {
		System.out.println(nombre+ " tiene tutoria los " +horarioTutorias+ " en " +despacho);
	}
	
	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorarioTutorias() {
		return horarioTutorias;
	}

	public void setHorarioTutorias(String horarioTutorias) {
		this.horarioTutorias = horarioTutorias;
	}
	
	
	@Override public void menuIntranet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al menú Intranet profesor, seleccione la operación que desee hacer: \n 1) Ver la información del profesor \n 2) Ver nómina del profesor \n 3) ¿A qué actividades deportivas desea apuntarse? \n 4) SALIR");
		switch (sc.nextInt()) {
			case 1:
				System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nDespacho: "+despacho+"\nHorario: "+horarioTutorias);
				break;
			case 2:
				System.out.println("Nomina: "+nomina);
				break;
			case 3:
				System.out.println("Introduce a que actividades deseas apuntarte");
				sc.nextLine();
				sc.nextLine();
				break;
			case 4:
				System.out.println("HASTA LUEGO!\nGracias por utilizar la Intranet de profesor");
				break;
			}
		}
	
}
