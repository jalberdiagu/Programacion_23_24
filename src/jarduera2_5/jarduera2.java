package jarduera2_5;
import java.util.Scanner;
public class jarduera2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5 luzerako arraia definitu, eta teklatutik sartutako hitzekin bete.

		Scanner teklatua = new Scanner(System.in);
		
		System.out.println("Idatzi bost hitz");
		String[] hitzak = new String[5];
		
		int i;
		
		for (i = 0; i <= 4; i++) {
			System.out.println("Idatzi " + i + ". hitza:");
			hitzak[i] = teklatua.nextLine();
			
		}
		
		for ( i = 0; i < hitzak.length; i++) {
			System.out.println(i + ". elementuan " + hitzak[i] + " gorde da");
		}
		
		
		
		
	}

}
