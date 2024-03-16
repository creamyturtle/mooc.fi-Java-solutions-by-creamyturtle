import java.util.HashMap;
import java.util.ArrayList;
 
public class Program {
 
    public static void main(String[] args) {
        // Test your program here!
        
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");
 
        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        
    }
    
    public static void printKeys(HashMap<String, String> hashmap) {
        
        for (String hm : hashmap.keySet()) {
            System.out.println(hm);
        }
        
        //System.out.println(hashmap.keySet());
        
        
    }
    
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        
        for (String hm : hashmap.keySet()) {
            if (hm.contains(text)) {
                System.out.println(hm);
            }
        }
        
        
    }
    
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        //hashmap.get(text);
        
        for (String hm : hashmap.keySet()) {
            if (hm.contains(text)) {
                System.out.println(hashmap.get(hm));
            }
        }
        
              
    }
    
 
}
