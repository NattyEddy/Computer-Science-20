/*

Program: DataInterval.java          Last Date of this Revision: June 9, 2022

Purpose: Utilize Data Interval to control the Phidgets sensors.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class DataInterval {
  //Handle Exceptions
  public static void main(String[] args) throws Exception {

      //Create
      TemperatureSensor temperatureSensor = new TemperatureSensor();

      //Temperature Event |  Event code runs when data input from the sensor changes. The following event is a Temperature change event. The contained code will only run when the temperature input changes.
      temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
          public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
              System.out.println("Temperature: " + e.getTemperature() + "°C");
          }
      });

      //Open
      temperatureSensor.open(5000);

      //Set Data Interval | The Data Interval controls how often the program collects data from your Phidget. The Data Interval ranges from 500 ms - 60000 ms.
      temperatureSensor.setDataInterval(500);

      //Keep program running
      while (true) {
          Thread.sleep(150);
      }
  }
}
