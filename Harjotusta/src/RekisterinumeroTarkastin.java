import java.util.Scanner;

public class RekisterinumeroTarkastin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String syöte = "";
		
		while (true) {
		System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
		syöte = input.nextLine();
		if(syöte.equals("q")) {
			break;
		} else { 
		
		if(syöte.matches("[\\w\\-äöåÄÖÅ]{2,3}\\-\\d{1,3}$")) {
			System.out.println(syöte + " on kelvollinen rekisterinumero./n");
				//Syötä rekisterinumero (q-kirjain lopettaa): JAV-4
				//JAV-4 on kelvollinen rekisterinumero.
			//  escape, jotta java lukee \\
			// $ rivinmerkki loppu tunnistusmerkki
		
	} else {
		System.out.println(syöte + " ei ole kelvollinen rekisterinumero./n");
	}

	}
}
	}
}
