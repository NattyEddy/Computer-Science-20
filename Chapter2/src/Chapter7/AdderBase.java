/*

Program: AdderBase.java          Last Date of this Revision: April 7, 2022

Purpose: Provide the methods used for the adder game.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Chapter7;

import java.util.Scanner;

public class AdderBase
{
    private int userSum, sum, x, y;
    
    public AdderBase()
    {
        userSum = 0;
        sum = 0;
        x = 0;
        y = 0;
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


    // test main
    public static void main(String[] args)
    {
        AdderBase calculator = new AdderBase();
        Scanner testInput = new Scanner(System.in);
        
        int i = 0, j = 0;
        while (i < 5 && j >= 0)
        {
            calculator.generateQuestion(1, 20);
            System.out.print(calculator.getQuestion() + " = ");
            j = testInput.nextInt();
            calculator.saveUserSum(j);
            
            System.out.println(calculator.getSum());
            System.out.println("Correct: " + calculator.userSumCheck());
        
            i++;
        }
    }

}
