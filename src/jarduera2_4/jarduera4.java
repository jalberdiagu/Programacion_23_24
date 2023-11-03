package jarduera2_4;
import java.util.Scanner;
public class jarduera4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hitz bat palindromoa den edo ez esan.
		
        Scanner teklatua = new Scanner(System.in);
        
        String zenbakiaEdoHitza;
        String zenbakiaEdoHitzaEspaziorikGabe;
        
        //Eskatu erabiltzaileari hitz edo zenbaki bat sartzeko
        System.out.println("Idatzi hitz edo zenbaki bat jakiteko polindromoa den: ");
        zenbakiaEdoHitza = teklatua.nextLine();
        
        // Kendu zuriuneak eta bihurtu minuskulara (maiuskulak eta zuriuneak baztertzeko)
        zenbakiaEdoHitzaEspaziorikGabe = zenbakiaEdoHitza.replaceAll("\\s", "").toLowerCase();
        
        // Egiaztatu polindromoa den
        if (esPalindromo(zenbakiaEdoHitzaEspaziorikGabe)) {
            System.out.println(zenbakiaEdoHitza + " polindromoa da.");
        } else {
            System.out.println(zenbakiaEdoHitza + " ez da polindromoa");
        }
        
      
        teklatua.close();
    }
    
	
    // Egiaztatzeko metodoa
	
    public static boolean esPalindromo(String cadena) {
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
		
		
		
		
		
		
		
	}

}
