import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class LoytyykoListalta {



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



        System.out.println(); // Tyhj� rivi tulosteeseen



        System.out.print("Ket� etsit��n? ");

        String etsittava = lukija.nextLine();



        lukija.close();



        // TODO: Muokkaa alla olevaa koodia teht�v�nannon mukaisesti.



        // Tulosta:
        boolean loytyiko = lista.contains(etsittava);
        if (loytyiko) {
        System.out.println(etsittava + " l�ytyi!");

        }
        
        if (!loytyiko) {
        // Tai:

        System.out.println(etsittava + " ei l�ytynyt!");

    }

}
}