package jarduera2_4;

public class jarduera9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//“ABCD” kateko karaktereak ASCII-ra pasatu. char erabili.

		 String abc;
		 abc = "ABCDEFGHIJKLMNÑOPQRSTUVWYZ";
		 char karakterea;

	      
	        for (int i = 0; i < abc.length(); i++) {
	            karakterea = abc.charAt(i);
	            int ASCIIvalorea = (int) karakterea;
	            System.out.println("ASCII-ren balorea '" + karakterea + "' da: " + ASCIIvalorea);
		
	  
	      }
	        
	        
	}

}
