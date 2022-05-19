/*

Program: TugOfWar.java          Last Date of this Revision: May 19, 2022

Purpose: Use the Phidgets box to simulate a game of TugOfWar.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TugOfWar
{
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception
    {

        //Create | Here you've created a DigitalOutput object for your LED. An object represents how you interact with your device. DigitalOutput is a class from the Phidgets library that's used to provide a voltage to things like LEDs.
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address | This tells your program where to find the device you want to work with. Your LED is connected to port 1 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //Use your Phidgets | Here is where you can have some fun and use your Phidgets! You can turn your LED on/off by setting the state to true/false. The sleep command keeps your LED on by letting 1000 milliseconds pass before turning the LED off.
        int tugCount = 0;
        boolean redButtonState = true;
        boolean greenButtonState = true;
        boolean countChange = false;
        
        while(true)
        {
            
        	// register red and green button presses and add to tugCount
        	if (redButtonState != redButton.getState())
            {
            	redLED.setState(redButton.getState());
            	redButtonState = redButton.getState();
            	tugCount += redButton.getState() ? 1 : 0;
            	countChange = redButton.getState();
            }
        	if (greenButtonState != greenButton.getState())
            {
            	greenLED.setState(greenButton.getState());
            	greenButtonState = greenButton.getState();
            	tugCount -= greenButton.getState() ? 1 : 0;
            	countChange = greenButton.getState();
            }
        	if (countChange == true)
        	{
        		System.out.println("Tug Count: " + tugCount);
        		countChange = false;
        	}
        	
        	// compare win condition and terminate program
        	switch (tugCount)
        	{
        		case 10:
        			greenLED.setState(false);
        			System.out.println("Red Wins!");
        			for (int i = 0; i <= 10; i++)
        			{
        				redLED.setState(!redLED.getState());
        				Thread.sleep(100);
        			}
        			System.exit(0);
        		case -10:
        			redLED.setState(false);
        			System.out.println("Green Wins!");
        			for (int i = 0; i <= 10; i++)
        			{
        				greenLED.setState(!redLED.getState());
        				Thread.sleep(100);
        			}
        			System.exit(0);
        	}
        	
        	Thread.sleep(5);
            
        }
    }
}
  