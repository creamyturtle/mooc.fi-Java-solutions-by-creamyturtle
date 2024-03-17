import java.util.ArrayList;
 

public class MisplacingBox extends Box {
    private ArrayList<Item> x;
    
    public MisplacingBox() {
        this.x = new ArrayList<>();
        
    }
    
    
    @Override
    public void add(Item item) {
        
        
            x.add(item);
              
            
        
    }
    
    
    
    @Override
    public boolean isInBox(Item item) {
        
       
 
        return false;
 
        
    }
    
}
