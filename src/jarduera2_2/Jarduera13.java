package jarduera2_2;
import java.util.Scanner;
public class Jarduera13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hiru zenbaki eskatu eta behetik gora sartu diren edo ez zehaztu.

		int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Idatzi hiru zenbakieta esango dizut txikienetik handienera jarri dituzun");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1 < num2 && num2 < num3 ) {
			System.out.println("ONDO, zenbakiak txikienetik handienera daude");
		}
		else {
			System.out.println("TXARTO, zenbakiak ez daude txikienetik handienera");
		}
		
	}

}
