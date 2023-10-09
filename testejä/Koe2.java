package testejä;

import java.util.Scanner;

public class Koe2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String Vastaus;
		String Vastaus2;

		System.out.println("Activity level of exercise (vigorous/moderate)?");
		Vastaus = scanner.nextLine();

		int numbersRead = 1;
		int sum = 0;

		while (true) {
		    if (numbersRead == 8) {
		        break;
		    }

		    System.out.println("Minutes on "+numbersRead+". day?");
		    sum = sum + Integer.valueOf(scanner.nextLine());
		    numbersRead = numbersRead + 1;
		}
		
		System.out.println("How many times you did muscle strengthening and balance activities?");
		Vastaus2 = scanner.nextLine();
		
		System.out.println("You did "+sum+" minutes "+Vastaus+" exercise during week.");
		
	// Using method
		
		checkActivityRecommendation(sum, Vastaus2);
		}
		
	// Method

		public static void checkActivityRecommendation(int activityLevel, String training) {
			
			int luku;
			
			luku = Integer.parseInt(training);
			
			if (activityLevel >= 155 & luku >= 3)
			{
				System.out.println("You exercise enough according to the recommendations!");
			}
			
			else
			{
				System.out.println("You should exercise more!");
			}
		
		}
	}