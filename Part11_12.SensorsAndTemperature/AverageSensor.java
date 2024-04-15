package application;
 
import java.util.List;
import java.util.ArrayList;
 

public class AverageSensor implements Sensor{
    
    
    private List<Sensor> sensors;
    private List<Integer> readingsList;
    
    
    public AverageSensor() {
        
        this.sensors = new ArrayList<>();
        this.readingsList = new ArrayList<>();
        
    }
    
    
    public void addSensor(Sensor toAdd) {
        
        sensors.add(toAdd);
        
    }
    
    
    // returns true if the sensor is on
    @Override
    public boolean isOn() {
        
        int i = 0;
        while (i < sensors.size()) {
            if(sensors.get(i).isOn() == false) {
                return false;
            }
            i++;
        }
        
        return true;
    }
    
    
    // sets the sensor on
    @Override
    public void setOn() {
        
        int i = 0;
        while (i < sensors.size()) {
            sensors.get(i).setOn();
            i++;
        }
        
    }      
    
    // sets the sensor off
    @Override
    public void setOff() {
        
        int i = 0;
        while (i < sensors.size()) {
            sensors.get(i).setOff();
            i++;
        }
        
    }     
    
    // returns the value of the sensor if it's on
    @Override
    public int read() {
        
        int i = 0;
        int sum = 0;
        
        while (i < sensors.size()) {
            
            sum += sensors.get(i).read();
 
            i++;
        }
        
        int avg = sum / sensors.size();
        
        readingsList.add(avg);
        
        return avg;
        
    }
    
    
    public List<Integer> readings() {
    //public int readings() {  
        
        return readingsList;
        //return sensors.size();
               
    }
    
    
    
    
}
