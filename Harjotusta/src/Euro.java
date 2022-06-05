import java.util.Scanner;

public class Euro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Syötä jokin markkamäärä:");
		int maara = lukija.nextInt();
		
		double markka = 5.94573;
		double euroina =  (double)maara / markka;
		
		System.out.println("Markat euroina: " + euroina);
	
	}

}
