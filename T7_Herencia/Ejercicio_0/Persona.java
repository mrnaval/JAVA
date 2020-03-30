//Marc Naval Lloret
package Ejercicio_0;

public class Persona {

	//Atributos
	private int edad;
	protected String nombre;
	
	//Contructores
	public Persona() {
		this.nombre = "";	//Si no se recibe el nombre se deja en nulo
		this.edad = 18; 	//*(edad por defecto)* Si el programa solo acepta personas que tengan una edad major que 18 años
		
	}
	
	public Persona(String nombre, int edad) {		//si nos dan el nombre los apellidos y la edad
		this.nombre = nombre;		//nombre es igual al nombre que estoy recibiendo
		this.edad = edad;			//edad es igual a la edad que estoy recibiendo
	}
	
	public Persona(String nombre, int edad, String id) {		//hacer una persona si me pasan todos los campos			
		this.nombre = nombre;		
		this.edad = edad;			
	}
	
	//Métodos
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
	
	
}


