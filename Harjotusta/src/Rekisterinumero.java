import java.util.Scanner;

public class Rekisterinumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		while (true) {
		System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");

		String syöte = input.nextLine();
		if (syöte.equals("q")) {
			break;
		} else { 
		
		if (syöte.matches("[\\w\\-äöåÄÖÅ]{2,3}\\-\\d{1,3}$")) {
			System.out.println(syöte + " on kelvollinen rekisterinumero.");
			
	} else {
		System.out.println(syöte + " ei ole kelvollinen rekisterinumero.");
	}

	}
}
	}
}