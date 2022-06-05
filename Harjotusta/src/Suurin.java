import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class Suurin {



    public static void main(String[] args) {

       // Scanner lukija = new Scanner(System.in);

        List<Integer> luvut = new ArrayList<Integer>();


        int large = 0;
	    int num;
	    
        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");
        Scanner lukija = new Scanner(System.in);
	    int n = lukija.nextInt();
	    num = lukija.nextInt();


        while (true) {

            int syote = lukija.nextInt();



            if (syote == -1) {

                break;

            } else {

                luvut.add(syote);

            }

        }

        lukija.close();



        System.out.println(); // Tyhjä rivi tulosteeseen

        for (int i = 2; i < n; i++) {
	        num = lukija.nextInt();
	        //comparing each time entered number with large on
	        if (num > large) {
	            large = num;
	        }
	        //comparing each time entered number with smallest one
	       
	    }
	    System.out.println("the largest is:" + large);
	    
	}
}

