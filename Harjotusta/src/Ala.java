import java.util.Scanner;

public class Ala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Anna ympyrän säde:");
		int sade = lukija.nextInt();
		
		double pii = 3.142;
	
		double ala =  (double)sade * sade;
		double sateella = ala * pii;
		
		System.out.println("Ympyrän ala annetulla säteellä: " + sateella);
	
	
	}

}
//Anna ympyrän säde:3
//Ympyrän ala annetulla säteellä: 28.278