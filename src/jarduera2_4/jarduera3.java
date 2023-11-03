package jarduera2_4;
import java.util.Scanner;
public class jarduera3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hitz bat sartuta, atzetik aurrera atera pantailatik.
		
		String esaldia;
		int i;
		String esaldiaAtzetikAurrera;
		
		esaldiaAtzetikAurrera = "";
	
		
		System.out.println("Idatzi esaldi bat: ");

		Scanner teklatua = new Scanner (System.in);
		esaldia = teklatua.nextLine();
		
		for (i = esaldia.length() - 1; i >= 0; i-- ) {
			esaldiaAtzetikAurrera += esaldia.charAt(i);
		}
		
		
		System.out.println("Idatzitako esaldia atzetik aurrera: " + esaldiaAtzetikAurrera);
		
		
		
		
		
		
	}

}
