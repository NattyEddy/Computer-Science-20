/*

Program: ButtonsAndLEDEvents.java          Last Date of this Revision: June 7, 2022

Purpose: Use events to utilize buttons and LED action.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/
package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class ButtonsAndLEDEvents {
  //Turn on/off LEDs with Global Variables
  static boolean turnRedLEDState = false;
  static boolean turnGreenLEDState = false;
  static int clicks = 0;
  static int totalClicks = 0;
  
  public static void win(DigitalOutput colorLED) throws Exception {
	  for (int i = 0; i < 10; i++) {
		  colorLED.setState(!colorLED.getState());
		  Thread.sleep(200);
	  }
	  colorLED.setState(false);
  }
  
  //Handle Exceptions
  public static void main(String[] args) throws Exception {

      //Create
      DigitalInput redButton = new DigitalInput();
      DigitalInput greenButton = new DigitalInput();
      DigitalOutput redLED = new DigitalOutput();
      DigitalOutput greenLED = new DigitalOutput();
      
      //Address
      redButton.setHubPort(0);
      redButton.setIsHubPortDevice(true);
      greenButton.setHubPort(5);
      greenButton.setIsHubPortDevice(true);
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);
      greenLED.setHubPort(4);
      greenLED.setIsHubPortDevice(true);

      //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
      redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              //Record button state to turn on/off the red LED
              turnRedLEDState = e.getState();
              if (e.getState() == true) {
            	  clicks++;
            	  totalClicks++;
            	  System.out.printf("Points: %d\t(Total: %d)\n", clicks, totalClicks);
              }
          }
      });

      //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
      greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              //Record button state to turn on/off the green LED
              turnGreenLEDState = e.getState();
              if (e.getState() == true) {
            	  clicks--;
            	  totalClicks++;
            	  System.out.printf("Points: %d\t(Total: %d)\n", clicks, totalClicks);
              }
          }
      });

      //Open
      redLED.open(1000);
      greenLED.open(1000);
      redButton.open(1000);
      greenButton.open(1000);

      //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
      while(true) {
          greenLED.setState(turnRedLEDState);
          redLED.setState(turnGreenLEDState);
          if (clicks == 10) {
        	  redButton.close();
        	  greenButton.close();
        	  System.out.println("Red wins!");
        	  win(redLED);
        	  break;
          }
          else if (clicks == -10) {
        	  redButton.close();
        	  greenButton.close();
        	  System.out.println("Green wins!");
        	  win(greenLED);
        	  break;
          }
          
          Thread.sleep(1);
      }
  }
}
