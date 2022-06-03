/*

Program: Thermometer.java          Last Date of this Revision: May 30, 2022

Purpose: Simulate a thermometer with the Phidgets box.

Author: Nathaniel Edillon
School: CHHS
Course: Computer Programming 20
 

*/


package Phidgets;

// Add Phidgets Library
import com.phidget22.*;

public class Thermostat
{
    public static void main(String[] args) throws Exception
    {

        // Create | Components
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput decreaseButton = new DigitalInput();
        DigitalInput increaseButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        // Create | Variables
        
        double celsius;
//      double fahrenheit;
        int setTemp = 22;
        int change = 1;
        int time = 0;
        boolean decreaseButtonState = false;
        boolean increaseButtonState = false;
        
        //Address 
        decreaseButton.setHubPort(0);
        decreaseButton.setIsHubPortDevice(true);
        
        increaseButton.setHubPort(5);
        increaseButton.setIsHubPortDevice(true);
        
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        // Open 
        temperatureSensor.open(1000);
        decreaseButton.open(1000);
        increaseButton.open(1000);
        redLED.open(1000);
        greenLED.open(1000);

        // Use your Phidgets
        while (true)
        {
            
        	celsius = temperatureSensor.getTemperature();
//        	fahrenheit = celsius * 1.8 + 32;
        	
        	// detect button presses and change set temperature
        	if (decreaseButtonState != decreaseButton.getState())
            {
        		setTemp -= decreaseButton.getState() ? 1 : 0;
        		change += decreaseButton.getState() ? 1 : 0;
            	decreaseButtonState = decreaseButton.getState();
            }
        	if (increaseButtonState != increaseButton.getState())
            {
        		setTemp += increaseButton.getState() ? 1 : 0;
        		change += increaseButton.getState() ? 1 : 0;
            	increaseButtonState = increaseButton.getState();
            }
        	
        	// detects change in temperature to print new temp
        	if (change != 0)
        	{
        		System.out.printf("Set Temp: %d°C\n", setTemp);
        		change = 0;
        	}
        	
        	
        	// changes light when in range
        	if (celsius >= setTemp - 2 && celsius <= setTemp + 2)
        	{
        		redLED.setState(false);
        		greenLED.setState(true);
        	}
        	else
        	{
        		redLED.setState(true);
        		greenLED.setState(false);
        	}
        	
        	time += 5;
            
            if (time == 10000) {
            	System.out.printf("Current temp: %.2f°C\n", celsius);
            	time = 0;
            }
        	
            Thread.sleep(1);
            
        }
    }
}
  