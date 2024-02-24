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
public class TodoList {
    private ArrayList<String> tdlist;
    
    
    public TodoList() {
        this.tdlist = new ArrayList<>();
        
        
    }
    
    
    public void add(String task) {
        this.tdlist.add(task);
    }
    
    
    public void print() {
        int i = 0;
        while (i < tdlist.size()) {
            System.out.println((i + 1) + ": " + tdlist.get(i));
            i++;
        }
        
        
    }
    
    
    public void remove(int number) {
        this.tdlist.remove(number - 1);
    }
    
    
    
    
}
