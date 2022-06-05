import java.util.Scanner;

public class KokeiluToimiiko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Anna nopeutesi: ");
		int nopeus = input.nextInt();

		if (nopeus > 80 && nopeus <= 100) {
			System.out.println("Rikesakko");
		}

		if (nopeus > 100 && nopeus < 120) {

			System.out.println("Päiväsakko");
			System.out.println("Anna nettokuukausitulosi: ");
			// double tulo = Double.valueOf(input.nextLine());
			int tulosi = input.nextInt();
			int sakko = (tulosi - 255) / 60;

			System.out.println("Päiväsakon määrä on " + sakko + " euroa");
			}
			if (nopeus <= 80) {
				System.out.println("Ei sakkoja");
			}
		}
	

}


