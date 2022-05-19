/*

Program: BlinkLED.java          Last Date of this Revision: May 18, 2022

Purpose: Follow the Blink LED lesson on phidgets.com

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class BlinkLED
{
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception
    {

        //Create | Here you've created a DigitalOutput object for your LED. An object represents how you interact with your device. DigitalOutput is a class from the Phidgets library that's used to provide a voltage to things like LEDs.
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Address | This tells your program where to find the device you want to work with. Your LED is connected to port 1 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        redLED.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | Here is where you can have some fun and use your Phidgets! You can turn your LED on/off by setting the state to true/false. The sleep command keeps your LED on by letting 1000 milliseconds pass before turning the LED off.
        int ledLoop = 0;
        while(true)
        {
            if (ledLoop < 3)
            {
            	redLED.setState(true);
                System.out.println("Red LED switched to ON");
                greenLED.setState(true);
                System.out.println("Green LED switched to ON");
                Thread.sleep(2000);
                redLED.setState(false);
                System.out.println("Red LED switched to OFF");
                greenLED.setState(false);
                System.out.println("Green LED switched to OFF");
                Thread.sleep(2000);
                ledLoop++;
            }
        }
    }
}
  