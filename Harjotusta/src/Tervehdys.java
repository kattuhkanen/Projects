public class Tervehdys{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime nykyhetki = LocalTime.now();
		
		
		
		int tunnit = nykyhetki.getHour();
		//System.out.println(nykyhetki.getHour());
		
		
		if (tunnit >= 7 && tunnit < 10) {
			System.out.println("Hyv�� huomenta!");
		}
			
		else if (tunnit >= 10 && tunnit < 17) {
			System.out.println("Hyv�� p�iv��!");
		}
		else if (tunnit >= 17 && tunnit < 22) {
			System.out.println("Hyv�� iltaa!");
		}	
		else {
		
			System.out.println("Hyv�� y�t�!");
		}
		}
			

		}
			
		

