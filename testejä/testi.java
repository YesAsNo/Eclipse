package testejä;

import java.util.Scanner;
import java.util.ArrayList;

public class testi {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int numOfSymbols = keyboard.nextInt();

		keyboard.nextLine(); // this will swallow the "\n"

		// Now your for loop should work fine
		for (int i = 0; i < numOfSymbols; i++)
		{
		    System.out.println("Enter the first symbol: ");
		    String userInputSymbol = keyboard.nextLine();
		    userSymbols.add(userInputSymbol);
		}
	}

}
