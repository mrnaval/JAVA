//Marc Naval Lloret
package Ejercicio_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e = new Empleado("Marc", "12345678W", 18, false, 1100);
		
		Programador p = new Programador("Pepe", "87654321X", 23, true, 2000, 500, "Java y SQL");
		
		
		e.mostrarDatos();
		System.out.println();
		
		p.mostrarDatos();
		System.out.println("Líneas: "+p.getLineas()+"\nLenguaje: "+p.getLenguaje());
	}

}
