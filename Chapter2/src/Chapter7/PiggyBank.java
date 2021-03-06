/*

Program: PiggyBank.java          Last Date of this Revision: April 7, 2022

Purpose: Form the application for a savings account, emulating a piggy bank.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

public class PiggyBank {

	private double balance;
	
	// default
	public PiggyBank()
	{
		balance = 0;
	}
	
	// predetermined
	public PiggyBank(double savings)
	{
		balance = savings;
	}
	
	
	// the following methods add value to the balance based on coin quantities
	public void addTwoonies(int coins)
	{
		balance += coins * 2.00;
		System.out.printf("Added $%.2f\n", coins * 2.00);
	}
	
	public void addLoonies(int coins)
	{
		balance += coins * 1.00;
		System.out.printf("Added $%.2f\n", coins * 1.00);
	}
	
	public void addQuarters(int coins)
	{
		balance += coins * 0.25;
		System.out.printf("Added $%.2f\n", coins * 0.25);
	}
	
	public void addDimes(int coins)
	{
		balance += coins * 0.10;
		System.out.printf("Added $%.2f\n", coins * 0.10);
	}
	
	public void addNickels(int coins)
	{
		balance += coins * 0.05;
		System.out.printf("Added $%.2f\n", coins * 0.05);
	}
	
	public void addPennies(int coins)
	{
		balance += coins * 0.01;
		System.out.printf("Added $%.2f\n", coins * 0.01);
	}
	
	// clears the balance
	public void withdraw()
	{
		balance = 0;
		System.out.println("Balance reset");
	}
	
	
	// prints out the raw balance
	public double getBalance()
	{
		return balance;
	}
	
	// prints out the balance in a string
	public String toString()
	{
		return String.format("Balance: $%.2f", balance);
	}
	
	
	
	
	// test main
	public static void main(String[] args)
	{
		PiggyBank piggyBank = new PiggyBank();
		
		piggyBank.addQuarters(5);
		piggyBank.addDimes(10);
		piggyBank.addNickels(3);
		piggyBank.addPennies(9);
		piggyBank.addLoonies(4);
		piggyBank.addTwoonies(7);
		
		System.out.print(piggyBank.toString());
	}

}

/*
	Added $1.25
	Added $1.00
	Added $0.15
	Added $0.09
	Added $4.00
	Added $14.00
	Balance: $20.49
*/
