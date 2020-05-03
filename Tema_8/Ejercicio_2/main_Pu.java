/**
*	@author Marc Naval Lloret
*/
package Ejercicio_2;

public class main_Pu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prestados = 0;
		
		//Introducimos los datos
		Revistas r1 = new Revistas(012345, 2020, true, 01);
		Revistas r2 = new Revistas(123456, 2019, false, 02);
		Revistas r3 = new Revistas(234567, 2018, true, 03);
		Revistas r4 = new Revistas(345678, 2017, false, 04);
		
		Libros l1 = new Libros(012345, 1954, true, "El Señor de los Anillos I");
		Libros l2 = new Libros(123456, 1954, false, "El Señor de los Anillos II");
		Libros l3 = new Libros(234567, 1955, true, "El Señor de los Anillos III");
		Libros l4 = new Libros(345678, 1930, true, "El hobbit");
		
		//Este es el array de publicaciones que guardara los datos introducidos anteriormente.
		Publicacion[] p1 = new Publicacion[8];
		p1 [0] = r1;
		p1 [1] = r2;
		p1 [2] = r3;
		p1 [3] = r4;
		p1 [4] = l1;
		p1 [5] = l2;
		p1 [6] = l3;
		p1 [7] = l4;
		
		
		//Este for es para ejecutar el array
		for(int i=0; i<p1.length; i++) {
			System.out.println(p1[i].toString());
			
			if (p1[i].prestado() == true) {
				prestados++;
			}
		}
	
		System.out.println(" ");		//para mostrar una linea en blanco
		System.out.println("******************************** "); 	//para separar
		System.out.println(" ");		//para mostrar una linea en blanco
		
		System.out.println("Libros prestados: " +prestados);	//Imprime los libros que estan prestados
	}

}
