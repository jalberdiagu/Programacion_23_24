package jarduera2_2;
import java.util.Scanner;
public class jarduera16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 zenbaki eskatu eta adierazi hirugarrena aurreko bien batuketa den edo ez

		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3, batuketa;
	
		System.out.println("Idatzi 3 zenbaki eta hirugarrena lehenengo bien batuketa izatea");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		batuketa = num1 + num2;
		
		if (batuketa == num3) {
			System.out.println("idatzitako hirugarren zenbakia lehenengo bien batuketa da");
		}
		else {
			System.out.println("Idatzitako 3 zenbakia EZ da lehenengo bien batuketa");
		}
	}

}
