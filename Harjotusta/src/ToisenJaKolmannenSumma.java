import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class ToisenJaKolmannenSumma {



    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        List<Integer> luvut = new ArrayList<Integer>();



        System.out.println("Sy�t� kokonaislukuja listalle (0 lopettaa):");



        while (true) {

            // Sy�tetty merkkijono voidaan muuttaa kokonaisluvuksi

            // my�s Integer.parseInt-metodilla

            int syote = Integer.parseInt(lukija.nextLine());



            if (syote == 0) {

                break;

            } else {

                luvut.add(syote);

            }

        }



        lukija.close();



        System.out.println(); // Tyhj� rivi tulosteeseen



        // TODO: Muokkaa alla olevaa koodia teht�v�nannon mukaisesti

        int eka = luvut.get(1) + luvut.get(2);

        System.out.println(eka);

    }

}