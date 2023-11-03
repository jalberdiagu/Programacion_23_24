package jarduera2_3;
import java.util.Scanner;
public class jarduera16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 zenbaki eskatu eta pantailatik handiena atera.
		
		int zenbakiKantitatea;
		int zenbakiHandiena; 
		int i;
		int zenbakia;
		
		Scanner teklatua = new Scanner(System.in);
		
		zenbakiKantitatea = 10;
		zenbakiHandiena = 0;
		for (i=1; i <= zenbakiKantitatea; i++) {
			System.out.println("Idatzi zenbakia " + i + ":");
			zenbakia = teklatua.nextInt();
			
			if (zenbakia > zenbakiHandiena){
				zenbakiHandiena = zenbakia;
				
				
			}
			
		}
		
		System.out.println("Hau da zenbaki handiena: " + zenbakiHandiena);
		
		
	
		
		
		
		
		
		
		
		
		
		


		}	
		
	}


