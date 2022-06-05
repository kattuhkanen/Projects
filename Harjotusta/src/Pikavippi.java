package viikko1;


import java.util.Scanner;



public class Pikavippi {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna pikavipin m‰‰r‰ euroissa: ");

		int pikavippiM‰‰r‰ = scanner.nextInt();

		System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");

		int vuosiM‰‰r‰ = scanner.nextInt();



		System.out.print("Lainakorko kahdesta yleisest‰ (41% tai 37%): ");

		int lainaKorko = scanner.nextInt();

		double maksu = pikavippiM‰‰r‰ * vuosiM‰‰r‰ / 100 * lainaKorko;



		System.out.print("Lainatut rahat maksavat eli korko " + maksu);

		scanner.close();



	}



}
