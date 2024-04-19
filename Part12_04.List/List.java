public class List<Type> {
    
    private Type[] values;
    public int firstEmptyIndex;
    
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstEmptyIndex = 0;
    }
    
    public void add(Type value) {
        
        if (firstEmptyIndex == values.length) {
            grow();
        }
        
        this.values[this.firstEmptyIndex] = value;
        firstEmptyIndex++;
    }
    
    
    public void grow() {
        int newSize = this.values.length + this.values.length / 2;
        
        Type[] values2 = (Type[]) new Object[newSize];
        
        for (int i = 0; i < values.length; i++) {
            values2[i] = values[i];
        }
        
        this.values = values2;
        
    }
    
    
    public boolean contains(Type value) {
        
        return indexOfValue(value) >= 0;
        
        /*
        for (int i = 0; i < firstEmptyIndex; i++) {
            if (this.values[i].equals(value) || this.values[i] == value) {
                return true;
            }
        }
        
        return false;
        */
        
        
    }
    
    
    
    public void remove(Type value) {
        
        int indexOfValue = indexOfValue(value);
        
        if (indexOfValue < 0) {
            return;
        }
        
        moveToTheLeft(indexOfValue);
        this.firstEmptyIndex--;
        
        
        /*
        boolean found = false;
        
        for (int i = 0; i < firstEmptyIndex; i++) {
            
            if (found) {
                this.values[i - 1] = this.values[i];
            } else if (values[i].equals(value) || values[i] == value) {
                //this.values[i] = null;
                this.firstEmptyIndex--;
                found = true;
                
                
            }
        }
        */
        
        
    }
    
    
    public int indexOfValue(Type value) {
        
        for (int i = 0; i < this.firstEmptyIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        
        return -1;
    }
    
    
    private void moveToTheLeft(int fromIndex) {
        
        for (int i = fromIndex; i < this.firstEmptyIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
        
    }
    
    
    
    public Type value(int index) {
        
        if (index < 0 || index >= this.firstEmptyIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstEmptyIndex + "]");
        }
        
        return this.values[index];
    }
    
    
    public int size() {
        return this.firstEmptyIndex;
    } 
    
    
    
    @Override
    public String toString() {
        //return this.values.toString();
        
        String holder = "";
        for (int i = 0; i < values.length; i++) {
            holder += "\n" + values[i];
        }
        
        return holder;
        
    }
    
    
}
