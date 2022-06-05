import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousv�hennys {
    public static void main(String[] args) {
       	double summa = 0; 
    	double korvaus;
    	double omavastuu;
    	//int lkm = 0;
    	
    	Scanner input = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.0");
    	
    	System.out.print("Anna ty�korvauksen m��r� (0 lopettaa): ");
    	korvaus = input.nextDouble();
    	
    	while (korvaus > 0) { 	
    		summa = summa + korvaus;
    		
    		System.out.print("Anna ty�korvauksen m��r� (0 lopettaa): ");
    		korvaus = input.nextDouble();

    	}
    	
    	omavastuu = ((summa * 50) / 100) - 100;
    	
		korvaus = (double) omavastuu;
    	DecimalFormat desi = new DecimalFormat("0.00");
    	
    	System.out.println("Kotitalousv�hennyksen m��r� on " + desi.format(korvaus) + " euroa");
    	}

}