import java.util.ArrayList;
 
public class SimpleCollection {
 
    private String name;
    private ArrayList<String> elements;
 
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
 
    public void add(String element) {
        this.elements.add(element);
    }
 
    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        
        String printOutput = "";
        
        if(elements.size() == 1) {
            printOutput = "The collection " + getName() + " has " + elements.size() + " element:";
        } else if (elements.size() > 1) {
            printOutput = "The collection " + getName() + " has " + elements.size() + " elements:";
        } else if (elements.isEmpty()) {
            printOutput = "The collection " + getName() + " is empty.";
        }
        
        
        int i = 0;
        String elementList = "";
        while (i < elements.size()) {
            
            if (i < elements.size() -1) {
                elementList = elementList + elements.get(i) + "\n";
            } else {
                elementList = elementList + elements.get(i);
            }
            
            i++;
            
        }
        
        
        
        if (elements.size() > 0) {
            return printOutput + "\n" + elementList;
        } else {
            return printOutput;
        }
        
        
        
        /*
        for (SimpleCollection element : elements) {
            elementList = elementList + getElements() + "\n";
        }
        */
    }
    
}
