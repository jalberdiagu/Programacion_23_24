package jarduera2_2;
import java.util.Scanner;
public class jarduera2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// zenbaki biren arteko handiena
System.out.println("Idatzi bi zenbaki");
float num1, num2;
Scanner scan=new Scanner (System.in);
num1=scan.nextInt();
num2=scan.nextInt();
if(num1<num2){
	System.out.println("Zenbaki handiena " + num2 +" da");
}
else {
	System.out.println("Zenbaki handiena " + num1 +" da");
}
	}

}
