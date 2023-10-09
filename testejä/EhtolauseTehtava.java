package testejä;

public class EhtolauseTehtava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 16;
		int number2 = 15;
		
//Equal
		
		if (number1 == number2)
		{
			System.out.println("Number1 and Number2 are the same");
		}
		
		else
		{
			System.out.println("Number1 and Number2 are not the same");
		}

//Bigger or equal
		
				if (number1 >= number2)
				{
					System.out.println("Number1 is equal or bigger than Number2");
				}
				
				else
				{
					System.out.println("Number2 is bigger and not equal to Number1");
				
			}

//Bigger than
	
	if (number1 > number2)
	{
		System.out.println("Number1 is bigger than Number2");
	}
	
	else
	{
		System.out.println("Number2 is bigger than Number 1");
	
			}

	//Unequal
	
	if (number1 != number2)
	{
		System.out.println("Number1 is not equal to Number2");
	}
	
	else
	{
		System.out.println("Number1 is equal to Number2");
	
}

//Adding a third variable with AND (&&)
	
	int number3 = 16;
	
	if (number1 == number2 && number2 == number3)
	{
		System.out.println("Number 1, 2 and 3 are equals");
	}
	
	else
	{
		System.out.println("Numbers are different");
	}
	
//Third variable with OR (||)

	
	if (number1 == number2 || number2 == number3 || number1 == number3)
	{
		System.out.println("Two of the 3 variables are equals");
	}
	
	else
	{
		System.out.println("There are no double equals");
	}
	
	}
}
