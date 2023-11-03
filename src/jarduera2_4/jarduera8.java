package jarduera2_4;
import java.util.Scanner;
public class jarduera8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Teklatutik esaldi bat sartu adb.: "Ondo etorri Zornotzara”, gero, ordeztu nahi den hitza idatzi (adb.: Zornotza) eta gero zerekin ordeztuko den (adb.: Amorebieta). Pantailatik atera esaldi berria.

		
		   Scanner teklatua = new Scanner(System.in);
		   
		   String esaldia, aldatuBeharrekoHitza, aldaketaHitza, esaldiaAldatuta;
		   

	       // esaldia, hitza eta aldatutako hitza eskatu
	        System.out.print("Idatzi esaldi bat: ");
	        esaldia = teklatua.nextLine();
	        System.out.print("Idatzi aldatu nahi duzun hitza: ");
	        aldatuBeharrekoHitza = teklatua.nextLine();
	        System.out.print("Idatzi hitz berria aurrekoaren ordez:");
	        aldaketaHitza = teklatua.nextLine();

	      
	        // Aldaketak
	        esaldiaAldatuta = esaldia.replace(aldatuBeharrekoHitza, aldaketaHitza);

	        System.out.println("Hau da esaldia aldaketarekin: " + esaldiaAldatuta);
		
		
		
		
		
		
		
	}

}
