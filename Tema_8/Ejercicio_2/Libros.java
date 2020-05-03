/**
*	@author Marc Naval Lloret
*/
package Ejercicio_2;

public class Libros extends Publicacion { 		//Esta es la clase Hija Libros y hereda de Publicacion.
	
	/** @Atributos */
	String autor;
	
	
	/** @Contructores */
	public Libros() {		//Contructor por defecto
		
	}
	
	public Libros(int codigo, int año, boolean prestado, String autor) {		//Constructor con parámetros 
		this.codigo = codigo;
		this.año = año;
		this.prestado = prestado; 
		this.autor = autor;
	}

	
	/** @Getters y @Setters */
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	/** @Metodos */
	@Override
	public String toString() {		//Este método toString hereda los atributos (codigo, año y prestado) de la superclase y muestra el atributo autor de la clase hija Libros. 
		String all = super.toString();
		all = all +  "\nAutor: " +autor;
		return all;
	}
	
	
}
