package Listoja;


import java.util.Arrays;

import java.util.Scanner;



public class SanojenVaihtaminen {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kirjoita lause:");

		String input = scanner.nextLine();

		String[] splitted = input.split(" ");



		System.out.println("Mitk‰ sanat vaihdetaan kesken‰‰n?");

		int firstIndex = scanner.nextInt();

		int secondIndex = scanner.nextInt();



		String[] temp = Arrays.copyOf(splitted, splitted.length);



		temp[firstIndex] = splitted[secondIndex];

		temp[secondIndex] = splitted[firstIndex];



		System.out.println(String.join(" ", temp));

	}

}