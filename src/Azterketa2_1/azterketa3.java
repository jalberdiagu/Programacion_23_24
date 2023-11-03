package Azterketa2_1;
import java.util.Scanner;
public class azterketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sartu asteko egun bat: astelehena, asteartea, asteazkena, osteguna, ostirala, larunbata edo igandea");
		
		String astekoEguna;
		
		
		Scanner teklatua = new Scanner(System.in);
		astekoEguna = teklatua.next();
		
		if (astekoEguna == "Astelehena") {
			System.out.println("Ordutegia: 9:00 AM-tik 8:00 PM-ra." );
		}
		else if (astekoEguna == "Asteartea") {
			System.out.println("Ordutegia: 9:00 AM-tik 8:00 PM-ra." );
		}
		else if (astekoEguna == "Asteazkena") {
			System.out.println("Ordutegia: 9:00 AM-tik 8:00 PM-ra." );
		}
		else if (astekoEguna == "Osteguna") {
			System.out.println("Ordutegia: 9:00 AM-tik 8:00 PM-ra." );
		}
		else if (astekoEguna == "Ostirala") {
			System.out.println("Ordutegia: 9:00 AM-tik 8:00 PM-ra." );
		}
		else if (astekoEguna == "Larunbata") {
			System.out.println("Ordutegia: 10:00 AM-tik 6:00 PM-ra." );
		}
		else if (astekoEguna == "Igandea") {
			System.out.println("Egun guztia dago itxita" );
		}
		else {
			System.out.println("Ez duzu baliozko asteko egunik sartu");
		}

		

	}

}
