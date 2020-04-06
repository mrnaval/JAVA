package Ejercicio_4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioE = 0;		//Precio de Electrodomesticos			 
		double precioL = 0;		//Precio de Lavadora
		double precioT = 0; 	//Precio de Television
		
		
		/* Variables de la clase padre Electrodomesticos: 
		 * String color, char consumoEnergetico, float precioBase, float peso */
		Electrodomesticos E1 = new Electrodomesticos();
		Electrodomesticos E2 = new Electrodomesticos(500, 50);
		Electrodomesticos E3 = new Electrodomesticos("negro", 'B', 200, 80);
		Electrodomesticos E4 = new Electrodomesticos("gris", 'A', 100, 45);
		
		/* Variables de la clase hijo Lavadora: 
		 * String color, char consumoEnergetico, float precioBase, float peso, float carga*/
		Lavadora L1 = new Lavadora();
		Lavadora L2 = new Lavadora(200, 70);
		Lavadora L3 = new Lavadora("gris", 'A', 100, 45, 20);
		
		/* Variables de la clase hijo Television:
		 * String color, char consumoEnergetico, float precioBase, float peso, float resolucion, boolean smartTV*/
		Television T1 = new Television();
		Television T2 = new Television(45, 20);
		Television T3 = new Television("gris", 'A', 200, 55, 55, true);
		
		Electrodomesticos[] Electrodomesticos = new Electrodomesticos[10];
		Electrodomesticos[0] = E1;
		Electrodomesticos[1] = E2;
		Electrodomesticos[2] = E3;
		Electrodomesticos[3] = E4;
		Electrodomesticos[4] = L1;
		Electrodomesticos[5] = L2;
		Electrodomesticos[6] = L3;
		Electrodomesticos[7] = T1;
		Electrodomesticos[8] = T2;
		Electrodomesticos[9] = T3;
		
		
		//Muestra la suma total de esa clase
		for (int i=0; i < 10; i++) {
			System.out.println("-Producto " +(i+1)+ ":");
			if (Electrodomesticos[i] instanceof Electrodomesticos) {
				precioE = precioE + Electrodomesticos[i].precioFinal();
			}
			if (Electrodomesticos[i] instanceof Lavadora) {
				precioL = precioL + Electrodomesticos[i].precioFinal();
			}
			if (Electrodomesticos[i] instanceof Television) {
				precioT = precioT + Electrodomesticos[i].precioFinal();
			}
			System.out.println(Electrodomesticos[i].precioFinal());
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("El precio total de los Electrodomesticos es: " +precioE+ " € (Total)");
		System.out.println("El precio total de las Lavadoras es: " +precioL+ " €");
		System.out.println("El precio total de los TVs es: " +precioT+ " €");
	}

}