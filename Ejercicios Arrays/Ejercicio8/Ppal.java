//Marc Naval Lloret
package Ejercicio8;

public class Ppal {

	public static void main(String[] args) {
		
		Estacion e1=new Estacion();
			e1.setMes("Enero");
			e1.setAnyo(2018);
		
		Temperatura t1=new Temperatura(e1);
			t1.leer();
			e1.setTemp(t1);
		
			
		System.out.println(e1.toString());
	}
}
