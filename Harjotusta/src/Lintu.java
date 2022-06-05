import java.util.Scanner;
public class Lintu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("1 = Lis‰‰ uusi merkint‰\n2 = N‰yt‰ kaikki merkinn‰t\n0 = Lopeta\nAnna valintasi (0-2): ");
		int valinta = input.nextInt();
		
		if (valinta == 1) {
	
		System.out.println("Anna laji: ");
		String laji = input.next();
	}
		if (valinta == 2) {
			System.out.println(valinta);
}
	if (valinta == 0) {
		input.close();
}
}
}