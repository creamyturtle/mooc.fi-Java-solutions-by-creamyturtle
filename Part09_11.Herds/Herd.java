import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    
    private List<Movable> herd;
 
    
    
    public Herd() {
        
        this.herd = new ArrayList<>();
 
    }
    
    
    @Override
    public String toString() {
        
        
        StringBuilder string = new StringBuilder();
        
        int i = 0;
        while (i < herd.size()) {
            
            string.append(herd.get(i) + "\n");
            i++;
        }
        
        return string.toString();
        
    }
    
    
    
    public void addToHerd(Movable movable) {
        
        herd.add(movable);
        
        
    }
    
    
    @Override
    public void move(int dx, int dy) {
        
        
        for (Movable x : herd) {
            x.move(dx, dy);
        }
        
        
    }
    
    
    
}
