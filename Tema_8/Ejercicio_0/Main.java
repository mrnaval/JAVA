package clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante e = new Estudiante("Pepe", "1ºDAM", 12345);
		e.setEdad(20);
		e.menuIntranet();
		double[] notas = new double[7];
		notas[0] = 7;
		notas[1] = 8.5;
		notas[2] = 4;
		notas[3] = 8;
		notas[4] = 6;
		notas[5] = 7.5;
		notas[6] = 5;
		e.setNotas(notas);
		
		Coche c = new Coche();
		c.setMarca("Renault");
		c.setModelo("Clio");
		c.setColor("Rojo");
		
		Profesor p = new Profesor("Juan", "D104");
		p.setNomina(1000);
		p.setEdad(45);
		p.setHorarioTutorias("Lunes de 10:00 a 13:00");
		p.menuIntranet();
		
		Coche c1 = new Coche();
		c1.setMarca("Opel");
		c1.setModelo("Corsa");
		c1.setColor("Blanco");
		
		System.out.println(e.nombre+" tiene un "+e.getNotaMedia()+" de media");
		p.getConsultas();

	}

}
