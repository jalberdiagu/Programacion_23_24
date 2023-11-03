package jarduera2_4;
import java.util.Scanner;
public class jarduera2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Teklatutik esaldi bat sartu eta pantailatik hitz bakoitzeko karaktere bat atera.

		System.out.println("Idatzi esaldi bat, pantailatik hitz bakoitzeko karaktere bat ataratzeko");
		
		String esaldia;
		int i;
		char karakterea;
		
		Scanner teklatua = new Scanner(System.in);
		esaldia = teklatua.nextLine();
		System.out.println(esaldia.length());
		
		for ( i = 0; i <= esaldia.length(); i++) {
			karakterea = esaldia.charAt(i);
			System.out.println(karakterea);
			
		}
		
		
		}
		
		
		
		
	}


