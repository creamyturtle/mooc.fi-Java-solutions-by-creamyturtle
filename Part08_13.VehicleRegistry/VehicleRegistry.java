
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        
        
        for (LicensePlate key : registry.keySet()) {
            if (key.equals(licensePlate)) {
                                
                return false;
            }
        }
 
        registry.put(licensePlate, owner);
        return true;
        
        /* SUGGESTED SOLUTION
        
        THEY NEVER TAUGHT US "containsKey" method in mooc.  fuckers
        
        if (owners.containsKey(licensePlate)) {
            return false;
        }
 
        owners.put(licensePlate, owner);
 
        return true;
        
        
        */
        
        
        
 
        
    }
    
    
    
    public String get(LicensePlate licensePlate) {
        //return this.owners;
        
        for (LicensePlate key : registry.keySet()) {
            if (key.equals(licensePlate)) {
                return registry.get(key);
            }
        }
        
        return null;
        
        //SUGGESTED SOLUTION
        
        //return registry.get(licensePlate);
    
    }
    
    
    public boolean remove(LicensePlate licensePlate) {
    
        for (LicensePlate key : registry.keySet()) {
            if (key.equals(licensePlate)) {
                registry.remove(key);
                return true;
            }
        }
        
        return false;
        
        
        /* SUGGESTED SOLUTION
        
        if (!owners.containsKey(licensePlate)) {
            return false;
        }
 
        owners.remove(licensePlate);
 
        return true;
        
        
        */
        
    }
    
    
    public void printLicensePlates() {
        
        for (LicensePlate key : registry.keySet()) {
            System.out.println(key);
        }
        
    }
    
    
    public void printOwners() {
        
        ArrayList<String> printedOwners = new ArrayList<>();
        
        
        
        for (String value : registry.values()) {
            
            if (printedOwners.contains(value)) {
                
            } else {
                System.out.println(value);
                printedOwners.add(value);
            }
            
            
            
        }
        
        //or
        
        
        /*
        for (LicensePlate value : registry.values()) {
            if (value.getName().contains(text)) {
                System.out.println(value);
            }
        }
        */
        
    }
    
    
    
}
 
