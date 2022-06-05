package Listoja;


import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



/**

 * Ohjelmaan on toteutettu valmiina pohja, joka lukee k�ytt�j�lt� merkkijonoja

 * ja lis�� niit� listalle. Sy�tteiden lukeminen p��tet��n kun k�ytt�j� sy�tt��

 * tyhj�n merkkijonon (tai '-'). Ohjelma tulostaa t�m�n j�lkeen listan

 * ensimm�isen arvon.

 * 

 * Muokkaa ohjelmaa siten, ett� ensimm�isen arvon sijaan tulostetaan kolmas

 * arvo. Huomaa, ett� ohjelmoijat aloittavat laskemisen nollasta! Ohjelma saa

 * rikkoutua mik�li listalla ei ole v�hint��n kolmea arvoa, eli t�llaiseen

 * tilanteeseen ei tarvitse varautua mill��n tavalla.

 * 

 * T�m�n teht�v�n on laatinut Helsingin yliopiston Agile Education Research

 * -tutkimusryhm�. Teht�v� on lisensoitu on lisensoitu Creative Commons BY-NC-SA

 * 4.0 -lisenssill� ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.

 */

public class KollmannenArvonTulostaminen {



	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		List<String> lista = new ArrayList<String>();



		System.out.println("Sy�t� sanoja listalle. Tyhj� tai yhdysviiva (-) lopettaa:");



		while (true) {

			String syote = lukija.nextLine();



			if ("".equals(syote) || "-".equals(syote)) {

				break;

			} else {

				lista.add(syote);

			}

		}

		lukija.close();



		System.out.println(); // Tyhj� rivi tulosteeseen



		// TODO: Muokkaa alla olevaa koodia teht�v�nannon mukaisesti

		String eka = lista.get(2);

		System.out.println(eka);

	}

}