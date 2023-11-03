package jarduera2_3;
import java.util.Scanner;
public class jarduera11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//zenbaki bat eskatzen duena eta pantailatik zenbakiaren kopuru bereko asteriskoak ateratzen dituena
		//lerro berean
		
		int zenbakia, i, contador;
		
	
		zenbakia = 0;
		
		
		Scanner teklatua = new Scanner(System.in);
		
		System.out.println("Idatzi zenbaki bat, pantailatik erakusteko asterisko kopurua");
		
		zenbakia = teklatua.nextInt();
		
		for (i = 1 ; i <= zenbakia; i++ ) {
		
			System.out.print("*" );

			
		}
		
		
	}

}
