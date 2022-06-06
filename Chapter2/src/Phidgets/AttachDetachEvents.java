package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents {

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
              System.out.println("Temperature: " + e.getTemperature() + "°C");
          }
      });

      //Attach Event | Attach Events run when a Phidget is connected to the Object
      temperatureSensor.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Attach! \n==========");
          }
      });

      //Detach Event | Detach Events run when a Phidget is disconnected from the Object
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("==========\nDetach!");
          }
      });
      
    //Data Event 
      redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          public void onStateChange(DigitalInputStateChangeEvent e) {
              //Print temperature
              System.out.println("Temperature: " + e.getState() + "°C");
          }
      });

      //Attach Event 
      temperatureSensor.addAttachListener(new AttachListener() {
          public void onAttach(AttachEvent e) {
              System.out.println("Attach! \n==========");
          }
      });

      //Detach Event 
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("==========\nDetach!");
          }
      });

      //Open
      temperatureSensor.open(1000);
      redButton.open(1000);
      greenButton.open(1000);
      redLED.open(1000);
      greenLED.open(1000);

      //Keep program running
      while (true) {
          Thread.sleep(150);
      }
  }
}

