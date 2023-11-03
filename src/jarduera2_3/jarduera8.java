package jarduera2_3;

public class jarduera8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//30 eta 50 artean dauden zenbaki bakoitien batuketa ateratzen duen programa
		
		int batuketa;
		int contador;
		int i;
		
		batuketa = 0;
		contador = 0;
		
		for (i=30; i <=50; i++) {
			if (i % 2 == 0) {
				batuketa += i;
			}
		}
		
		System.out.println("30 eta 50 arteko zenbaki bikoitien batuketa " + batuketa + " da.");
		
		
		
	
		
		
		


}
}
