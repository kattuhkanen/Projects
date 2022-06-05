import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lukija = new Scanner(System.in);
		

		System.out.println("Anna palkka: ");
		int palkka = lukija.nextInt();
		System.out.println("Anna veroprosentti: ");
		int veroProsentti = lukija.nextInt();
		System.out.println("Anna ikä: ");
		int ikä = lukija.nextInt();
		
		double xxx = 0.00;
		
		if (ikä >= 53 && ikä <= 62){ 
			xxx = 0.0825;}

		else {
		xxx = 0.0675;
		
		}
		
	
		DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");
		int bruttoPalkka = palkka;
		int veronOsuus = palkka * veroProsentti / 100;
		
		double tE = xxx * palkka;
		double tV = palkka * 0.015;
		double jaa = palkka - (veronOsuus + tE + tV);
		
		String muotoiltu = kaksiDesimaalia.format(veronOsuus);
		String muotoilu = kaksiDesimaalia.format(tV);
		String muoto = kaksiDesimaalia.format(tE);
		String muotoi = kaksiDesimaalia.format(jaa);
		
		System.out.println("Bruttopalkka " + bruttoPalkka); // toimii
		System.out.println("Veron osuus " + muotoiltu); // toimii
		System.out.println("Työeläkevakuutusmaksun osuus " + muoto); //ei toimi oikein
		System.out.println("Työttömyysvakuutuksen osuus " + muotoilu);
		System.out.println("Käteen jää " + muotoi); // toimii osittain

	}

}