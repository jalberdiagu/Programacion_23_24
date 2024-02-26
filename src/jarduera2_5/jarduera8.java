package jarduera2_5;

import java.util.Scanner;

public class jarduera8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 luzerako arraia teklatutik sartutako zenbakiekin bete. Gero honako menua atera, dagozkion aukerak garatuz:

	       // 1. Batuketa kalkulatu eta bistaratu.

	       // 2. Zenbakirik altuena bistaratu.

	       // 3. Zenbakirik txikiena bistaratu.

	       // 4. Zenbaki bat eskatu eta arraian zenbat bider agertzen den bistaratu.
			
System.out.println("10 zenbaki idatzi behar dituzu.");
		
		Scanner teklatua = new Scanner(System.in);
		
		int[] zenbakiak = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Idatzi " + (i+1) + ". zenbakia:");
			zenbakiak[i] = teklatua.nextInt();
		}
		
		int suma = 0;
		for ( int i = 0; i <10; i++) {
		suma += zenbakiak[i];
		}
		
		int zenbakiAltuena = Integer.MIN_VALUE;
		
		
		for ( int i = 0; i <10; i++) {
		
		if (zenbakiak[i] > zenbakiAltuena) {
			zenbakiAltuena = zenbakiak[i];	
		}
		
		}
		
		int zenbakiTxikiena = Integer.MAX_VALUE;
		for ( int i = 0; i <10; i++) {
		if ( zenbakiak[i] < zenbakiTxikiena) {
			zenbakiTxikiena = zenbakiak[i];
		}
		}
		
		System.out.println("****MENUA****");
		System.out.println("1.- Calcular y visualizar la suma.");
		System.out.println("2.- Visualizar el número más alto.");
		System.out.println("3.- Visualizar el número más pequeño.");
		System.out.println("4.- Pedir un número y visualizar el número de veces que aparece en el array.");
		System.out.println("******************");
		System.out.println("Aukeratu aukera bat (1/2/3/4):");
		
		int aukera = teklatua.nextInt();
		
		//for(int i : zenbakiak);
		
		switch (aukera){
		case 1: 
			System.out.println("La suma de los numeros es:" + suma);
			break;
		case 2:
			System.out.println("El numero mas alto es: " + zenbakiAltuena);
			break;
		case 3: 
			System.out.println("El numero mas bajo es: " + zenbakiTxikiena); 
		case 4:
			System.out.println("Idatzi zenbaki bat eta esango dizut zenbat aldiz errepikatu da Array-ean");
			int usuarioakAurkitzen = teklatua.nextInt();
			int cont = 0;
			for ( int i = 0; i <10; i++) {
				if(zenbakiak[i] == usuarioakAurkitzen) {
					cont++;
				}
				
			}
			
			System.out.println("Idatzitako zenbakia " + cont + " aldiz errepikatu da Array-ean");
			
			
		}

	
			}
}
