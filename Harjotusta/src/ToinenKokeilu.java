import java.util.Scanner;
import java.text.DecimalFormat;

public class ToinenKokeilu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");

		System.out.println("Anna nopeutesi: ");
		int nopeus = input.nextInt();

		if (nopeus <= 80) {
			System.out.println("Ei sakkoja");
		}
		if (nopeus > 80 && nopeus <= 100) {
			System.out.println("Rikesakko");
		}

		if (nopeus > 100 && nopeus >= 120) {

			System.out.println("Päiväsakko ");

			System.out.println("Anna nettokuukausitulosi: ");
			double tulo = input.nextDouble();
			
			double tulos = tulo - 255;
			double sakko = tulos / 60;
			String muotoiltu = kaksiDesimaalia.format(sakko);
			
			if (sakko < 6) 
				System.out.println("Päiväsakon määrä on 6.00 euroa");
		 else {
			System.out.println("Päiväsakon määrä on " + muotoiltu + " euroa");
		
		}
		}
	}
}




