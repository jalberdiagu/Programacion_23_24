package jarduera2_3;
import java.util.Scanner;
public class jarduera12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//zenbaki bat eskatzen duena eta bere biderketa taula ateratzen duena, 1etik 10era.

		int zenbakia, i, emaitza;
		
		System.out.println("Idatzi zenbaki bat (1 eta 10 artean), bere biderketa taula ateratzeko");
		
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		


		for (i = 1; i <= 10; i++) {
		emaitza = zenbakia * i;
		System.out.println(zenbakia + "x" + i + "=" + emaitza);
		
		
	
	}
		
	}
}
