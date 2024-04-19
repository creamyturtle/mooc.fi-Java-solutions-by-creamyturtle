import java.util.ArrayList;

public class Pipe<T> {
    
    private ArrayList<T> pipe;
    
    
    
    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    
    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }
    
    
    public T takeFromPipe() {
        
        if (isInPipe() == true) {
            T inPipe = pipe.get(0);
        
            pipe.remove(0);
 
            return inPipe;
        }
        
        return null;
        
    }
    
    
    public boolean isInPipe() {
        
        if(pipe.isEmpty()) {
            return false;
        }
        
        return true;
    }
    
    
    
    
}
