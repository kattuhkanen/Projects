import java.util.Scanner;
public class Poikkeus {

		//KysyUudestaan
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		
		boolean ok = false;
		while(ok == false) {
		try {
		System.out.println("Sy�t� kokonaisluku: ");
		String syote = lukija.nextLine();
		
		int luku = Integer.parseInt(syote);
		System.out.println("Sy�tit luvun " + luku + ".");
		ok = true;
		
	} catch (NumberFormatException e) {
		System.out.println("Virheellinen luku!\n");
		
	}
		
	}
	
		
		lukija.close();
		
	}
}
