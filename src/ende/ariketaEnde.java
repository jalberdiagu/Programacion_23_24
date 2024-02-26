package ende;
import java.util.Scanner;
public class ariketaEnde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner teclado = new Scanner(System.in);

	        System.out.print("Ingrese un número entero: ");
	        int numero = teclado.nextInt();

	        if (esNumeroValido(numero)) {
	            System.out.println("CORRECTO");
	        } else {
	            System.out.println("INCORRECTO");
	        }

	        teclado.close();
	    }

	    // Método que verifica si el número es un entero par entre 1000 y 2000 (ambos incluidos)
	    public static boolean esNumeroValido(int numero) {
	        return numero % 2 == 0 && numero >= 1000 && numero <= 2000;
	    }
	}