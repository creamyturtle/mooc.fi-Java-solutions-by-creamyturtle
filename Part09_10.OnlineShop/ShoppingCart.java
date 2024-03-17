import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    
    public ShoppingCart() {
        
        this.cart = new HashMap<>();
        
        
    }
    
    
    public void add(String product, int price) {
        
        if (cart.containsKey(product)) {
            
            cart.get(product).increaseQuantity();
            
        } else {
            cart.put(product, new Item(product, 1, price));
        }
        
                
        
    }
    
    
    public int price() {
        
        int sum = 0;
        for (Item value : cart.values()) {
            sum += value.price();
        }
        
        return sum;
        
    }
    
    
    
    public void print() {
        
        for (Item value : cart.values()) {
            System.out.println(value);
        }
        
    }
    
    
    
    
}
