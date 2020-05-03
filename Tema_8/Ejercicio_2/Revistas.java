/**
*	@author Marc Naval Lloret
*/
package Ejercicio_2;

public class Revistas extends Publicacion{		//Esta es la clase Hija Revistas y hereda de Publicacion.

	
	/** @Atributos */
	int numero;
	
	
	/** @Contructores */
	public Revistas() {		//Contructor por defecto
		
	}
	
	public Revistas(int codigo, int año, boolean prestado, int numero) {		//Constructor con parámetros 
		this.codigo = codigo;
		this.año = año;
		this.prestado = prestado; 
		this.numero = numero;
	}
	

	/** @Getters y @Setters */
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	//Metodos
	@Override
	public String toString() {		//Este método toString hereda los atributos (codigo, año y prestado) de la superclase y muestra el atributo numeros de la clase hija Revista.
		String all = super.toString();
		all = all +  "\nNumero: " +numero;
		return all;
	}
	
	
	
}
