import java.util.Scanner;

public class LampotilaVertailu {



    public static void main(String[] args) {

    		Scanner input = new Scanner(System.in);
    	    int suurin = 0;
    	    int pienin = 0;
    	    int num;
    	    System.out.println("Anna ensimm�inen l�mp�tila: ");
    	    int n = input.nextInt();
    	    System.out.println("Anna toinen l�mp�tila: ");
    	    num = input.nextInt();
    	     
    	        
    	        if (num > suurin) {
    	            suurin = num;
    	       
    	            
    	    System.out.println("Suurempi l�mp�tila on: "  + suurin);
    	    System.out.println("Pienempi l�mp�tila on:  "  + suurin);
    	    
    	}
    	    }
    }

