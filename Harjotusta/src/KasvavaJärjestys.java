import java.util.Scanner;
import java.util.ArrayList;

//import java.util.List;
public class KasvavaJärjestys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		ArrayList<Integer> lukuja = new ArrayList<>();
		
		System.out.println("Syötä kymmenen kokonaislukua: ");
		int luvut = lukija.nextInt();

		int eka = lukuja.get(0);
		int toka = lukuja.get(1);
		
		if (eka > toka) {
			System.out.println("Luvut ovat epäjärjestyksessä.");
		}	
		else {
		
			System.out.println("Luvut ovat kasvavassa järjestyksessä tai laskevassa järjestyksessä.\"");
		}
	}

}