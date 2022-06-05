

import java.util.Scanner;


public class ListanSuurinLuku {



    public static void main(String[] args) {

    	  
    	    int large = 0;
    	    int num;
    	    System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");
    	    Scanner input = new Scanner(System.in);
    	    int n = input.nextInt();
    	    num = input.nextInt();
    	     
    	    for (int i = 0; i < n; i++) {
    	        num = input.nextInt();
    	        
    	        if (num > large) {
    	            large = num;
    	        }
    	            if (num == -1) {

    	                break;
    	        }
    	        
    	       
    	    }
    	    System.out.println("Listan suurin luku: "  + large);
    	    
    	}
}