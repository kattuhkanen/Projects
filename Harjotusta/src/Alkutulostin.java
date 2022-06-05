import java.util.Scanner;

public class Alkutulostin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);


		System.out.print("Kirjoita sana: ");
		String sana = input.nextLine();
		
		 int pituus = sana.length();
		
		for (int i = 0; i < pituus; i++) {
			
			int loppuindeksi = i + 1;
			
			String osamerkkijono = sana.substring(0, loppuindeksi);
			System.out.println(osamerkkijono);
			
	
			
		}
		
	}
}