package viikko1;

import java.util.Scanner;

public class Puoluetuki {



	public static void main(String[] args) {

		System.out.print("Anna kansanedustajien lukum��r�:");

		Scanner scanner1 = new Scanner(System.in);

		int kansanedustajat = scanner1.nextInt();

		int puoluetuki = kansanedustajat * 148175;

		System.out.println("Puoluetuen m��r� on " + puoluetuki + " euroa");



		scanner1.close();

	}

}