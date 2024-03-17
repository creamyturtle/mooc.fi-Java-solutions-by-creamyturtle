import java.util.ArrayList;
 

public class BoxWithMaxWeight extends Box {
    
    private int capacity;
 
 
    private ArrayList<Item> x;
    
    
    public BoxWithMaxWeight(int capacity) {
        //super("BoxWithMaxWeight");
        
        //super(capacity);
        
        this.capacity = capacity;
 
 
        
        this.x = new ArrayList<>();
        
        
    }
    
    
    @Override
    public void add(Item item) {
        
 
        
        int sumWeight = 0;
        int i = 0;
        
        while (i < x.size()) {
            
 
            sumWeight += x.get(i).getWeight();
            i++;
 
        }
 
        if (sumWeight + item.getWeight() <= capacity) {
            //BoxWithMaxWeight.this.add(item);
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
