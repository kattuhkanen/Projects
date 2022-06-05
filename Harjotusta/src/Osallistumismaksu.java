package Testikoe;


import java.text.DecimalFormat;

import java.util.Scanner;



public class Osallistumismaksu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Kirjoita ik�si: ");

		int ika = scanner.nextInt();

		int ekaHinta = 8;

		double tokaHinta = 12.5;

		DecimalFormat df = new DecimalFormat("0.00");



		if ((ika >= 0) && (ika < 18)) {

			System.out.println("Osallistumismaksusi on " + df.format(ekaHinta) + " euroa.");

		} else {

			System.out.println("Osallistumismaksusi on " + df.format(tokaHinta) + " euroa.");

		}

	}

}