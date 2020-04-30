//Marc Naval Lloret
package clases;

public class Persona {

	//Atributos
	protected int edad;
	protected String nombre;
	protected Coche coche;

	//Contructores
	public Persona() {
		
	}
	
	public Persona(int edad) {
		this.edad=0;
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
		
	}
	
	public Persona(String nombre, int edad) {		
		this.nombre = nombre;		
		this.edad = edad;			
	}
	
	
	//Getters y Setters
	public int getEdad() {
		return edad;
	}
		
	public String getNombre() {
		return nombre;	
	}
	
	public void setEdad(int edad) {
		this.edad = edad; 
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
}


