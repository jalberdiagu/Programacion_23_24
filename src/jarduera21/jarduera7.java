package jarduera21;
import java.util.Scanner;
public class jarduera7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  oinarria, altuera, emaitza;
		
		System.out.println("Idatzi triangeluaren oinarria");
		
		Scanner teklatua=new Scanner (System.in);
		oinarria = teklatua.nextDouble();
		System.out.println("Idatzi karratuaren altuera");
		altuera = teklatua.nextDouble();
		
		emaitza= oinarria *altuera/2;
				
				
		System.out.println("Karratueren azalera "+ emaitza + " da");	
		
	}

}
