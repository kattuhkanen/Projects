import java.util.Scanner;

public class RekisterinumeroTarkastin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sy�te = "";
		
		while (true) {
		System.out.println("Sy�t� rekisterinumero (q-kirjain lopettaa): ");
		sy�te = input.nextLine();
		if(sy�te.equals("q")) {
			break;
		} else { 
		
		if(sy�te.matches("[\\w\\-������]{2,3}\\-\\d{1,3}$")) {
			System.out.println(sy�te + " on kelvollinen rekisterinumero./n");
				//Sy�t� rekisterinumero (q-kirjain lopettaa): JAV-4
				//JAV-4 on kelvollinen rekisterinumero.
			//  escape, jotta java lukee \\
			// $ rivinmerkki loppu tunnistusmerkki
		
	} else {
		System.out.println(sy�te + " ei ole kelvollinen rekisterinumero./n");
	}

	}
}
	}
}
