package jarduera2_4;
import java.util.Scanner;
public class jarduera5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Idatzitako esaldia zuriunerik gabe idatzi.

		  Scanner teklatua = new Scanner(System.in);
		  
		  String esaldia, esaldiaZuriunerikGabe;
	        
		  //Eskatu erabiltzaileari esaldi bat sartzeko
	        System.out.println("Idatzi esaldi bat: ");
	        esaldia = teklatua.nextLine();
	        
	        // Kendu zuriuneak esalditik
	        esaldiaZuriunerikGabe = esaldia.replaceAll("\\s", "");
	        
	        // Erakutsi esaldia zuriunerik gabe
	        System.out.println("Hau da esaldia zuriunerik gabe: " + esaldiaZuriunerikGabe);
	        
	      
	        teklatua.close();
		
		
		
		
	}

}
