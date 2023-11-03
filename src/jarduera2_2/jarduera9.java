package jarduera2_2;
import java.util.Scanner;
public class jarduera9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Idatzi zure erabiltzailea");
		Scanner scan=new Scanner (System.in);
		String erabiltzailea;
		String pasahitza;
		erabiltzailea=scan.next();
		pasahitza=scan.next();
		
		erabiltzailea = "ikaslea";
		if (erabiltzailea == "ikaslea") {
			System.out.println("Idatzitako erabiltzailea zuzena da");
		}
		else {
			System.out.println("Idatzitako erabiltzailea ez da zuzena");
		}
		System.out.println("Idatzi zure pasahitza");
		pasahitza=scan.next();	
	
		if(pasahitza!="ik2349") {
			System.out.println("Idatzitako pasahitza zuzena da");
		}
		else{
			System.out.println("Idatzitako pasahitza ez da zuzena");
		}
		
	}
}
	
