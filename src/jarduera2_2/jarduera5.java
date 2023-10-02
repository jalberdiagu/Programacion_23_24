package jarduera2_2;
import java.util.Scanner;
public class jarduera5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// zenbakia 0 eta 10 artean badago
		System.out.println("idatzi zenbaki bat");
		float zenbakia;
		Scanner scan=new Scanner (System.in);
		zenbakia=scan.nextInt();
		if (zenbakia <= 10 && zenbakia>=0) {
			System.out.println("Idatzitako zenbakia 0 eta 10 zenbakien artean dago");
		}
		else {
			System.out.println("idatzitako zenbakia ez dago 0 eta 10 zenbakien artean");
		}
	}

}
