package jarduera2_5;

import java.util.Scanner;

public class jarduera5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		


        String[] izenak = new String[5];
        
     
        Scanner scanner = new Scanner(System.in);
        
   
        for (int i = 0; i < 5; i++) {
            System.out.print("Idatzi izen bat: ");
            izenak[i] = scanner.nextLine();
        }
        

        System.out.println("Hauek dira A letrarekin hasten diren izenak:");
        for (String izena : izenak) {
            if (izena.startsWith("A") || izena.startsWith("a")) {
                System.out.println(izena);
            }
        }
        
     
        scanner.close();


	}

}
