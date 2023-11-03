package jarduera2_3;

import java.util.Scanner;

public class jarduera18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbakiak eskatu erabiltzaileak 0 sartu arte eta sartutako zenbakien batazbestekoa atera.

		Scanner teklatua = new Scanner (System.in);
	
		
		int zenbakia;
		float geiketa;
		int i;
		
		geiketa = 0;
		i = 0;
		
	
	
		while (true) {
		System.out.println("Idatzi nahi dituzun zenbakiak beraien batazbestekoa emateko (zenbakiak idatzi eta gero jarri 0)");
		zenbakia = teklatua.nextInt();
		
		if (zenbakia == 0) {
			break;
		}
		geiketa += zenbakia;
		
		i ++;
		
		}
		
		geiketa = geiketa / i;
		
		System.out.println("Idatzitako zenbakien batazbestekoa hau da:" + geiketa);
		
		
	
	}

}
