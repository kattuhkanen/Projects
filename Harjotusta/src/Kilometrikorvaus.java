import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
    public static void main(String[] args) {
    	int summa = 0; 
    	int kilometrit; 
    	//int lkm = 0;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
    	kilometrit = input.nextInt();
    	
    	while (kilometrit > 0) { 	
    		summa = summa + kilometrit;
    		
    		System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
    		kilometrit = input.nextInt();

    	}
    	
    	int keskiarvo = summa;
    	System.out.println("Yhteensä " + keskiarvo + " kilometriä");
    	
		double korvaus = (double) keskiarvo * 0.43;
    	DecimalFormat desi = new DecimalFormat("0.00");
    	
    	System.out.println("Korvaus on " + desi.format(korvaus) + " euroa");
    	}

}

