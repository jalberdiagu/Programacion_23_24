package Azterketa2_1;
import java.util.Scanner;
public class azterketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Idatzi zure kalifikazioaren media");
		
		
		
		Scanner teklatua = new Scanner (System.in);
		
		
		Double media;
		int faltak;
		
		media=teklatua.nextDouble();
		
		System.out.println("Idatzi zure falta kopurua");
		faltak=teklatua.nextInt();
		
		if (media >= 4 && media <= 0) {
			System.out.println("ERROREA; kalifikazioaren media 0 eta 4 bitartean egon behar du ");
			System.exit(0);
		}
		
		else if(faltak < 0){
			System.out.println("ERROREA; falta kopurua ezin da negatiboa izan");
			System.exit(0);
		}
		
		if (media <= 4 && media >= 3.5){
		
		}
		else if (faltak >= 0 && faltak <=3) {
			System.out.println("ZORIONAK, beka duzu");
		}
		
	 if (media <= 4 && media >= 3.5){
			
			}
			else if (faltak >= 4) {
				System.out.println("EZ duzu bekarik, falta gehiegi dituzu");
			}
	 if (media <= 3.4 && media <= 0){
			
		}
		else if (faltak >= 0 && faltak <=3) {
			System.out.println("Ez duzu bekarik, zure media ez da nahikoa");
		}
	
			
		
		
		
		
			{
	
		
		
		
		
		
		
			}	
	}
	}

