import java.util.Scanner;
		public class KysyUudestaan {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner lukija = new Scanner(System.in);
				
				boolean ok = false;
				while(ok == false) {
				System.out.println("Syötä luku väliltä 0-23: ");
				int syote = lukija.nextInt();
				
				if (syote >= 0 && syote <= 23) 
				//int luku = Integer.parseInt(syote);
				//System.out.println("Syötit luvun " + luku + ".");
				//ok = true;
				syote++;
				
				} 
				int syote = -1;
				if (syote < 0 && syote > 23)
			{
					
				System.out.println("java.lang.IllegalArgumentException");
				
			}
				
			}
		}
			
		