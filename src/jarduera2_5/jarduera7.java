package jarduera2_5;

import java.util.Random;
import java.util.Scanner;

public class jarduera7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n zenbakia irakurri eta luzera horretako arraia definitu. 
		//1etik 10erako ausazko zenbakiekin bete eta gero altuena kalkulatu.
		
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Idatzi arrayaren luzera:  ");
		        int n = scanner.nextInt();
		        
		     
		        int[] zenbakiak = new int[n];
		        
		       
		        Random random = new Random();
		        
		        System.out.println("Hauek dira sortu diren zenbaki aleatorioak:");

		        for (int i = 0; i < n; i++) {
		            zenbakiak[i] = random.nextInt(10) + 1; 
		            System.out.println(zenbakiak[i]);
		        }
		        
		      
		        int maximoa = zenbakiak[0];
		        for (int i = 1; i < n; i++) {
		            if (zenbakiak[i] > maximoa) {
		                maximoa = zenbakiak[i];
		            }
		        }
		        
		  
		        System.out.println("Idatzitako zenbaki handiena hau da:  " + maximoa);

		        scanner.close();


	}

}
