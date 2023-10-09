package testejä;

import java.util.Scanner;

public class Koe {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String Vastaus1;
		String Vastaus2;
		int tulos;

		System.out.println("Are you vigorous or moderate?");
		Vastaus1 = in.nextLine();

		System.out.println("Your activity level is "+Vastaus1+".");

		System.out.println("Write your activity level in numbers");
		Vastaus2 = in.nextLine();
		tulos = Integer.parseInt(Vastaus2);

		System.out.println("Your activity level is "+tulos+".");
		in.close();
		
	
// Using method
	
	checkActivityRecommendation(Vastaus1, tulos);
	}
	
// Method

	public static void checkActivityRecommendation(String activityLevel, int amount) {
		
		if (activityLevel.equals("vigorous"))
		{
			if (amount>=75 & activityLevel.equals("vigorous") )
			{
			System.out.println("You exercise enough according to the recommendations!");
			}
			else
			{
			System.out.println("You should exercise more!");
			}
		}
		else
		{	
			if (amount>=150 & activityLevel.equals("moderate") )
			{
			System.out.println("You exercise enough according to the recommendations!");
			}
		
			else
			{
			System.out.println("You should exercise more!");
			}
		}
	
	}
}
