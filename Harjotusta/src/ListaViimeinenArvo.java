import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;




public class ListaViimeinenArvo {



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
		
		String eka = lista.get(lista.size() - 1);

        System.out.println(eka);


        System.out.println(); // Tyhjä rivi tulosteeseen



        // TODO: Täydennä koodia tehtävänannon mukaisesti

    }

}