import java.util.Scanner;

public class Merkkijono {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Sy�t� kaksi merkkijonoa:");
        String eka = lukija.nextLine();
        String toka = lukija.nextLine();
	

        if (eka.equals(toka)) {
            System.out.println("Sy�tetyt merkkijonot olivat samat!");
        } else {
            System.out.println("Sy�tetyt merkkijonot eiv�t olleet samat!");
        }
    }
}