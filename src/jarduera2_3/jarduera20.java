package jarduera2_3;

public class jarduera20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci segidako lehenengo 10 zenbakiak atera.
		
		int i; 
		int lehenengoZenbakia;
		int bigarrenZenbakia;
		int hurrengoZenbakia; 
		
		lehenengoZenbakia = 0;
		bigarrenZenbakia = 1;
		
		
		System.out.println(lehenengoZenbakia);
		System.out.println(bigarrenZenbakia);
		
		for (i = 1; i <= 8; i++) {
			hurrengoZenbakia = lehenengoZenbakia + bigarrenZenbakia;
			lehenengoZenbakia = bigarrenZenbakia;
			bigarrenZenbakia = hurrengoZenbakia;
			
		System.out.println(hurrengoZenbakia);
		
		
		}
		
		
		
		

	}

}
