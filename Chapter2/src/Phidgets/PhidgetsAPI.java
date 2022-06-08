/*

Program: PhidgetsAPI.java          Last Date of this Revision: June 8, 2022

Purpose: Use the Phidgets API.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/

package Phidgets;

import com.phidget22.*;

public class PhidgetsAPI {

	public static void main(String[] args) throws Exception{
		
		try {
			TemperatureSensor ts = new TemperatureSensor();
			ts.open(1000);
			
			System.out.println(Phidget.getLibraryVersion());
			System.out.println("Temperature Sensor Attached: " + ts.getAttached());
		} catch (PhidgetException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: " + e);
		}
	}

}
