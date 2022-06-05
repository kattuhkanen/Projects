import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;





public class kokonaislukuja {




    public static void main(String[] args) throws Exception {

        URL csvTiedosto = new URL("https://git.io/Jv3N3");



        // Luetaan Scannerin avulla netistä ladattua tietovirtaa System.in sijasta:

        Scanner lukija = new Scanner(csvTiedosto.openStream(), "utf-8");
        
        ArrayList<String> lista = new ArrayList<String>();



        // Tiedoston ensimmäinen rivi sisältää vain otsikkotiedot. Niitä ei tarvita.

        String ekaRivi = lukija.nextLine();
		


        // Käydään läpi rivejä, kunnes Scanner kertoo rivien loppuneen:

        while (lukija.hasNextLine()) {

            String rivi = lukija.nextLine();
            


            // Katkaistaan rivi pilkun kohdalta:

            int loppuindeksi = rivi.indexOf(",");

            String kaupunki = rivi.substring(0, loppuindeksi);
			

            String vakilukuString = rivi.substring(loppuindeksi + 1);
			
            



            int vakiluku = Integer.parseInt(vakilukuString);
            
            

            if (vakiluku >= 10_000) {
            	
                System.out.println(kaupunki);

            }

        }

        lukija.close(); // sulkee yhteyden

    }

}