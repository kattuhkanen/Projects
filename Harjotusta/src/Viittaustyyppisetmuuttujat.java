import java.util.Arrays;
import java.util.Scanner;

public class Viittaustyyppisetmuuttujat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nimet = { "Johan", "Ludvig", "Runeberg" };
		String merkkijono = Arrays.deepToString(nimet);
		System.out.println(merkkijono);
		
		String etunimi = nimet[0];
		String toinenNimi = nimet[1];
		String sukunimi = nimet[2];
		
		String[] lyhennetty = Arrays.copyOf(nimet,  nimet.length); 
		
		lyhennetty[0] = etunimi.substring(0, 1); //"J"
		lyhennetty[1] = toinenNimi.substring(0, 1); //"L"
		System.out.println(Arrays.deepToString(lyhennetty));
		
		System.out.println(Arrays.deepToString(nimet));
	}

}
