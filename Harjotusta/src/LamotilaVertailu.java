package Koe;


import java.util.Scanner;



public class LamotilaVertailu {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna ensimm�inen l�mp�tila: ");

		int first = scanner.nextInt();

		System.out.print("Anna toinen l�mp�tila: ");

		int second = scanner.nextInt();



		if (first > second) {

			System.out.println("\r\n" + "Suurempi l�mp�tila on: " + first);

			System.out.println("Pienempi l�mp�tila on: " + second);

		}



		else {

			System.out.println("\r\n" + "Suurempi l�mp�tila on: " + second);

			System.out.println("Pienempi l�mp�tila on: " + first);

		}



	}



}