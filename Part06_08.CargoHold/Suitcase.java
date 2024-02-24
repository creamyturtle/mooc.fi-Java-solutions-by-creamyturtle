/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Skytech Shiva
 */
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
 
 
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        
        int i = 0;
        int sum = 0;
        while (i < items.size()) {
            sum = sum + this.items.get(i).getWeight();
            i++;
        }
        
        if (sum + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
 
    }
    
    @Override
    public String toString() {
        
        
        int i = 0;
        int sum = 0;
        while (i < items.size()) {
            sum = sum + this.items.get(i).getWeight();
            i++;
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + sum + " kg)";
        } else if (this.items.size() == 0) {
            return "no items (" + sum + " kg)";
        } else {
            return this.items.size() + " items (" + sum + " kg)";
        }
        
        
    }
    
    
    public String itemsInside() {
        
        String itemz = "";
        int i = 0;
        while (i < items.size()) {
            itemz += this.items.get(i).getName() + " (" + this.items.get(i).getWeight() + " kg)\n";
            i++;
        }
        return itemz;
        
    }
    
    
    
    public void printItems() {
        
              
        
        int i = 0;
        while (i < items.size()) {
            System.out.println(this.items.get(i).getName() + " (" + this.items.get(i).getWeight() + " kg)");
            i++;
        }
                
    }
    
    
    public int totalWeight() {
        
        int totalWt = 0;
        int i = 0;
        
        while (i < items.size()) {
            totalWt = totalWt + this.items.get(i).getWeight();
            i++;
        }
        return totalWt;
        
    }
    
    
    
    public Item heaviestItem() {
        
        
        if (items.isEmpty()) {
            return null;
        }
        
        
        int hvst = 0;
        int i = 0;
        int dummy = 0;
        
        while (i < items.size()) {
            
            if (hvst < items.get(i).getWeight()) {
                hvst = items.get(i).getWeight();
                dummy = i;
            }
            i++;
            
        }
        
        
        return items.get(dummy);
 
    }
    
    
    
    public ArrayList<Item> getItems() {
        return this.items;
    }
    
    
}
