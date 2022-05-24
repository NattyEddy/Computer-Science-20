/*

Program: ButtonsAndLEDs.java          Last Date of this Revision: May 18, 2022

Purpose: Follow the Use Buttons and LEDs lesson on phidgets.com

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ButtonsAndLEDs
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
//        int ledLoop = 0;
        int redButtonPressed = 0;
        int greenButtonPressed = 0;
        boolean redButtonState = true;
        boolean greenButtonState = true;
        while(true)
        {
            
        	if (redButtonState != redButton.getState())
            {
            	greenLED.setState(!redButton.getState());
//        		System.out.print("Red Button State: " + !redButton.getState() + "\t");
            	redButtonState = redButton.getState();
            	redButtonPressed += 1 * (redButton.getState() ? 1 : 0);
            	System.out.println("Red button pressed: " + redButtonPressed);
            }
        	if (greenButtonState != greenButton.getState())
            {
            	redLED.setState(!greenButton.getState());
//        		System.out.print("Green Button State: " + !greenButton.getState() + "\t");
            	greenButtonState = greenButton.getState();
            	greenButtonPressed += 1 * (greenButton.getState() ? 1 : 0);
            	System.out.println("Green button pressed: " + greenButtonPressed);
            }
        	
        	Thread.sleep(5);
            
        }
    }
}
  