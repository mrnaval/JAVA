//Mar Naval Lloret
package Ejercicio_6;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado("Salva", 18, 2);
		Repartidor e2 = new Repartidor("Sergi", 18, 3, "Zona 1");
		Comercial e3 = new Comercial("Sergio", 30, 50, 200);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		e1.plus();
		e2.plus();
		e3.plus();
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}

}
