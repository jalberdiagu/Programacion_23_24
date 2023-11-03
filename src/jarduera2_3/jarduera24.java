package jarduera2_3;

public class jarduera24 {
	
import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner = new Scanner(System.in);
		    System.out.print("Sartu zenbaki bat zenbakia zenbakia ala ez jakiteko: ");
		    int zenbakia = scanner.nextInt();
		    boolean primoaDa = true;
		    
		    if (zenbakia <= 1) {
		        primoaDa = false;
		    } else {
		        for (int i = 2; i <= Math.sqrt(zenbakia); i++) {
		            if (zenbakia % i == 0) {
		                primoaDa = false;
		                break;
		            }
		        }
		    }
		    
		    if (primoaDa) {
		        System.out.println(zenbakia + " zenbakia zenbaki primoa da.");
		    } else {
		        System.out.println(zenbakia + " zenbakia ez da zenbaki primoa.");
		    }
		
		}


		
		
		
		
		
		
		
	


