package jarduera21;
import java.util.Scanner;
public class jarduera4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaracion de variables
		int zenbakia;
		System.out.println("Idatzi zenbaki bat jakiteko bakoitia edo bikoitia den");
		Scanner scan=new Scanner (System.in);
		zenbakia=scan.nextInt();
		if (zenbakia %2==0) {
			System.out.println("Idatzitako zenbakia bikoitia da");
		}
		else {
			System.out.println("Idatzitako zenbakia bakoitia da");
		}
	}

}
