public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    //private double initialBalance;
    private ChangeHistory history;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        
        super(productName, capacity);
        //this.initialBalance = initialBalance;
        
        super.addToWarehouse(initialBalance);
        
        //initialBalance = super.getBalance();
        this.history = new ChangeHistory();
        
        history.add(initialBalance);
        
        
    }
    
    
    
    public String history() {
        
        
        return history.toString();
 
        
    }
    
    
    public void addToWarehouse(double amount) {
        
        history.add(super.getBalance() + amount);
        
        super.addToWarehouse(amount);
        
        
        
        
    }
    
    
    public double takeFromWarehouse(double amount) {
        
        history.add(super.getBalance() - amount);
        
                
        return super.takeFromWarehouse(amount);
        
        
       
    }
    
    
    public void printAnalysis() {
        
        System.out.println("Product: " + super.getName() + "\nHistory: " + history() + "\nLargest amount of product: " + history.maxValue() + "\nSmallest amount of product: " + history.minValue() + "\nAverage: " + history.average());
        
    }
    
    
    
    
}
