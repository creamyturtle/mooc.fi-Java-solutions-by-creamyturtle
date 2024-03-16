import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> hashy;
    
    
    public Abbreviations() {
        this.hashy = new HashMap<>();
    }
    
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.hashy.put(abbreviation, explanation);
    }
    
    
    public boolean hasAbbreviation(String abbreviation) {
        
        if (this.hashy.containsKey(abbreviation)) {
            return true;
        }
        
        return false;
        
        
    }
    
    
    public String findExplanationFor(String abbreviation) {
        
        
        return this.hashy.get(abbreviation);
        
        
        //return null;
    }
    
    
    
    
}
