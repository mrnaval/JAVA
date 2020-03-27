//Marc Naval Lloret
public class Ejercicio8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase, auxiliar="";
		System.out.println("Introduzca la frase a analizar");
		Scanner sc=new Scanner(System.in);
		frase=sc.nextLine();
				
		int contador = 1, pos;
		frase = frase.trim(); 
		
		if (frase.isEmpty()) {
	        contador = 0;
		} 
		else {
			pos = frase.indexOf(" "); 
	       while (pos != -1) { 
	        	contador++; 
	            pos = frase.indexOf(" ", pos + 1); 
	        }                                               
		}
		
		System.out.println("La frase intruducida, "+ frase + ",  contiene "+ contador +" palabras");
	}
}