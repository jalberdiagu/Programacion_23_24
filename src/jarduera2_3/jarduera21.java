package jarduera2_3;
import java.util.Scanner;
public class jarduera21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzaileak sartzen duen zenbakiaren faktoriala atera.
		
		int zenbakia;
		int i;
		int faktoriala;
		
		faktoriala = 1;
		
		System.out.println("Idatzi zenbaki bat bere faktoriala jakiteko");
		
		Scanner teklatua = new Scanner(System.in);
		zenbakia = teklatua.nextInt();
		
		for (i = 1; i <= zenbakia; i ++ ) {
		faktoriala *= i;
		}
		
		System.out.println(zenbakia +" -ren faktoriala " + faktoriala +" da");
		
		teklatua.close();
		
		
		
		
		
		
		
	}
	

}
