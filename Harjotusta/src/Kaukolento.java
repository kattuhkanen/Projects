import java.util.Scanner;
public class Kaukolento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		 String lento = "zz105";

		 System.out.println("Anna lennon numero: ");
		 String lennonNumero = input.next();
		 
	        boolean finnairinLento = lento.startsWith("ay");
	        boolean venaja = lento.startsWith("ay7");
	        // Kolme eri tapaa tarkastaa sama ehto:

	        if (finnairinLento == false) {
	            System.out.println("Ei ole finnairin lento.");
	        
	        }
	        else if (venaja == true) {
	        	System.out.println("Ei ole finnairin lento.");
	        }
	        	else 
	        	System.out.println("Tämä ei ole finnairin lento");
	        }
	    }
	

