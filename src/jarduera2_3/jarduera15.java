package jarduera2_3;
import java.util.Scanner;
public class jarduera15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//erabiltzaileak zehaztutako baloaren biderkatzaileak ateratzen dituena 0 eta 100 artean.
		
		int i, zenbakia;
		
		System.out.println("Idatzi zenbaki bat, erakusteko bere biderkatzaileak 0-tik 100-ra");
		
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		
		System.out.println("Zehaztatutako balorearen biderkatzaileak hauek dira:" );
		
		for (i = zenbakia; i <= 100; i++) {
		if (i % zenbakia == 0) {
			System.out.println(i);
		}
			
		}
		

		
		
		
		
		
		
		
	}

}
