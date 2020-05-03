/**
*	@author Marc Naval Lloret
*/
package Ejercicio_2;

public abstract class Publicacion implements Interfaz_Pu{	//Esta es la clase abstracta Padre y tiene implementada una interfaz.

	
	/** @Atributos */
	int codigo;
	int año;
	boolean prestado = false;	//prestado lo declaramos false, es boolean porque queremos que nos devuelva true o false.
	
	
	/** @Getters y @Setters */
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	/** @Metodos */
	public void prestar() {		//Este método void devuelve true si las revistas o libros están prestados.
		prestado = true;
	}
	
	public void devolver() {	//Este método void devuelve false si han devuelto las revistas o libros.
		prestado = false;
	}

	public boolean prestado() {		//Este método devuelve la informacion (true o false) que hay en el atributo prestado.
		return prestado;
	}
	
	
	@Override
	public String toString() {		//El método toString sobreescribe o muestra los atributos codigo, año y prestado.
		String all = "\nCodigo: " +codigo+ "\nAño de publicacion: " +año+ "\nPrestado: " +prestado; 
		return all;
	}
	
	
	
	
	
	
	
	
	

	
	
}
