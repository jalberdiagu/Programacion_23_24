package jarduera2_2;
import java.util.Scanner;
public class jarduera6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 Zenbakiren batuketa eta batazbestekoa
		System.out.println("Idatzi hiru zenbaki");
		double zenbakia1, zenbakia2, zenbakia3, batuketa, batazbestekoa;
	Scanner scan=new Scanner (System.in);
	zenbakia1=scan.nextInt();
	zenbakia2=scan.nextInt();
	zenbakia3=scan.nextInt();
	batuketa= zenbakia1 + zenbakia2 +zenbakia3;
	System.out.println("Idatzitako zenbakien batuketa "+ batuketa + "da");
	batazbestekoa = batuketa/3;
	System.out.println("Eta zenbakien batazbestekoa "+ batazbestekoa + "da");
	}

}
