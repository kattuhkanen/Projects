package Koe;

import java.util.Scanner;

public class LukujenJ�rjestys {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sy�t� kymmenen kokonaislukua: ");

		int kokonaisLuvut[] = new int[10];



		for (int i = 0; i < 10; i++) {



			kokonaisLuvut[i] = scanner.nextInt();



		}



		System.out.println();



		int counterAsc = 0;

		int counterDesc = 0;



		for (int i = 0; i < kokonaisLuvut.length - 1; i++) {

			if (kokonaisLuvut[i] < kokonaisLuvut[i + 1]) {

				counterAsc++;

			} else if (kokonaisLuvut[i] > kokonaisLuvut[i + 1]) {

				counterDesc++;

			}

		}



		if (counterAsc == 9) {

			System.out.println("Luvut ovat kasvavassa j�rjestyksess�.");

		} else if (counterDesc == 9) {

			System.out.println("Luvut ovat laskevassa j�rjestyksess�.");

		} else {

			System.out.println("Luvut ovat ep�j�rjestyksess�.");

		}



	}



}