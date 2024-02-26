package jarduera2_5;
import java.util.Scanner;
public class jarduera11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sarrera datu bezala asteko egun guztietako tenperatura daukagu, gradu Cº-etan. Honako emaitza nahi dugu:

	    // 1. Asteko batazbesteko tenperatura F graduetan.
	    // 2. Egunik beroena.
	    // 3. Batazbestekotik gora dauden egunak.
		
		 Scanner teklatua = new Scanner(System.in);
	        
	        // Definitu asteko egunak
	        String[] asteEgunak = {"Astelehena", "Asteartea ", "Asteazkena ", "Asteguna ", "Asteguna ", "Larunbata ", "Igandea"};
	        
	        // Galdetu erabiltzaileari asteko egun bakoitzeko tenperatura gradu Celsiusetan
	        double[] tenperaturakCelsius = new double[7];
	        double gehituTenperaturakCelsius = 0;
	        for (int i = 0; i < 7; i++) {
	            System.out.print("Introduce la temperatura en grados Celsius para " + asteEgunak[i] + ": ");
	            tenperaturakCelsius[i] = teklatua.nextDouble();
	            gehituTenperaturakCelsius += tenperaturakCelsius[i];
	        }
	        
	        // Kalkulatu asteko batez besteko tenperatura gradu Fahrenheittan
	        double batazBeztekoTenperaturaCelsius =   gehituTenperaturakCelsius / 7;
	        double temperaturaPromedioFahrenheit = (batazBeztekoTenperaturaCelsius * 9/5) + 32;
	        
	        // Aurkitu egunik beroena eta zenbatu egunak batez bestekoaren gainetik
	        int egunakBatazBestekoa = 0;
	        int EgunBerotsuenaCelsius = 0;
	        double temperaturaMasCalurosa =  tenperaturakCelsius[0];
	        for (int i = 1; i < 7; i++) {
	            if ( tenperaturakCelsius[i] > temperaturaMasCalurosa) {
	                temperaturaMasCalurosa =  tenperaturakCelsius[i];
	                tenperaturakCelsius = i;
	            }
	            if ( tenperaturakCelsius[i] >  tenperaturakCelsius) {
	            	egunakBatazBestekoa++;
	            }
	        }
	        
	        // Erakutsi emaitzak
	        System.out.println("Temperatura promedio semanal en grados Fahrenheit: " + temperaturaPromedioFahrenheit + " °F");
	        System.out.println("El día más caluroso de la semana es " +asteEgunak [temperaturaMasCalurosa] + " con " + temperaturaMasCalurosa + " °C");
	        System.out.println("Días por encima del promedio: " + egunakBatazBestekoa);
	        

	        teklatua.close();
		
		
		
		
		
		
		
	}

}
