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
public class Stack {
    private ArrayList<String> values;
    
    
    public Stack() {
        this.values = new ArrayList<>();
    }
    
    
    public boolean isEmpty() {
        if (this.values.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.values.add(value);
    }
    
    public ArrayList<String> values() {
        return this.values;
    }
    
    public String take() {
        return this.values.remove(values.size() - 1);
    }
    
    
    
    
    
}
