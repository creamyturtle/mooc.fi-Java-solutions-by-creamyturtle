public class Checker {
    
    
    public boolean isDayOfWeek(String string) {
 
        return string.matches("sun|mon|tue|wed|thu|fri|sat");
        
    }
    
    
    public boolean allVowels(String string) {
        
        return string.matches("(a|e|i|o|u)*");
        
    }
    
    
    public boolean timeOfDay(String string) {
        
 
        if(string.matches("[0-1]{1}[0-9]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}") || string.matches("2[0-3]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}")) {
            return true;
        }
        
        return false;
        
 
    }
    
    
 
}
