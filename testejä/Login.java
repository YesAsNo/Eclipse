package testi1;

import java.util.Scanner;

public class Login {

			public static void main(String[] args) {
			
			// Scanner
				
				Scanner in = new Scanner(System.in);
						String Etunimi;
						String Sukunimi;
						String Verkkotunnus;
						
			//User input
						
				System.out.println("Etunimi?");
				Etunimi = in.nextLine();
				
				System.out.println("Sukunimi?");
				Sukunimi = in.nextLine();
				
				System.out.println("Yrityksen verkkotunnus?");
				Verkkotunnus = in.nextLine();
			
			//Checks if any fields are empty and gives an error if so
				
				if (Etunimi.equals("") || Sukunimi.equals("") || Verkkotunnus.equals(""))
				{
					System.out.println("Virhe! Jokin tiedoista puuttui.");
				}
				
			//Else uses methods to generate an email and a username
				
				else
				{
				GenerateEmail(Etunimi, Sukunimi, Verkkotunnus);
				GenerateUsername(Etunimi, Sukunimi);
				in.close();
				}
				
		}
			// Generate email method
			
			public static void GenerateEmail(String firstname, String lastname, String organisation) {
				
				String Email = firstname+"."+lastname+"@"+organisation;
				System.out.println(Email.toLowerCase());
				
		}
			// Generate username method
			
			public static void GenerateUsername(String Etunimi2, String Sukunimi2) {
		
				String Etuliite = Etunimi2.substring(0,4);
				String Takaliite = Sukunimi2.substring(Sukunimi2.length()-4);
				String Username = Etuliite+Takaliite;
				System.out.println(Username.toLowerCase());
				
		}
}
		
