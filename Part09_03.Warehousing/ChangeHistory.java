public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    
    public ChangeHistory() {
        
        this.history = new ArrayList<>();
        
    }
    
    
    public void add(double status) {
        
        this.history.add(status);        
        
    }
    
    
    public void clear() {
        
        this.history.clear();
        
    }
    
    
    @Override
    public String toString() {
        
        return this.history.toString();
        
    }
    
    
    public double maxValue() {
        
        if (history.isEmpty()) {
            return 0.0;
        }
        
        double max = 0.0;
        for (int i = 0; i < history.size(); i++) {
            if (max < history.get(i)) {
                max = history.get(i);
            }
        }
        return max;
    }
    
    
    public double minValue() {
        
        if (history.isEmpty()) {
            return 0.0;
        }
        
        double min = history.get(0);
        for (int i = 0; i < history.size(); i++) {
            if (min > history.get(i)) {
                min = history.get(i);
            }
        }
        return min;
        
        
    }
    
    
    public double average() {
        
        if (history.isEmpty()) {
            return 0.0;
        }
        
        
        double sum = 0.0;
        for (int i = 0; i < history.size(); i++) {
            sum += history.get(i);
        }
        
        return 1.0 * sum / history.size();
 
        
    }
    
    
    
    
}
