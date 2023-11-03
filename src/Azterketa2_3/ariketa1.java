package Azterketa2_3;
import java.util.Scanner;
public class ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Idatzi programa bat Javan, erabiltzaileari zenbaki osoak eskatzeko, sartutako zenbakia 0 izan arte.
		//Programa amaitzen denean, esan behar da erabiltzaileak zenbat zenbaki bikoiti eta bakoiti sartu dituen, sartutako zenbaki guztien batura zein den eta zenbat zenbaki sartu diren (0a ez da kontuan hartzen).
		
		int zenbakiak, contador, gehiketa, i, zenbakiBakoitiak, zenbakiBikoitiak ;
		
		Scanner teklatua = new Scanner(System.in);
		
		System.out.println("Idatzi zenbaki osoak eta 0 sartzerakoak programak zenbat zenbaki bakoiti eta zenbat bikoiti idatzi dituzun esango dizu, eta baita beraien batuketa eta kantitatea");
		
	gehiketa = 0; 
	i =  0;
	zenbakiBikoitiak = 0;
	zenbakiBakoitiak = 0;
	
	while (true) {
		System.out.println("Idatzi zenbaki bat:");
		zenbakiak = teklatua.nextInt();
		if (zenbakiak == 0 ) {
			break;
		}
		
		gehiketa += zenbakiak;
		
		i++;
		

			
		} 
		
	if ( 1 % 2 == 0) {
		zenbakiBikoitiak = i;
	
	}
		
	

	
		System.out.println("Zenbakien batuketa " + gehiketa + " da");
		System.out.println("Zartutako zenbakien kopurua " + i + " da" );
		System.out.println("Zenbaki bakoitien kopurua:  "  + zenbakiBakoitiak);
		System.out.println("Zenbaki bikoitien kopurua: " + zenbakiBikoitiak );
		
		
		
		
		
		
		

	}

}
