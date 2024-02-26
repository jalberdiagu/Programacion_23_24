package jarduera2_5;
import java.util.Scanner;
public class jarduera10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Gelako ikasleen izena eta adina datutzat hartuta, honako informazioa bistaratu nahi da:

	   //1. 20 urte edo gutxiago duten ikasleen kopurua.
       //2. Gelako batazbesteko adina.
       //3. Gelako ikaslerik gazteena eta bere izena
		
		Scanner teklatua = new Scanner(System.in);

        // Galdetu erabiltzaileari klaseko ikasle kopurua.
        System.out.print("Idatzi klaseko ikasle kopurua: ");
        int numIkasleak = teklatua.nextInt();
        
        // Sortu matrizeak izenak eta adinak gordetzeko
        String[] izenak = new String[numIkasleak];
        int[] adinak = new int[numIkasleak];
        
        //Galdetu erabiltzaileari ikasleen izenak eta adina
        for (int i = 0; i < numIkasleak; i++) {
            teklatua.nextLine(); // Garbitu eskaner-bufferra
            System.out.print("Idatzi ikaslearen izena #" + (i + 1) + ": ");
            izenak[i] = teklatua.nextLine();
            System.out.print("Idatzi ikaslearen # adina" + (i + 1) + ": ");
            adinak[i] = teklatua.nextInt();
        }
        
        //Kalkulatu 20 urtetik beherako ikasleen kopurua
        int numIkasle20gitxiago = 0;
        int gehiketaAdinak = 0;
        int adinaMinimoa = adinak[0];
        String ikasleGazteenarenIzena = izenak[0];
        
        for (int i = 0; i < numIkasleak; i++) {
            if (adinak[i] <= 20) {
            	numIkasle20gitxiago++;
            }
            gehiketaAdinak += adinak[i];
            if (adinak[i] < adinaMinimoa) {
                adinaMinimoa = adinak[i];
                ikasleGazteenarenIzena = izenak[i];
        }
        
        // Kalkulatu klasearen batez besteko adina
        double adinaMedia = (double) gehiketaAdinak / numIkasleak;
        
        // Erakutsi informazioa
        System.out.println("Número de estudiantes de 20 años y menos: " + numIkasle20gitxiago );
        System.out.println("Edad media de la clase: " + adinaMedia);
        System.out.println("El alumno más joven de la clase es " + ikasleGazteenarenIzena + " y tiene " + adinaMinimoa + " años.");
        
       
        teklatua.close();
		
        }
	}

}



   
