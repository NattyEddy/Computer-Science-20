/*

Program: HotOrCold.java          Last Date of this Revision: May 24, 2022

Purpose: Print the temperature and light a red or green LED in respect to the temperature.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/


package Phidgets;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold {
    public static void main(String[] args) throws Exception{

        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        //Create | Other variables used are created here
        double celsius;
        double fahrenheit;

        //Address | Setup the LED ports
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);

        //Use your Phidgets | This code will print the temperature every 5 seconds
        while (true) {
        	celsius = temperatureSensor.getTemperature();
        	fahrenheit = celsius * 1.8 + 32;
        	
            if (celsius >= 20 && celsius <= 24) {
            	redLED.setState(false);
            	greenLED.setState(true);
            }
            else {
            	redLED.setState(true);
            	greenLED.setState(false);            	
            }
            
            System.out.printf("Temperature: %.2f°C / %.2f°F\n", celsius, fahrenheit);
            
            Thread.sleep(5000);
        }
    }
}
  