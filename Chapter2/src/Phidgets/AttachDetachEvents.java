/*

Program: AttachDetachEvents.java          Last Date of this Revision: June 7, 2022

Purpose: Utilize Attach/Detach Events with Phidgets components.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents {
  
  static boolean printTemperature = false;
  
  public static void main(String[] args) throws Exception {
     
       //Create
      TemperatureSensor temperatureSensor = new TemperatureSensor();
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

      //Data Event | Event code runs when data from sensor changes. 
      temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
          public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
              //Print temperature
              if (printTemperature == true) {
            	  System.out.println("Temperature: " + e.getTemperature() + "°C");
              }
          }
      });

      //Attach Event | Attach Events run when a Phidget is connected to the Object
      temperatureSensor.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Temperature Sensor Attached!");
          }
      });

      //Detach Event | Detach Events run when a Phidget is disconnected from the Object
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Temperature Sensor Detached!");
          }
      });
      
      //Data Event 
      redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
    	  	public void onStateChange(DigitalInputStateChangeEvent e) {
//    	  		System.out.println("Red Button State: " + e.getState());
              	try {
  					redLED.setState(e.getState());
  				} catch (PhidgetException e1) {
  					e1.printStackTrace();
  				}
              	if (e.getState() == true) {
              		printTemperature = false;
              		System.out.println("Printing Temperature: OFF");
              	}
          	}
      });

      //Attach Event 
      redButton.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Red Button Attached!");
          }
      });

      //Detach Event 
      redButton.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Red Button Detached!");
          }
      });
      
      //Data Event 
      greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
//            System.out.println("Green Button State: " + e.getState());
              try {
            	  greenLED.setState(e.getState());
              } catch (PhidgetException e1) {
            	  e1.printStackTrace();
              }
              if (e.getState() == true) {
            		printTemperature = true;
            		System.out.println("Printing Temperature: ON");
              }
          }
      });

      //Attach Event 
      greenButton.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Green Button Attached!");
          }
      });

      //Detach Event 
      greenButton.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Green Button Detached!");
          }
      });
      
      //Attach Event 
      redLED.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Red LED Attached!");
          }
      });

      //Detach Event 
      redLED.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Red LED Detached!");
          }
      });
      
      //Attach Event 
      greenLED.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Green LED Attached!");
          }
      });

      //Detach Event 
      greenLED.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Green LED Detached!");
          }
      });

      //Open
      temperatureSensor.open(1000);
      redLED.open(1000);
      greenLED.open(1000);
      redButton.open(1000);
      greenButton.open(1000);
      

      //Keep program running
      while (true) {
          Thread.sleep(150);
      }
  }
}

