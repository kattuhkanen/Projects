

import java.util.List;

import java.util.Scanner;




public class ListanLuvut {

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
	for(int s : luvut) {
	System.out.println(s);
		
	
	}
    }

}