import java.util.Scanner;
import java.util.ArrayList;

import java.util.List;

public class KysytynLuvunIndeksi {



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
		lukija.close();
        
     
        List<Integer> kopio = new ArrayList<Integer>(luvut);
		
		int pituus = luvut.size();
		for (int i = 0; i < pituus; i++)
			
			if (luvut.get(i) == etsittava) {
       
		System.out.println("Luku " + etsittava +  " on indeksiss� " + i);
		
		
        
		}
        
    }
    
    }