import java.util.Arrays;
import java.util.Scanner;
public class kaupungit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		
		System.out.println("Kirjoita lause: ");
		String lause = lukija.nextLine();
		String[] sanat = lause.split(" ");
		System.out.println("Mitk‰ sanat vaihdetaan kesken‰‰n? ");
		int eka = lukija.nextInt();
		int toka = lukija.nextInt();
		

      eka = 0;
      toka = 5;
      
      String ekaSana = sanat[eka];
      String tokaSana = sanat[toka];
		
      sanat[eka] = tokaSana;
      sanat[toka] = ekaSana;
      
      System.out.println(Arrays.toString(sanat));
      String tulos = String.join(" ", sanat);
      System.out.println(tulos);
	}
	}
	


