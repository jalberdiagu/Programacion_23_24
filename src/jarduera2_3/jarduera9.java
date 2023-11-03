package jarduera2_3;

public class jarduera9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100 artean dauden zenbaki bikoitien batuketa ateratzen duena eta zenbat zenbaki diren esaten duena.
		

		int batuketa;
		int contador;
		int i;
		
		batuketa = 0;
		contador = 0;
		
		for (i=1; i <=100; i++) {
			if (i % 2 == 0) {
				batuketa += i;
				contador++;
			}
		}
		
		System.out.println("30 eta 50 arteko zenbaki bikoitien batuketa " + batuketa + " da");
		System.out.println("30 eta 50 artean " + contador + " zenbaki bikoiti daude.");
		
	}
		
		
		
	}

