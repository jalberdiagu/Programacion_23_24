package jarduera2_5;
import java.util.Scanner;
public class jarduera12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10eko arraia bete. Katea eskatu eta kate hori zenbat hitzetan agertzen den (bilaketa bat egin).

	
		Scanner teklatua = new Scanner(System.in);
		
		int ikasleKopurua = 0; 
		int i = 0;
		int gehiketa = 0;
		
		System.out.println("Idatzi zenbat ikasle dauden gelan");
		ikasleKopurua=teklatua.nextInt();
		
		int[] notak = new int[ikasleKopurua];
		
		for (i = 0; i <= ikasleKopurua; i++) {
			System.out.println("Idatzi " + (i+1) + " ikaslearen nota");
			notak[i] = teklatua.nextInt();
			
		}
		
		for (i = 0; i <= ikasleKopurua; i++) {
			notak += gehiketa;

		
		}
		
		
		
	}

}
