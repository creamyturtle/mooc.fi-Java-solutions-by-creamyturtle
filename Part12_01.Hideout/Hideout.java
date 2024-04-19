import java.util.ArrayList;


public class Hideout<T> {
    
    private T dummy;
    
    private ArrayList<T> list;
    
    
    
    public Hideout() {
        this.dummy = dummy;
        
        this.list = new ArrayList<>();
    }
    
    
    public void putIntoHideout(T toHide) {
        
        if(list.isEmpty()) {
            list.add(toHide);
        } else {
            list.remove(0);
            list.add(toHide);
        }
        
        
        
    }
    
    
    public T takeFromHideout() {
 
        if(list.isEmpty()) {
            return null;
        }
        
        dummy = list.get(0);
        
        list.remove(0);
        
        return dummy;
        
    }
    
    
    public boolean isInHideout() {
        
        if (list.isEmpty()) {
            return false;
        }
        
        return true;
        
    }
    
    
    
}
