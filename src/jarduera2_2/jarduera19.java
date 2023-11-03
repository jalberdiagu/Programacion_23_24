package jarduera2_2;
import java.util.Scanner;
public class jarduera19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bat sartu eta dagokion nota esleitu
		
	    double  nota;
System.out.println("Idatzi zure nota");
		Scanner scan = new Scanner(System.in);
		nota=scan.nextDouble();
		
		if (nota <= 4.9) {
			System.out.println("GUTXI");
		}
		else if (nota <= 5.9 && nota >= 5) {
			System.out.println("NAHIKO");
		}
		else if ( nota <= 6.9 && nota >= 6) {
			System.out.println("ONDO");
		}
		else if (nota <= 8.9 && nota >= 7) {
			System.out.println("OSO ONDO");
		}
		else if (nota<=10 && nota >= 9) {
			System.out.println("BIKAIN");
		}
		else {
			System.out.println("ERROREA");
		}
		
	
	
	
	}

}
