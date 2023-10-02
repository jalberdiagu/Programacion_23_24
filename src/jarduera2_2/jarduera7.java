package jarduera2_2;
import java.util.Scanner;
public class jarduera7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zenbakia asteko ze egun den 
System.out.println("Idatzi zenbaki bat 1 eta 7ren artean dagoena");
int zenbakia;
Scanner scan=new Scanner (System.in);
zenbakia=scan.nextInt();
if (zenbakia==1){
	System.out.println("idatzitako zenbakia astelehena da");
}
else if(zenbakia==2){
	System.out.println("Idatzitako zenbakia astearteari dagokio");
}
else if(zenbakia==3){
	System.out.println("Idatzitako zenbakia asteazkenari dagokio");
	}
else if(zenbakia==4){
	System.out.println("Idatzitako zenbakia ostegunari dagokio");
	}
else if(zenbakia==5){
	System.out.println("Idatzitako zenbakia ostiralari dagokio");
	}
else if(zenbakia==6){
		System.out.println("Idatzitako zenbakia sapatuari dagokio");
		}
else if(zenbakia==7){
	System.out.println("Idatzitako zenbakia domekari dagokio");
}
else {
	System.out.println("ERROREA");
}
	}

}
