import java.util.Scanner;
import java.text.DecimalFormat;

public class Tuotteet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		
		int tuotenumero;
		String nimi;
		double hinta;
		String kuvaus;
		//double muotoilu;
		
		System.out.println("Anna tuotenumero: ");
		tuotenumero = input.nextInt();
		System.out.println("Anna tuotteen nimi: ");
		nimi = input.next();
		System.out.println("Anna tuotteen hinta: ");
		hinta = input.nextDouble();
		System.out.println("Anna tuotteen kuvaus: ");
		kuvaus = input.next();
		
		
		System.out.println("");
		
		System.out.println("Numero: " + tuotenumero);
		
		nimi = nimi.toUpperCase(); 
		nimi = nimi.trim();
		System.out.println("Nimi: " + nimi);
		
		String muotoiltu = kaksiDesimaalia.format(hinta);
		DecimalFormat desi = new DecimalFormat("0.00");
		System.out.println("Hinta: " + muotoiltu);
		
		kuvaus = kuvaus.trim();
		System.out.println("Kuvaus: " + kuvaus);
		}

}