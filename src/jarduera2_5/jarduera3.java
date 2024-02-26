package jarduera2_5;

import java.util.Random;
import java.util.Scanner;


public class jarduera3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n zenbaki bat irakurri eta arrai bat definitu, n luzerakoa eta 1etik 10era dauden ausaz sortutako zenbakiekin bete.
		
		   Scanner scanner = new Scanner(System.in);
		      
	        System.out.print("Idatzi zenbat zenbaki aleatorio gorde nahi dituzu");
	        int n = scanner.nextInt();

	    
	        int[] zenbakiak = new int[n];
	        Random random = new Random();

	        for (int i = 0; i < n; i++) {
	            int zenbakiAleatorioak = random.nextInt(10) + 1; 

	            zenbakiak[i] = zenbakiAleatorioak;
	            System.out.println(zenbakiak[i]);
	        }

	     
	      //  for (int i = 0; i < n; i++) {
	         //   System.out.println(zenbakiak[i] + " ");
	       // }

	  
	        scanner.close();



		
		
		
		
		
	}

}
