
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Objects;
 

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    
    public StorageFacility() {
        this.storage = new HashMap<>();
        
    }
    
    
    public void add(String unit, String item) {
        
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        this.storage.get(unit).add(item);
        
    }
    
    
    public ArrayList<String> contents(String storageUnit) {
        
        this.storage.putIfAbsent(storageUnit, new ArrayList<>());
        
        return this.storage.get(storageUnit);
        
        //Mooc Suggested Solution:
        //return this.storage.getOrDefault(storageUnit, new ArrayList<>());
        
    }
    
    
    public void remove(String storageUnit, String item) {
        
        
        this.storage.get(storageUnit).remove(item);
        
        
        if (this.storage.get(storageUnit).isEmpty()) {
            
            this.storage.remove(storageUnit);
            
        }
        
        
        
    }
    
    
    public ArrayList<String> storageUnits() {
        
        
        ArrayList<String> dummy = new ArrayList<>();
        
        for (String key : storage.keySet()) {
            dummy.add(key);
        }
        
        return dummy;
        
    }
 
    
    
    
    
    
    
}
