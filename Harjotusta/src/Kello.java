import java.util.Scanner;

public class Kello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kello = kysyKellonaika();
		boolean ok = tarkistaKellonaika(kello);
		
		if (ok) {
			System.out.println("Kellonaika on oikein");
		} else { 
			System.out.println("Kellonaika on väärin");
		}
		
	}
	private static boolean tarkistaKellonaika(String kellonaika) {
		String[] osat = kellonaika.split(":");
				if (osat.length != 2) {
	return false;
}
				try {
				int tunnit = Integer.parseInt(osat[0]);
				int minuutit = Integer.parseInt(osat[1]);
				
				if (tunnit >= 0 && tunnit <= 23 && minuutit >= 0 && minuutit <= 59) {
					return true;
				} else {
					return false;
				}
				} catch(NumberFormatException poikkeus) {
					return false;
				}
				}
				
				
				
	private static String kysyKellonaika() {
		System.out.println("Anna kellonaika muodossa tt:mm: ");
		Scanner lukija = new Scanner(System.in);
		String syote = lukija.nextLine();
		
		return lukija.nextLine(); // tai return syote;
	}

}
