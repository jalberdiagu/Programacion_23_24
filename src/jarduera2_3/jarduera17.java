package jarduera2_3;

import java.util.Scanner;

public class jarduera17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 zenbaki eskatu eta pantailatik handiena eta txikiena atera.
		
	
		int zenbakiHandiena; 
		int zenbakiTxikiena;
		int i;
		int zenbakia;
		
		Scanner teklatua = new Scanner(System.in);
		
		zenbakiHandiena = Integer.MIN_VALUE;
		zenbakiTxikiena = Integer.MAX_VALUE;
	
		//zenbakiHandiena = Integer.MIN_VALUE;
		//zenbakiTxikiena = Integer.MAX_VALUE;
		
		for (i=1; i <= 10; i++) {
			System.out.println("Idatzi zenbakia " + i + ":");
			zenbakia = teklatua.nextInt();
			
			
			if (zenbakia > zenbakiHandiena){
				zenbakiHandiena = zenbakia;
			
			}
				
			if (zenbakia < zenbakiTxikiena) {
				zenbakiTxikiena = zenbakia;
			}
				
				
			
			
		}
		
		System.out.println("Hau da zenbaki handiena: " + zenbakiHandiena);
		System.out.println("Hau da zenbaki txikiena: " + zenbakiTxikiena);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
