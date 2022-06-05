import java.util.Scanner;
public class Alkuluku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		
		//kiintoarvo, tätä ei muuteta
		//int luku = 93;
		int luku = 93;
		int jakaja = 2;
		boolean onAlkuluku = false; //"yksisuuntainen lippu"
		
		System.out.println("Syötä jokin positiivinen kokonaisluku: ");
		int lukux = lukija.nextInt();
		
		while (jakaja < lukux) {
	
			if(lukux % jakaja == 0) {
			onAlkuluku = true;
	}
	jakaja++;
	}
		if (onAlkuluku) {
		System.out.println("Luku " + lukux + " ei ole alkuluku.");
		} else {
		System.out.println("Luku " + lukux + " on alkuluku.");
		}
	}
	
}