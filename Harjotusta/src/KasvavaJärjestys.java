import java.util.Scanner;
import java.util.ArrayList;

//import java.util.List;
public class KasvavaJ�rjestys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		ArrayList<Integer> lukuja = new ArrayList<>();
		
		System.out.println("Sy�t� kymmenen kokonaislukua: ");
		int luvut = lukija.nextInt();

		int eka = lukuja.get(0);
		int toka = lukuja.get(1);
		
		if (eka > toka) {
			System.out.println("Luvut ovat ep�j�rjestyksess�.");
		}	
		else {
		
			System.out.println("Luvut ovat kasvavassa j�rjestyksess� tai laskevassa j�rjestyksess�.\"");
		}
	}

}