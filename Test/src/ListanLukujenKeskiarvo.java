import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;




public class ListanLukujenKeskiarvo {



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

	        double summa = 0.0;
	        for (double luku: luvut) {
	            summa = summa + luku;
	        }
	        
	       double keskiarvo =  1.0 * summa / luvut.size();
	  
	         // Tyhj� rivi tulosteeseen
	        // TODO: T�ydenn� koodia teht�v�nannon mukaisesti

	        System.out.println("Keskiarvo: " + keskiarvo);

	    }

}