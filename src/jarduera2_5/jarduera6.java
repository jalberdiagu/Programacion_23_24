package jarduera2_5;

import java.util.Scanner;

public class jarduera6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

        String[] izenak = new String[5];
        
        izenak[0] = "Jon";
        izenak[1] = "Aitor";
        izenak[2] = "Iñaki";
        izenak[3] = "Ane";
        izenak[4] = "Maria";
        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Idatzi izen bat egiaztatzeko arrayaren barruan badago: ");
        String izenakTopatzen = scanner.nextLine();
        
     
        boolean aurkituta = false;
        for (int i = 0; i <= 4; i++) {
            if (izenak[i].equalsIgnoreCase(izenakTopatzen)) {
                aurkituta  = true;
                break;
            }
        }
        
        
        if (aurkituta) {
            System.out.println( izenakTopatzen + " Array-aren barruan dago.");
        } else {
            System.out.println(izenakTopatzen + " ez dago Array-ean gordenta");
        }
        
        scanner.close();

		
		
		
		
	}

}
