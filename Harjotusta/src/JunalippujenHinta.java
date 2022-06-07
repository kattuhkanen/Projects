import java.util.Scanner;
public class JunalippujenHinta {

	    public static void main(String[] args) {
	        final int kertalipunHinta = 10;
	        final int kuukausilipunHinta = 100;

	        Scanner lukija = new Scanner(System.in);

	        System.out.println("Ostatko kuukausilipun (1) vai kertalippuja (2)?");
	        int vastaus = lukija.nextInt();

	        if (vastaus == 1) {
	            System.out.println("Kuukausilippu maksaa " + kuukausilipunHinta + " €");
	        } else {
	            System.out.println("Kuinka monta kertalippua käytät kuukaudessa?");
	            int kertalippuja = lukija.nextInt();
	            int kokonaishinta = kertalippuja * kertalipunHinta;

	            if (kokonaishinta > kuukausilipunHinta) {
	                System.out.println("Kuukausilippu olisi halvempi");
	            } else {
	                int saasto = kuukausilipunHinta - kokonaishinta;
	                System.out.println("Säästät " + saasto + " € verrattuna kuukausilippuun");
	            }
	        }

	        lukija.close();
	    }


}
