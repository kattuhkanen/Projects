package viikko1;

import java.util.Scanner;



public class Bitcoin {



	public static void main(String[] args) {

		System.out.print("Anna Bitcoineihin investoidun rahan m‰‰r‰:");

		Scanner scanner = new Scanner(System.in);

		double bitcoins = scanner.nextInt();

		double btcKerroin = 14.06;

		double tuotto = bitcoins * btcKerroin;



		System.out.println("Bitcoin tuotti vuodessa " + tuotto + " euroa");

		scanner.close();

	}

}
