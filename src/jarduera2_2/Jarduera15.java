package jarduera2_2;
import java.util.Scanner;
public class Jarduera15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // 5 zenbaki sartu eta ikustarazi zein den handiena eta zein txikiena.
		
		int num1, num2, num3, num4, num5;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Idatzi 5 zenbaki jakiteko zein den handiena eta zein txikiena");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		
		if (num1 > num2 && num3 > num2 && num4 > num2 && num5 > num2) {
		System.out.println("Idatzitako zenbaki txikiena " + num2 + " da.");
		}
		else if (num2 > num1 && num3 > num1 && num4 > num1 && num5 > num1){
			System.out.println("Idatzitako zenbaki txikiena hau da: " + num1 );
		}
		else if (num2 > num1 && num3 > num1 && num4 > num1 && num5 > num1){
			System.out.println("Idatzitako zenbaki txikiena hau da: " + num1 );
		}
		else if (num2 > num3 && num4 > num3 && num4 > num3 && num5 > num3){
			System.out.println("Idatzitako zenbaki txikiena hau da: " + num3 );
		}
		else if (num2 > num4 && num3 > num4 && num1 > num4 && num5 > num4){
			System.out.println("Idatzitako zenbaki txikiena hau da: " + num4);
		}
		else if (num2 > num5 && num3 > num5 && num4 > num5 && num1 > num5){
			System.out.println("Idatzitako zenbaki txikiena hau da:" + num5 );
		}
		
		if (num1 > num5 && num1 > num4 && num1 > num3 && num1 > num2) {
			System.out.println("Idatzitako zenbaki handiena hau da: " + num1);
		}
		else if (num1 > num5 && num1 > num4 && num1 > num3 && num1 > num2) {
			System.out.println("Idatzitako zenbaki handiena hau da: " + num1);
	}
		else if (num2 > num5 && num2 > num4 && num2 > num3 && num2 > num1) {
			System.out.println("Idatzitako zenbaki handiena hau da: " + num2);
		}
		else if (num3 > num5 && num3 > num4 && num3 > num2 && num3 > num1) {
			System.out.println("Idatzitako zenbaki handiena hau da: " + num3);
		}
		else if (num4 > num5 && num4 > num2 && num4 > num3 && num4 > num1) {
			System.out.println("Idatzitako zenbaki handiena hau da: " + num4);
		}
		else if (num5 > num4 && num5 > num4 && num5 > num3 && num5 > num1) {
			System.out.println("Idatzitako zenbaki handiena hau da: " + num5);
		}
}
}

