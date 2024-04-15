package application;
 
import java.util.Random;
 

public class TemperatureSensor implements Sensor{
    private boolean status;
    
    
    public TemperatureSensor() {
        this.status = false;
        
    }
    
    // returns true if the sensor is on
    @Override
    public boolean isOn() {
        return this.status;
    }
    
    
    // sets the sensor on
    @Override
    public void setOn() {
        this.status = true;
        
    }      
    
    // sets the sensor off
    @Override
    public void setOff() {
        this.status = false;
    }     
    
    // returns the value of the sensor if it's on
    @Override
    public int read() {
        
        if (status == false) {
            throw new IllegalStateException("sensor is off homie");
        }
        
        int rando = new Random().nextInt(61);
        
        return rando - 30;
        
    }        
    
}
