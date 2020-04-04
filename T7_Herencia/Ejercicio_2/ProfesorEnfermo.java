//Marc Naval Lloret
package Ejercicio_2;

import Ejercicio_0.Profesor;

public class ProfesorEnfermo extends Profesor{
	
	public ProfesorEnfermo() {
		
	}
	
	public @Override void getConsultas() {
		System.out.println("El profesor está enfermo. Se suspenden las consultas hasta que se recupere. Disculpe las molestias.");
	}
		
}

