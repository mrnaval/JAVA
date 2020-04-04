package Ejercicio_2;

public class main {

	public static void main(String[] args) {
		
		Profesor p = new Profesor("Fernando", "D104");
		p.setEdad(45);
		p.setHorarioTutorias("Lunes de 10:00 a 13:00");
		ProfesorEnfermo pe = new ProfesorEnfermo();
		p.getConsultas();
		pe.getConsultas();
	}

}
