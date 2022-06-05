import java.util.Scanner;

public class LampotilaVertailu {



    public static void main(String[] args) {

    		Scanner input = new Scanner(System.in);
    	    int suurin = 0;
    	    int pienin = 0;
    	    int num;
    	    System.out.println("Anna ensimmäinen lämpötila: ");
    	    int n = input.nextInt();
    	    System.out.println("Anna toinen lämpötila: ");
    	    num = input.nextInt();
    	     
    	        
    	        if (num > suurin) {
    	            suurin = num;
    	       
    	            
    	    System.out.println("Suurempi lämpötila on: "  + suurin);
    	    System.out.println("Pienempi lämpötila on:  "  + suurin);
    	    
    	}
    	    }
    }

