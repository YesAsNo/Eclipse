package testejä;

import java.util.Scanner;

public class doitwhile {

	public static void main(String[] args) {

		// do-while
				// Tulostetaan numerot 1-5
				
				int laskuri = 0;
				
//				do
//				{
//					laskuri++;
//					System.out.println(laskuri);	
//				} while(laskuri < 5);
				
				
				// for (int laskuri = 0 ; laskuri < 5 ; laskuri++)
				
				
				// for hyvä, jos tiedetään monta kertaa loopataan.
				// Esim. tulostetaan 5 kertaa tai tulostetaan numerot 1-100
				// do-while on hyvä, jos EI tiedetä, monta kertaa loopataan
				// Esim. Haluatko pelata uudestaan? Pelaaja voi pelata kerran tai 10 kertaa
				
				// Do-while -esimerkki. Pin-koodin kysyminen. Ei tiedetä, monta kertaa kirjoittaa
				// Ei rajoiteta arvausmäärä
				
				Scanner in = new Scanner(System.in);
				
				String pinkoodivastaus;
				
				// vaihtoehto 1
				do
				{
					System.out.println("Kirjoita Pin-koodi");
					pinkoodivastaus = in.nextLine();	
				} while (!pinkoodivastaus.equals("1234"));
					// loopataan niin kauan, kun pin-koodi on väärin
				
				System.out.println("Koodi oikein.");
				
				
				
				// vaihtoehto 2. While-ehdossa on "ikuinen looppi" ja
				// loopista poistutaan loopissa olevalla if-lauseella (break)
				
				do
				{
					System.out.println("Kirjoita Pin-koodi");
					pinkoodivastaus = in.nextLine();
					if(pinkoodivastaus.equals("1234"))
					{
						break;
					}			
				} while (true);
				
				
				
				System.out.println("Koodi oikein.");
				

				
				
			}

		}