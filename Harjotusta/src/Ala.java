import java.util.Scanner;

public class Ala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Anna ympyr�n s�de:");
		int sade = lukija.nextInt();
		
		double pii = 3.142;
	
		double ala =  (double)sade * sade;
		double sateella = ala * pii;
		
		System.out.println("Ympyr�n ala annetulla s�teell�: " + sateella);
	
	
	}

}
//Anna ympyr�n s�de:3
//Ympyr�n ala annetulla s�teell�: 28.278