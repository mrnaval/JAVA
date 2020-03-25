//Marc Naval Lloret
package Ejercicio8;

public class Estacion {
	
	private int anyo;
	private String nombreMes;
	private Temperatura temperaturas;
	
	public Estacion() {
		
	}
	
	public Estacion(String nombreMes, int anyo, Temperatura temperaturas) {
		this.nombreMes=nombreMes;
		this.anyo=anyo;
		this.temperaturas=temperaturas;
	}

	public String toString() {
		String todo = "";
		double media = temperaturas.media();
		todo = "\n\nFecha: " + nombreMes + " " + anyo + "\n\n";
		todo = todo + "------ Temperaturas ------";
		todo = todo + media + "\n";
		todo = todo + temperaturas.mostrar();
		todo = todo + "\n\nTemperatura máxima: "+temperaturas.maxima()+"\nTemperatura mínima: "+temperaturas.maxima();
		return todo;
	}
	
	public String getMes() {
		return nombreMes;
	}

	public void setMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public Temperatura getTemp() {
		return temperaturas;
	}

	public void setTemp(Temperatura temperaturas) {
		this.temperaturas = temperaturas;
	}
}