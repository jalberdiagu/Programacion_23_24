package jarduera2_3;

import java.util.Scanner;

public class jarduera22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzaileak sartzen dituen 5 zenbakien faktoriala atera.
		
		int i;
		int zenbakia, zenbakia1, zenbakia2, zenbakia3, zenbakia4;
		int faktoriala1;
		int faktoriala2;
		int faktoriala3;
		int faktoriala4;
		int faktoriala5;
		
		faktoriala1 = 1;
		faktoriala2 = 1;
		faktoriala3 = 1;
		faktoriala4 = 1;
		faktoriala5 = 1;
		
	
		System.out.println("Idatzi zenbakia 1:");
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		System.out.println("Idatzi zenbakia 2:");
		zenbakia1 = teklatua.nextInt();
		System.out.println("Idatzi zenbakia 3:");
		zenbakia2 = teklatua.nextInt();
		System.out.println("Idatzi zenbakia 4:");
		zenbakia3 = teklatua.nextInt();
		System.out.println("Idatzi zenbakia 5:");
		zenbakia4 = teklatua.nextInt();
		
		
		
		
		for ( i = 2; i <= zenbakia; i++) {
			System.out.println("Idatzi zenbakia " + i + ":");
			
			
			faktoriala1 *= i;
			faktoriala2 *= i;
			faktoriala3 *= i;
			faktoriala4 *= i;
			faktoriala5 *= i;
			
		
		}
		
System.out.println(zenbakia +" -ren faktoriala " + faktoriala1 +" da");
System.out.println(zenbakia1 +" -ren faktoriala " + faktoriala2 +" da");
System.out.println(zenbakia2 +" -ren faktoriala " + faktoriala3 +" da");
System.out.println(zenbakia3 +" -ren faktoriala " + faktoriala4 +" da");
System.out.println(zenbakia4 +" -ren faktoriala " + faktoriala5 +" da");
		teklatua.close();
		
		
		
		*****
		
	}

}
