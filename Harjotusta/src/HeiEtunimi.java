package viikko1;

import java.util.Scanner;



public class HeiEtunimi {



	public static void main(String[] args) {

		System.out.print("Sy�t� etunimi:");

		Scanner scanner1 = new Scanner(System.in);

		String nimi = scanner1.next();

		System.out.println("Hei " + nimi + "!");

		scanner1.close();

	}



}
