package jarduera2_2;

import java.util.Scanner;

public class jarduera3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// zenbakia positiboa, negatiboa edo zero den
		System.out.println("Idatzi zenbaki bat, jakiteko positiboa, negatiboa edo zero den");
		float zenbakia;
		Scanner scan=new Scanner (System.in);
		zenbakia=scan.nextInt();
		if(zenbakia<0) {
			System.out.println("Idatzitako zenbakia negatiboa da");
		}
		else if (zenbakia==0) {
			System.out.println("Zenbakia 0 da");
		}
		else if (zenbakia >0) {
			System.out.println("Idatzitako zenbakia positiboa da");
		}
		else {
			System.out.println("ERROREA");
		}
			}

		}

