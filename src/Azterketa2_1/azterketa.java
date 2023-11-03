package Azterketa2_1;
import java.util.Scanner;
public class azterketa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Idatzi zure kalifikazioa");
		
		double kalifikazioa;
		
		
		Scanner teklatua = new Scanner (System.in);
		kalifikazioa=teklatua.nextDouble();
		
		if (kalifikazioa >=90 && kalifikazioa <= 100) {
			System.out.println("A");
		}
		else if (kalifikazioa >= 80 && kalifikazioa <=89) {
			System.out.println("B");
		}
		else if (kalifikazioa >= 70 && kalifikazioa <=79) {
			System.out.println("C");
		}
		else if (kalifikazioa >= 60 && kalifikazioa <=69) {
			System.out.println("D");
		}
		else if (kalifikazioa < 60) {
			System.out.println("F");
		}
		else {
			System.out.println("ERROREA");
		
		}
	}

}
