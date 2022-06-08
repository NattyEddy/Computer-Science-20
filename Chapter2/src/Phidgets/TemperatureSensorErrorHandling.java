/*

Program: TemperatureSensorErrorHandling.java          Last Date of this Revision: June 8, 2022

Purpose: Learning to handle errors that occur in the code.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class TemperatureSensorErrorHandling {
  public static void main(String[] args){

      try{
      //Create
      TemperatureSensor temperatureSensor = new TemperatureSensor();

      //Open
      temperatureSensor.open(1000);

      //Use your Phidgets
      System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
      
      } catch(PhidgetException ex){
          //Catch any errors that may occur 
          System.out.println("Failure: " + ex);
      }
  }
}
