package application;
 

public class StandardSensor implements Sensor{
    private int value;
    
    
    public StandardSensor(int value) {
        this.value = value;
        
    }
    
    
    // returns true if the sensor is on
    @Override
    public boolean isOn() {
        return true;
    }
    
    
    // sets the sensor on
    @Override
    public void setOn() {
        
    }      
    
    // sets the sensor off
    @Override
    public void setOff() {
        
    }     
    
    // returns the value of the sensor if it's on
    @Override
    public int read() {
        return this.value;
    }        
    
}
