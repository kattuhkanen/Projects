import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;





public class lasku {



    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        List<Integer> luvut = new ArrayList<Integer>();



        System.out.println("Sy�t� kokonaislukuja listalle (-1 lopettaa):");



        while (true) {

            int syote = lukija.nextInt();



            if (syote == -1) {

                break;

            } else {

                luvut.add(syote);

            }

        }



        System.out.println(); // Tyhj� rivi tulosteeseen



        System.out.print("Mit� lukua etsit��n? ");

        int etsittava = lukija.nextInt();

       // lukija.close();

	
		System.out.println("Luku " + etsittava +  " on indeksiss� " + luvut.indexOf(etsittava));
		
		
		

        lukija.close();

    }

}