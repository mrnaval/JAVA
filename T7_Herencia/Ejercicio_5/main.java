//Marc Naval Lloret
package Ejercicio_5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1 = new Producto("Gafas", 20);
		Producto p2 = new Producto("Boligrafo", 1);
		
		Perecedero p3 = new Perecedero("Tomates", 5, 3);
		Perecedero p4 = new Perecedero("Manzanas", 2, 1);
		
		NoPerecedero p5 = new NoPerecedero("Orégano", 150, 5);
		
		Producto[] Productos = new Producto[5];
		Productos[0] = p1;
		Productos[1] = p2;
		Productos[2] = p3;
		Productos[3] = p4;
		Productos[4] = p5;
		
		for (int i = 0;i < 5;i++) {
			System.out.println("Producto "+ (i+1));
			System.out.println(Productos[i].calcular(5));
		}
	}
}