package Azterketa2_3;
import java.util.Scanner;
public class ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// datzi programa bat Javan, erabiltzaileari 2 zenbaki eskatzeko eta programak 2 zenbaki horien artean dauden zenbaki guztiak inprimatzeko (erabiltzaileak sartu dituen zenbakiak barne).

		System.out.println("Idatzi bi zenbaki, zenbaki horien arteko zenbakiak inprimitzeko"); 
		
		int i, zenbakia1, zenbakia2, j, zenbakia; 
		
		zenbakia1= Integer.MAX_VALUE;
		zenbakia2= Integer.MIN_VALUE;
		
		Scanner teklatua = new Scanner (System.in);
		
		System.out.println("Idatzi lehenengo zenbakia" );
		zenbakia1 = teklatua.nextInt();
		System.out.println("Idatzi bigarren zenbakia" );
		zenbakia2 = teklatua.nextInt();
		
		
		
		
		for (i = zenbakia1; i <= zenbakia2; i++) {
			
			
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
