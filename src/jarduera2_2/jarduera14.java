package jarduera2_2;
import java.util.Scanner;
public class jarduera14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//Hiru zenbaki eskatu eta ikustarazi txikienetik handienera.

		int num1, num2, num3;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Idatzi hiru zenbaki txikienetik handienera erakusteko");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if (num1<num2 && num2 < num3){
				System.out.println("Horrela dira txikienetik handienera " + num1 + num2 +num3);
			}
			else if(num1>num2 && num1 < num3) {
				System.out.println("Horrela dira txikienetik handienera " + num2 + num1 + num3);
			}
			else if (num1>num2 && num2>num3) {
			System.out.println("Horrela dira txikienetik handienera" + num3 + num2 + num1);
		}
			else if (num1<num2 && num3<num2) {
			System.out.println("Horrela dira txikienetik handienera" + num1 + num3 + num2 );
		}
			else if (num3<num1 && num1<num2) {
			System.out.println("Horrela dira txikienetik handienera" + num3 + num1 +num2);
		}
			else if (num2<num3 && num3<num1) {
			System.out.println("Horrela dira txikienetik handienera" +num2 + num3 + num1);
		}
		else {
			System.out.println("ERROREA");
		}
		}
	
			
		
		
		
		
		
	   
	}

