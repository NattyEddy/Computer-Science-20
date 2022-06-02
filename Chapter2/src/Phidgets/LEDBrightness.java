/*

Program: LEDBrightness.java          Last Date of this Revision: June 2, 2022

Purpose: Use the Phidgets box to control LED brightness.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {
  //Handle Exceptions 
  public static void main(String[] args) throws Exception{

      //Create 
      DigitalOutput redLED = new DigitalOutput();

      //Address 
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);

      //Open 
      redLED.open(1000);

      //Use your Phidgets with Duty Cycle
      while (true)
      {
    	  redLED.setDutyCycle(0.1);
    	  Thread.sleep(1000);
    	  redLED.setDutyCycle(0.5);
    	  Thread.sleep(1000);
    	  redLED.setDutyCycle(1.0);
    	  Thread.sleep(1000);
    	  redLED.setDutyCycle(0.5);
    	  Thread.sleep(1000);
    	  redLED.setDutyCycle(0.0);
    	  Thread.sleep(1000);
      }
      
  }
}
