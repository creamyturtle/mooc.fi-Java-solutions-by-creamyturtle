import java.util.ArrayList;

public class OneItemBox extends Box {
    
    private ArrayList<Item> x;
    
    
    
    public OneItemBox() {
        
        this.x = new ArrayList<>();
        
    }
    
    
    @Override
    public void add(Item item) {
        
 
        if (x.size() < 1) {
            x.add(item);
        }      
            
        
    }
    
    
    
    @Override
    public boolean isInBox(Item item) {
        
       int i = 0;
        
        while (i < x.size()) {
            
            if (x.get(i).equals(item)) {
                return true;
            }
            
            i++;
        }
 
        return false;
 
        
    }
    
    
    
    
}
