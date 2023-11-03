package jarduera2_4;

import java.util.Scanner;

public class jarduera6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Esaldi baten bokal kopuru eta kontsonante kopurua zenbatu. Zuriuneek ez dute kontatzen.

		String esaldia;
		int i;
		
		System.out.println("Idatzi esaldi bat:");
		
		Scanner teklatua = new Scanner(System.in);
		esaldia = teklatua.nextLine().toLowerCase(); // esaldia minuskulera aldatuteko
		
		int bokalak = 0;
        int konsonanteak = 0;

        for ( i = 0; i < esaldia.length(); i++) {
            char karakterea = esaldia.charAt(i);
            if (Character.isLetter(karakterea)) { // Egiaztatzen deu karakterea letra bat den 
                if (karakterea == 'a' || karakterea == 'e' || karakterea == 'i' || karakterea == 'o' || karakterea == 'u') {
                    //egiaztatzen deu bokal bat den
                	
                	// kantitatea gehitu
                    bokalak++;
                }
                else {
                
                	// kantitatea gehitu
                    konsonanteak++;
                }
            }
	    }
        
        System.out.println("Idatzitako esaldian " + bokalak + " bokal eta " + konsonanteak + " konsonante daude.");
        
   }
}
