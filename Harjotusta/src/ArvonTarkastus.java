package viikko6;
import java.util.Scanner;



public class ArvonTarkastus {



	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);



		System.out.print("Syötä luku väliltä 0-23:");

		int number = Integer.parseInt(scanner.nextLine());



		if (number >= 0 && number < 24) {

			System.out.println("Luku " + number + " on sallittu.");

		} else {

			throw new IllegalArgumentException();

		}



	}



}