package jarduera2_5;

import java.util.Scanner;

public class jarduera4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        String[] hitzak = new String[5];
		        
		        Scanner teklatua = new Scanner(System.in);
		        
		        System.out.println("Hayek dira Array-ean sortu diren hitzak:");
		        
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Sartu hitz bat: ");
		            hitzak[i] = teklatua.nextLine();
		         //   System.out.println(i + ". posizioan ( "+ hitzak[i] + " ) hitza gorde da.");
		            for ( int j :  hitzak[i]) {
			        	System.out.println(j);
			        }
		        }
		        
		      
		        
		        int cont = 0;
		        
		       System.out.println("Sartutako hitzak hauek dira:");
		       for (String palabra : hitzak) {
		            System.out.println(cont + ". posizioan ( "+ hitzak + " ) hitza gorde da.");
		        }
		        
		   
		        teklatua.close();
		    


	}

}
