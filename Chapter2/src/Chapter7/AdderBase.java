/*

Program: AdderBase.java          Last Date of this Revision: April 26, 2022

Purpose: Provide the methods used for the adder game.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

import java.util.Scanner;

public class AdderBase
{
    private int userSum, sum, x, y, pointsAdded, pointsTotal;
    static Scanner testInput = new Scanner(System.in);

    public AdderBase()
    {
        userSum = 0;
        sum = 0;
        x = 0;
        y = 0;
        
        pointsTotal = 0;
    }

    /*
     * The basic methods to remember:
     * 
     * generateQuestion(lowRange, highRange)
     * saveUserSum(input)
     * userSumCheck()
     * getSum()
     * getQuestion()
     * 
     */
    
    public void generateQuestion(int low, int high)
    {
        x = (int)((high - low) * Math.random() + low);
        y = (int)((high - low) * Math.random() + low);

        sum = x + y;
    }

    public void saveUserSum(int input)
    {
        userSum = input;
    }

    public void addPoints(int tries)
	{
        switch (tries)
		{
			case 0:
                pointsAdded = 5;
                break;
            case 1:
				pointsAdded = 3;
                break;
            case 2:
            	pointsAdded = 1;
            	break;
            default:
                pointsAdded = 0;
                break;
		}
        pointsTotal += pointsAdded;
        System.out.println("Points added: +" + pointsAdded);
	}

    // *** updates after addPoints()
    public int getPointsAccumulated()
    {
        return pointsAdded;
    }

    public int getSum()
    {
        return sum;
    }
    
    public String getQuestion()
    {
        return String.format("%d + %d =", x, y);
    }

    public boolean userSumCheck()
    {
        return userSum == sum;
    }

    public int getPoints()
    {
        return pointsTotal;
    }


    // test main
    public static void main(String[] args)
    {
        AdderBase calculator = new AdderBase();
        
        
        int i = 0, j = 0, x = 0;
        while (i < 5 && j >= 0)
        {
            calculator.generateQuestion(1, 20);
            
            do 
            {
                System.out.print(calculator.getQuestion());
                j = testInput.nextInt();
                calculator.saveUserSum(j);
                if (j == calculator.sum)
                {
                    calculator.addPoints(x);
                    break;
                }
                else
                {
                    x++;
                }
                
            } while (x < 3);
            
            
            System.out.println(calculator.getSum());
            System.out.println("Points: " + calculator.pointsTotal);
        
            i++; x = 0;
        }
    }

}
