package jarduera2_5;

public class jarduera1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 luzerako arraia definitu eta hitzekin bete

		String[] hitzak = new String[5];
		
		hitzak[0] = "Kaixo";
		hitzak[1] = "Mundua";
		hitzak[2] = "Jon";
		hitzak[3] = "Alberdi";
		hitzak[4] = "Aguirre";
		
		int i;
		
		for (i = 0; i < hitzak.length; i++) {
			System.out.println(i + ". elementuan " + hitzak[i] + " dago");
		}
		
		
	}

}
