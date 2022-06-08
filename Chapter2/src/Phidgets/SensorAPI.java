/*

Program: SensorAPI.java          Last Date of this Revision: June 8, 2022

Purpose: Use the Sensor APIs.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;

import com.phidget22.*;

public class SensorAPI {

	public static void main(String[] args) throws Exception{
		
		try {
			TemperatureSensor ts = new TemperatureSensor();
			HumiditySensor hs = new HumiditySensor();
			ts.open(1000);
			hs.open(1000);
			
			ts.setTemperatureChangeTrigger(1.0);
			
			System.out.printf("Humidity Sensor Range: %.2fRH%% - %.2fRH%%\n", hs.getMinHumidity(), hs.getMaxHumidity());
			System.out.printf("Temperature Sensor Data Interval Range: %dms - %dms\n", ts.getMinDataInterval(), ts.getMaxDataInterval());
			System.out.printf("Temperature: %.2f°C\n", ts.getTemperature());
			
			ts.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
		          public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
		        	  System.out.printf("Temperature: %.2f°C\n", e.getTemperature());
		          }
		    });
			
			while (true) {
				Thread.sleep(100);
			}
		} catch (PhidgetException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: " + e);
		}
	}

}
