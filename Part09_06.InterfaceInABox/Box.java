import java.util.ArrayList;

public class Box implements Packable {
    
    private double maxCapac;
    private ArrayList<Packable> boxItems;
    //private double totalWeight;
    
    
    public Box(double maxCapac) {
        
        this.maxCapac = maxCapac;
        this.boxItems = new ArrayList<>();
        //this.totalWeight = 0.0;
        
    }
    
    
    public void add(Packable packable) {
        
      
        
        if (weight() + packable.weight() <= maxCapac) {
            
            this.boxItems.add(packable);
                       
        }
 
        
    }
    
    
    public double weight() {
        
        double weight = 0;
        
        int i = 0;
               
        while (i < boxItems.size()) {
            weight += boxItems.get(i).weight();
            i++;
        }
        
        
        return weight;
        
    }
    
    
    
    
    public String toString() {
        
        return "Box: " + boxItems.size() + " items, total weight " + weight() + " kg";
        
        //return boxItems.toString();
        
    }
    
    
    
    
}
