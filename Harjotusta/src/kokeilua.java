import java.text.DecimalFormat;
import java.util.Scanner;

public class kokeilua {
    public static void main(String[] args) {
    	double summa = 0; 
    	double kilometrit; 
    	//int lkm = 0;
    	
    	Scanner input = new Scanner(System.in);
    	DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
    	
    	System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
    	kilometrit = input.nextDouble();
    	
    	while (korvaus > 0) { 	
    		summa = summa + kilometrit;
    		
    		System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
    		korvaus = input.nextInt();

    	}
    	
    	int korvaus;
    	
    	if (korvaus < 0) {
    		System.out.println("Korvaus on 0,00 euroa");}
    	if (korvaus >= 2400) {
    		System.out.println("Korvaus on 2400,00");
    		
    } else {
    	
    	double keskiarvo = ((summa * 50) / 100) - 100;
    	//* 50 / 100.0 - omavastuu
    	
		double korvauss = (double) keskiarvo;
    	DecimalFormat desi = new DecimalFormat("0.00");
    	System.out.println("Korvaus on " + desi.format(korvauss) + " euroa");
    	}

}
}
