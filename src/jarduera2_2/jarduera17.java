package jarduera2_2;
import java.util.Scanner;
public class jarduera17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Menu bat erakutsi eta menuko aukera bat hautatu ezkero, OK erakutsi, bestela ERROREA.
		
		int zenbakia;
		
		Scanner teklatua=new Scanner(System.in);
	
	
		System.out.println("MENUA:");
		System.out.println("1. Zerranda ikusi");
		System.out.println("2. Elementua sartu");
		System.out.println("3. Elementua ezabatu");
		System.out.println("4. irten");
		
		zenbakia = teklatua.nextInt();
		
		switch (zenbakia) {
		case 1:
			System.out.println("OK");
			break;
		case 2:
			System.out.println("OK");
			break;
		case 3:
			System.out.println("OK");
			break;
		case 4:
			System.out.println("OK");
			break;
		default:
			System.out.println("ERROREA");
		}
		
		
		
		
		
		
		
	}

}
