package jarduera2_2;
import java.util.Scanner;
public class Jarduera11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Letra bat eskatu, B edo E den egiaztatu. B edo E bada, 
		//ONDO atera, bestela ERROREA.
		
		String letra;
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Idatzi letra bat, letra larriz");
		letra =scan.next();
		
		if(letra.equals  ("e")) {
			System.out.println("ONDO");
		}
		else if (letra.equals  ("b")) {
			System.out.println("Idatzi berdina letra larriz!");
		}
	
		else  {
			System.out.println("ERROREA");
		}
		

		
		
		
		
		
	}

}
