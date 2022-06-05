import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class EnsimmäinenJaViimeinenArvo {



    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        List<String> lista = new ArrayList<String>();



        System.out.println("Syötä sanoja listalle. Tyhjä tai yhdysviiva (-) lopettaa:");



        while (true) {

            String syote = lukija.nextLine();



            if ("".equals(syote) || "-".equals(syote)) {

                break;

            } else {

                lista.add(syote);

            }

        }

        lukija.close();



        System.out.println(); // Tyhjä rivi tulosteeseen

		String eka = lista.get(0);

        System.out.println(eka);

		String vika = lista.get(lista.size() - 1);

        System.out.println(vika);


        System.out.println();


        // TODO: Täydennä koodia tehtävänannon mukaisesti

    }

}