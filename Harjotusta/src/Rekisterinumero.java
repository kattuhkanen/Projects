import java.util.Scanner;

public class Rekisterinumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		while (true) {
		System.out.println("Sy�t� rekisterinumero (q-kirjain lopettaa): ");

		String sy�te = input.nextLine();
		if (sy�te.equals("q")) {
			break;
		} else { 
		
		if (sy�te.matches("[\\w\\-������]{2,3}\\-\\d{1,3}$")) {
			System.out.println(sy�te + " on kelvollinen rekisterinumero.");
			
	} else {
		System.out.println(sy�te + " ei ole kelvollinen rekisterinumero.");
	}

	}
}
	}
}