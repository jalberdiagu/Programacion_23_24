package jarduera2_4;

import java.util.Scanner;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		
		Scanner teklatua = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
        frase = teklatua.nextLine();

        // Recorrer la frase y mostrar cada carácter en una línea separada
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            System.out.println(caracter);
        }

	}

}
