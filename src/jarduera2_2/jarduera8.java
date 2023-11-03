package jarduera2_2;

import java.util.Scanner;

public class jarduera8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Letra bat bokala den edo ez
		System.out.println("Idatzi letra bat jakiteko bokala den edo ez");
		String letra;
		Scanner scan = new Scanner(System.in);
		letra = scan.next();
		if (letra.equals  ("a") || letra.equals("e") || letra.equals ("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("Idatzitako letra bokal bat da");
		} else {
			System.out.println("Idatzitako letra ez da bokal bat");
		}
	}

}
