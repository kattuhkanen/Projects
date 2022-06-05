package Listoja;

import java.net.URL;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import java.util.Scanner;



public class KaupungitVerkosta {



	/*

	 * URL-luokka heitt‰‰ ns. poikkeuksia virhetilanteissa, kuten verkkoyhteyden

	 * ep‰onnistuessa. T‰m‰n vuoksi joudumme m‰‰rittelem‰‰n main-metodiin lis‰ksi

	 * "throws Exception".

	 */

	public static void main(String[] args) throws Exception {

		URL csvTiedosto = new URL("https://git.io/Jv3N3");



		// Luetaan Scannerin avulla netist‰ ladattua tietovirtaa System.in sijasta:

		Scanner lukija = new Scanner(csvTiedosto.openStream(), "utf-8");



		// Tiedoston ensimm‰inen rivi sis‰lt‰‰ vain otsikkotiedot. Niit‰ ei tarvita.

		String ekaRivi = lukija.nextLine();



		List<String> over = new ArrayList<String>();



		// K‰yd‰‰n l‰pi rivej‰, kunnes Scanner kertoo rivien loppuneen:

		while (lukija.hasNextLine()) {

			String rivi = lukija.nextLine();



			// Katkaistaan rivi pilkun kohdalta:

			int loppuindeksi = rivi.indexOf(",");

			String kaupunki = rivi.substring(0, loppuindeksi);

			String vakilukuString = rivi.substring(loppuindeksi + 1);



			int vakiluku = Integer.parseInt(vakilukuString);



			if (vakiluku >= 10_000) {

				over.add(kaupunki);

			}

		}



		lukija.close(); // sulkee yhteyden



		Collections.sort(over);



		for (String city : over) {

			System.out.println(city);

		}



	}

}