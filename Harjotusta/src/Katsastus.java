import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);

		System.out.println("Onko 1=katsastus, 2=j�lkitarkastus: ");
		int katsastus = lukija.nextInt();

		if (katsastus == 2) {
			System.out.println("Hinta on 30");
		} else {
	
			System.out.println("Mitataanko p��st�t 0=ei, 1=kyll�: ");
			int p��st�t = lukija.nextInt(); 
		

		if (p��st�t == 0) {
			System.out.println("Hinta on 50");
		
		} else {
			System.out.println("Onko auto 0=bensa, 1=diesel: ");
			int auto = lukija.nextInt();
			   
			
			if(auto == 1) {

			System.out.println("Hinta on 81");
	} else {
			System.out.println("Hinta on 72");

		}
	}
}
}
}