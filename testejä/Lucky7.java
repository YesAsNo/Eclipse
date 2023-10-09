package testejä;

import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
	
		public static void main( String args[] ) {

		    	System.out.println("Lucky7");
		     
			// Scanner
				
				Scanner in = new Scanner(System.in);
						String Panos;
						
			// User input
						
				System.out.println("Paljonko rahaa haluat käyttää?");
				Panos = in.nextLine();
				Panosluvuksi = Integer.parseInt(Panos);
				
				System.out.println("Panoksesi on "+PanosInt+"€.");
				in.close();
		    	
			// Random Numbers
				
				Random rand = new Random(); 

				int numero = 10;

				int generoitu1 = rand.nextInt(numero); 
		      	int generoitu2 = rand.nextInt(numero);
		      	int generoitu3 = rand.nextInt(numero);
		      
		    // Printing the generated random numbers
		      System.out.println("Numerosi ovat "+generoitu1+", "+generoitu2+" ja "+generoitu3);
		    }

}
