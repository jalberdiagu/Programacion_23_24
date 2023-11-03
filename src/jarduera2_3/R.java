package jarduera2_3;

import java.util.Scanner;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i, zenbakia, biderketa; 
	
	biderketa = 1;
	
	System.out.println("Idatzi zenbaki bat bere faktoriala esagutzeko");
	
	Scanner teklatua = new Scanner (System.in);
	zenbakia = teklatua.nextInt();
	
	for (i = 1; i <= zenbakia; i++) {
		biderketa *= i;
	
	}
	
	System.out.println(zenbakia + "ren faktoriala " +biderketa+ " da");
		
	
}
}