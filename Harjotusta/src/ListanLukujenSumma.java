import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;




public class ListanLukujenSumma {



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

        lukija.close();
        // alkaa

        int summa = 0;
        for (int luku: luvut) {
            summa = summa + luku;
        }
        
      

        System.out.println(); // Tyhj� rivi tulosteeseen

        

        // TODO: T�ydenn� koodia teht�v�nannon mukaisesti

        System.out.println("Summa: " + summa);

    }

}