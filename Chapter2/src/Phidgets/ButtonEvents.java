/*

Program: ButtonEvents.java          Last Date of this Revision: June 2, 2022

Purpose: Similar to ReadButton.java but with events!

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class ButtonEvents {
  //Handle Exceptions
  public static void main(String[] args) throws Exception {
     
      //Create
      DigitalInput redButton = new DigitalInput();
      DigitalInput greenButton = new DigitalInput();

      //Address
      redButton.setIsHubPortDevice(true);
      redButton.setHubPort(0);
      
      greenButton.setIsHubPortDevice(true);
      greenButton.setHubPort(5);
      
      //Event
      redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              if (e.getState() == true) {
            	  System.out.println("Pressed.");
              }
              else {
            	  System.out.println("Not pressed.");
              }
          }
      });
      
      greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              if (e.getState() == true) {
            	  try {
					redButton.close();
					greenButton.close();
					System.out.println("Closing program...");
					System.exit(0);
				} catch (PhidgetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
              }
          }
      });

      //Open
      redButton.open(1000);
      greenButton.open(1000);

      //Keep program running
      while (true) {
          Thread.sleep(999999999);
      }
  }
}
