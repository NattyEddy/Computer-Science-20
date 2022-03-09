/*

Program: SpendingInClassExample.java          Last Date of this Revision: February 23, 2022 (header and screen dump March 9, 2022)

Purpose: Prompt for the money spent on certain categories, then calculate and print percentage spent on each category.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Science 20
 

*/

package Chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class SpendingInClassExample 
{
	public static void main(String[] args)
	{
		int food, clothing, entertainment, rent;
		double totalExpenditure, foodPercent, clothingPercent, entertainmentPercent, rentPercent;
		
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the amount spent last month on the following items:\n");
		
		System.out.print("Food: $");
		food = userInput.nextInt();
		System.out.println();
		
		System.out.print("Clothing: $");
		clothing = userInput.nextInt();
		System.out.println();
		
		System.out.print("Entertainment: $");
		entertainment = userInput.nextInt();
		System.out.println();

		System.out.print("Rent: $");
		rent = userInput.nextInt();
		System.out.println();
		
		totalExpenditure = (food + clothing + entertainment + rent);
		foodPercent = food / totalExpenditure;
		clothingPercent = clothing / totalExpenditure;
		entertainmentPercent = entertainment / totalExpenditure;
		rentPercent = rent / totalExpenditure;
		
		System.out.println("Category: \tBudget:");
		System.out.println("Food\t\t" + nf.format(foodPercent));
		System.out.println("Clothing\t" + nf.format(clothingPercent));
		System.out.println("Entertainment\t" + nf.format(entertainmentPercent));
		System.out.println("Rent\t\t" + nf.format(rentPercent));
	}
}

/*

Enter the amount spent last month on the following items:

Food: $101

Clothing: $288

Entertainment: $89

Rent: $1299

Category: 		Budget:
Food			6%
Clothing		16%
Entertainment	5%
Rent			73%


*/
