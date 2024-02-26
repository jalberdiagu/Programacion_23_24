package jarduera2_5;

public class jarduera9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bi arrai sortu arrHile eta arrLitr. Lehenengoan urtarrilatik maiatzararteko hilabeteak gorde behar dira. Bigarrenean egindako euri litroak (123, 333,180,211,90).

        //Adibidez:
        //arrHile[0] -- urtarrila
        //arrLitr[0] -- 123
		
		// Hilabete bakoitzean egin duen euri litro kopurua bistaratu.

	   // Kalkulatu zein izan den hilabeterik euritsuena. Bistaratu hilabetea eta litroak.
		
		

		// Sortu urtarriletik maiatzera bitarteko hilabeteetarako matrizea (arrHile)
        String[] arrHile = {"Urtarrila", "Otsaila", "Martxoa", "Aìrila", "Maiatza"};
        
        // Sortu fabrikatutako euri-hondakinen antolaketa (arrLitr)
        int[] arrLitr = {123, 333, 180, 211, 90};
        
        // Erakutsi matrizearen balioak
        System.out.println("Urtarriletik maiatzera bitarteko hilabeteak:");
        for (int i = 0; i < arrHile.length; i++) {
            System.out.println("arrHile[" + i + "] -- " + arrHile[i]);
        }
        
        System.out.println("\\nFabrikatutako euri-oheak:");
        for (int i = 0; i < arrLitr.length; i++) {
            System.out.println("arrLitr[" + i + "] -- " + arrLitr[i]);
        }
		
		
		
		******
		
		
	}

}
