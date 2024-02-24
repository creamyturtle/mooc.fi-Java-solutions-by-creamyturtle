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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holds;
    
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holds = new ArrayList<>();
    }
    
    
    public void addSuitcase(Suitcase suitcase) {
        
        
        int i = 0;
        int sum = 0;
        while (i < holds.size()) {
            sum = sum + this.holds.get(i).totalWeight();
            i++;
        }
        
        if (sum + suitcase.totalWeight() <= maxWeight) {
            this.holds.add(suitcase);
        }
        
        
    }
    
    
    public void printItems() {
        
               
        String printItms = "";
        
        int i = 0;
        while (i < holds.size()) {
            
            
            
            System.out.print(this.holds.get(i).itemsInside());
            
            i++;
        }
        
    }
    
    
    @Override
    public String toString() {
        
        int i = 0;
        int sum = 0;
        while (i < holds.size()) {
            sum = sum + this.holds.get(i).totalWeight();
            i++;
        }
        
        
        return this.holds.size() + " suitcases (" + sum + " kg)";
    }
    
 
}
 
