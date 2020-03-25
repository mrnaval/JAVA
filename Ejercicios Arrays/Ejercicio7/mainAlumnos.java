package Ejercicio7;

public class mainAlumnos {

public static void main(String[] args) {
		
	Notas n1 = new Notas();
	Notas n2 = new Notas();
	n1.leer();
	
	
	Alumnos a1 = new Alumnos("Marc", 20497, n1);
	Alumnos a2 = new Alumnos();
	
	
	System.out.println("");
	
	
	n2.leer();
	a2.setNotasAlumnos(n2);
	a2.setNombre("Marc");
	a2.setNumExp(97204);
	
	
	System.out.println(a1.toString());
	System.out.println(a2.toString());
	
	}
}
