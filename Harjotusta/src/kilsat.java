import java.text.DecimalFormat;
import java.util.Scanner;

public class kilsat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.0");
		
		double summa = 0; 
    	double korvaus;
    	double omavastuu;
 
    	
    	
    	
    	System.out.print("Anna tyˆkorvauksen m‰‰r‰ (0 lopettaa): ");
    	korvaus = input.nextDouble();
    	
    	while (korvaus > 0) { 	
    		summa = summa + korvaus;
    		
    		System.out.print("Anna tyˆkorvauksen m‰‰r‰ (0 lopettaa): ");
    		korvaus = input.nextDouble();
		}
			
    
    	omavastuu = ((summa * 50) / 100) - 100;
    	if(omavastuu <= 0){
			System.out.print("Kotitalousv‰hennyksen m‰‰r‰ on 0,00 euroa ");
			}
			if(korvaus >= 2400) {
			System.out.print("Kotitalousv‰hennyksen m‰‰r‰ on 2400,00 euroa");
			
			} else {
    	
		korvaus = (double) omavastuu;
    	DecimalFormat desi = new DecimalFormat("0.00");
    	
    	System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on " + desi.format(korvaus) + " euroa");
    	}
	}
	}