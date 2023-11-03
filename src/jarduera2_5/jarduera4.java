package jarduera2_5;

import java.util.Scanner;

public class jarduera4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		Scanner teklatua = new Scanner (System.in);

		String [] hitzak = new String[5];



		for (i= 0; i <= 4; i++){
		System.out.println(“Idatzi “ + i + “. hitza”);
		hitzak[i] = teklatua.next();
		}

		System.out.println("0. posizioan (" + hitzak[0] + ") hitza dago."”);
		System.out.println(“1. posizioan (“ + hitzak[1] + “) dago.”);
		System.out.println(“2. posizioan (“ + hitzak[2] + “) dago.”);
		System.out.println(“3. posizioan (“ + hitzak[3] + “) dago.”);
		System.out.println(“4. posizioan (“ + hitzak[4] + “) dago.”);



	}

}
