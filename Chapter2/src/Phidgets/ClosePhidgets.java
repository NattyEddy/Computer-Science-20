/*

Program: ClosePhidgets.java          Last Date of this Revision: June 2, 2022

Purpose: Close the objects used in a Phidgets box.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class ClosePhidgets {
  public static void main(String[] args) throws Exception{

      //Create
      TemperatureSensor temperatureSensor = new TemperatureSensor();

      //Open
      temperatureSensor.open(1000);

      //Use your Phidgets
      System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
      
      //Close your Phidgets
      temperatureSensor.close();
      
      Thread.sleep(1000);
      
      //Open
      temperatureSensor.open(1000);

      //Use your Phidgets
      System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
      
      //Close your Phidgets
      temperatureSensor.close();
  }
}
