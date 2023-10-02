package jarduera2_2;
import java.util.Scanner;
public class jarduera12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kotxearen potentzia kalkulatu, KWtan ematen bada, 
		//CVak atera eta CVetan bada, kWak atera (1kW = 1,35 CV). K edo C baloreak eskatu, jakiteko sartutako balorea kWetan den edo CVetan.
		
		int potentzia;
		String unitatea;
		Scanner scan=new Scanner (System.in);
		System.out.println("Idatzi kotzearen potentzia");
		
		potentzia=scan.nextInt();
		
		System.out.println("Idatzi unitatea");
		unitatea=scan.next();
		
		if (unitatea.equalsIgnoreCase ("CV")) {
			System.out.println("Potentzia KW-tan" + potentzia/1.35 +" da");
		}
		else if (unitatea.equals("KW")
				) {
			System.out.println("Potentzia CV-tan " + potentzia*1.35);
		}
		else {
			System.out.println("Errorea");
		}
	}

}
