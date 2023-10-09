package testejä;

import java.util.Scanner;

public class VertaisArviointi

{


	public static void main(String[] args)

	{

		//Alustetaan skanneri näppäimmistölle

		Scanner scanner = new Scanner(System.in);

		//Kysytään käyttäjältä tiedot

		System.out.println("Etunimi?");

		String firstName = scanner.nextLine();

		System.out.println("Sukunimi?");

		String lastName = scanner.nextLine();

		System.out.println("Yrityksen verkkotunnus?");

		String eMail = scanner.nextLine();

		//Tarkistetaan puuttuiko jotain

		if (firstName.equalsIgnoreCase("") || lastName.equalsIgnoreCase("") || eMail.equalsIgnoreCase(""))

		{

			System.out.println("Virhe! Jokin tiedoista puuttui.");

		}

		//Kutsutaan kahta metodia mikäli tiedot saatiin

		else

		{

			generateEmail(firstName,lastName,eMail);

			generateUsername(firstName,lastName);

		}

	}

			public static void generateEmail(String firstName,String lastName,String eMail)

			{

				//Muutetaan kaikki kirjaimet pieniksi ja tulostetaan sähköposti

				System.out.println

				(firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + eMail.toLowerCase());

			}


			public static void generateUsername(String firstName,String lastName)

			{

				//Muutetaan kaikki kirjaimet pieniksi

				firstName = firstName.toLowerCase();

				lastName = lastName.toLowerCase();

				//Loopataan läpi etunimi ja tulostetaan neljä ensimmäistä kirjainta

				for (int i = 0; i < 4; i++) 

				{

					System.out.print

					(firstName.charAt(i));

				}

				//Loopataan läpi sukunimi ja tulostetaan neljä viimeistä kirjainta edellisen perään

				int lastIndex = lastName.length();

				int midIndex = 4;

				for (int i = lastIndex - midIndex; i < lastName.length(); i++) 

				{

					System.out.print(lastName.charAt(i));

				}

			}

}