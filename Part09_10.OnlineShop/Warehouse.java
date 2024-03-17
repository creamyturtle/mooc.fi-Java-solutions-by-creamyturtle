import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    
    //private String product;
    //private int price;
    //private int stock;
    private Map<String, Integer> productsNprices;
    private Map<String, Integer> productsNstock;
    
    public Warehouse() {
        
        //this.product = product;
        //this.price = price;
        //this.stock = stock;
        this.productsNprices = new HashMap<>();
        this.productsNstock = new HashMap<>();
        
    }
    
    
    
    public void addProduct(String product, int price, int stock) {
        
        productsNprices.put(product, price);
        productsNstock.put(product, stock);
        
    }
    
    
    
    public int price(String product) {
        
        
        for (String key : productsNprices.keySet()) {
            if (key.contains(product)) {
                return productsNprices.get(key);
            } 
        }
        
        
        return -99;
    }
    
    
    
    public int stock(String product) {
        
        for (String key : productsNstock.keySet()) {
            if (key.contains(product)) {
                return productsNstock.get(key);
            } 
        }
        
        
        return 0;
        
        
    }
    
    
    
    public boolean take(String product) {
        
        
        for (String key : productsNstock.keySet()) {
            if (key.contains(product)) {
                
                if (productsNstock.get(product) >= 1) {
                    productsNstock.put(product, productsNstock.get(product) - 1);
                    //productsNstock.values();
                    return true;
                }
                
                
            } 
        }
        
        
        return false;
    }
    
    
    
    public Set<String> products() {
        
        Set<String> keys = productsNprices.keySet();
        return keys;
        
        
    }
    
    
    
    
}
 
