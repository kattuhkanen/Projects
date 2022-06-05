package viikko1;

import java.text.DecimalFormat;

import java.util.Scanner;



public class Juhlat {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna juhliin tulevien aikuisten m‰‰r‰: ");

		double aikuistenM‰‰r‰ = scanner.nextDouble();

		double pullo = 7;

		double kappaleM‰‰r‰ = Math.ceil(aikuistenM‰‰r‰ / pullo);

		DecimalFormat df = new DecimalFormat("0");

		System.out.println("Pulloja tarvitaan " + df.format(kappaleM‰‰r‰) + " kappaletta");

		double ylim‰‰r‰inen = pullo - Math.ceil(aikuistenM‰‰r‰ % pullo);

		System.out.println("Viimeisest‰ pullosta j‰‰ " + df.format(ylim‰‰r‰inen) + " lasia");

		scanner.close();

	}



}