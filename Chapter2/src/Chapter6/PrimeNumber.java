package Chapter6;

import java.util.Scanner;

public class PrimeNumber
{
	static Scanner userInput = new Scanner(System.in);
	
	public static void primeCheck(int numberToTest)
	{
		boolean isPrime;
		for (int i = numberToTest; i == 1; i--)
		{
			
			System.out.println(i);
			// if (numberToTest * i)
			// {
			// 	isPrime = true;
			// }
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a number to check if it's prime: ");
		int checkPrime = userInput.nextInt();
		
		primeCheck(checkPrime);
		// System.out.println(checkPrime % (checkPrime - 1));
		for (int i = checkPrime; i == 1; i--)
		{
			System.out.println(i);
		}
	}
}
