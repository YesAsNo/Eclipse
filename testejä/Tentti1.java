package testi1;
import java.util.Scanner;
public class Tentti1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		System.out.println("First number?");
		int Vastaus1 = sc.nextInt();  
		
		System.out.println("Second number?");
		int Vastaus2 = sc.nextInt();
		
		int tulos = Vastaus1 + Vastaus2; 
		
		System.out.println("The sum is " + tulos + ".");
	
//String kysymys
		
		Scanner in = new Scanner(System.in);
		String Vastaus3;
		String Vastaus4;
						
		System.out.println("What is your name?");
		Vastaus3 = in.nextLine();
		
		System.out.println("How old are you?");
		Vastaus4 = in.nextLine();
		
		System.out.println("Your name is " + Vastaus3 + " and you are " + Vastaus4 + " years old.");
		
}
}
