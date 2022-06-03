package Phidgets;


//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents {

  public static void main(String[] args) throws Exception {
     
       //Create
      TemperatureSensor temperatureSensor = new TemperatureSensor();

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
              System.out.println("Attach!");
          }
      });

      //Detach Event | Detach Events run when a Phidget is disconnected from the Object
      temperatureSensor.addDetachListener(new DetachListener() {
          public void onDetach(DetachEvent e) {
              System.out.println("Detach!");
          }
      });

      //Open
      temperatureSensor.open(1000);

      //Keep program running
      while (true) {
          Thread.sleep(150);
      }
  }
}

