import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class LuvutRajatullaAlueella {



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



        System.out.println(); 



        System.out.print("Mist�? ");

        int mista = lukija.nextInt();



        System.out.print("Mihin? ");

        int mihin = lukija.nextInt();

		List<Integer> tulostettavat = luvut.subList(mista, mihin + 1);



        for (int luku : tulostettavat) {

            System.out.println(luku);

        lukija.close();



        // TODO: T�ydenn� koodia teht�v�nannon mukaisesti

		}

    }

}