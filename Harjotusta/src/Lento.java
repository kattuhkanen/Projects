import java.util.Scanner;
public class Lento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		

		 System.out.println("Anna lennon numero: ");
		 String lento = input.nextLine();
		 
		
	     String lennonalkuKirjaimetAY = lento.substring(0,2);
		String numerotLento = lento.substring(2,3);
		int numero = Integer.parseInt(numerotLento);

	        if (!lennonalkuKirjaimetAY.equalsIgnoreCase("ay")) {
	            System.out.println("Ei ole finnairin lento");
	        
	        }
		 	else if (numero == 1) {
	            System.out.println("Kaukolento");
				
	
		 
	        }
		 	else if (numero == 7) {
	            System.out.println("Venäjän lento");
	        
	        } 
	        
		else if (numero >= 2 && numero <= 6) {
	            System.out.println("Kotimaan lento");
	        
	        }
	} 

}
