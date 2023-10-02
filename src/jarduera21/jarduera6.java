package jarduera21;
import java.util.Scanner;
public class jarduera6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Scanner scan=new Scanner (System.in);
		System.out.println("introduce la temperatura en grados(C):");
		c=scan.nextInt();
		System.out.println("La temperatu en Frarenheim es " +c*1.8+32);
		scan.close();
	}

}
