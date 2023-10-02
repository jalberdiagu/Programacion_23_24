package jarduera2_2;
import java.util.Scanner;
public class jarduera1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Idatzi zenbaki bat");
		float numero;
		Scanner scan=new Scanner (System.in);
		numero=scan.nextInt();
		if(numero>=5){
			System.out.println("Zorionak! Idatzitako zenbakia gaindituta dago");
		}
		else {
			System.out.println("Idatzitako zenbakia ez dago gaindituta");
		}
			
	}

}
