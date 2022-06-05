import java.util.Scanner;
public class kuusi {

	public static void main(String[] args) {
		
		        // merkkijonon "split" palauttaa taulukon:
				
		        Scanner input = new Scanner(System.in);

		        System.out.println("Kirjoita lause: ");
				String nimi = input.nextLine();

		        // split-metodille annetaan katkaisumerkki:

		        String[] nimet = nimi.split(" ");



		        System.out.println(nimet[0]);

		        System.out.println(nimet[1]);

		        System.out.println(nimet[2]);
		        System.out.println(nimet[3]);
		    }

		}
