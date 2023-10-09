package testejä;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int luku;
		int tulos;

		Scanner in = new Scanner(System.in);
				String Vastaus;
		
		System.out.println("Kirjoita jotain. Toistan sen.");
		Vastaus = in.nextLine();
		
		System.out.println(Vastaus);
		
		System.out.println("Kirjoita luku, kerron sen kahdella");
		Vastaus = in.nextLine();
		luku = Integer.parseInt(Vastaus);
		tulos = luku * 2;
		
		System.out.println(tulos);
		in.close();
}
}
