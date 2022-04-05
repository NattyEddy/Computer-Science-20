/*

Program: PiggyBank.java          Last Date of this Revision: April 5, 2022

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
	public void addTwooniesCents(int coins)
	{
		balance += coins * 2.00;
	}
	
	public void addLooniesCents(int coins)
	{
		balance += coins * 1.00;
	}
	
	public void addQuartersCents(int coins)
	{
		balance += coins * 0.25;
	}
	
	public void addDimesCents(int coins)
	{
		balance += coins * 0.10;
	}
	
	public void addNickelsCents(int coins)
	{
		balance += coins * 0.05;
	}
	
	public void addPenniesCents(int coins)
	{
		balance += coins * 0.01;
	}
	
	// clears the balance
	public void withdraw()
	{
		balance = 0;
	}
	
	
	// prints out the balance in a string
	public String toString()
	{
		return String.format("The current balance is $%.2f", balance);
	}
	
	
	
	
	// test main
	public static void main(String[] args)
	{
		PiggyBank piggyBank = new PiggyBank();
		
		piggyBank.addQuartersCents(5);
		piggyBank.addDimesCents(10);
		piggyBank.addNickelsCents(3);
		piggyBank.addPenniesCents(9);
		piggyBank.addLooniesCents(4);
		piggyBank.addTwooniesCents(7);
		
		System.out.print(piggyBank.toString());
	}

}
