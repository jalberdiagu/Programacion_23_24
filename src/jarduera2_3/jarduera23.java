package jarduera2_3;

import java.util.Scanner;

public class jarduera23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Menu bat atera, 1,2,3 aukerekin. Erabiltzaileak 4 sartzen badu, AGUR atera pantailatik. Bestela, erabiltzaileak aukeratutakoa atera.

		
		int zenbakia;
		Scanner teklatua = new Scanner (System.in);
		
		

	            System.out.println("**** Menú ****");
	            System.out.println("1. Zerrenda ikusi");
	            System.out.println("2. Elementua sartu");
	            System.out.println("3. Elementua ezabatu");
	            System.out.println("4. Irten");
	            System.out.print("Aukeratu aukera bat");
	            
	    zenbakia = teklatua.nextInt();
	    
	    switch (zenbakia){
	    case 1:
	    	System.out.println("Zerrenda ikusi");
	    	break;
	    case 2:
	    	System.out.println("Elementua sartu");
	    	break;
	    case 3:
	    	System.out.println("Elementua ezabatu");
	    	break;
	    case 4:
	    	System.out.println("Agur");
	    	break;
		default:
			System.out.println("ERROREA");
	   
	    }
	    

	  
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
