package dictionary;
 
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
 
 

public class SaveableDictionary {
    
    private HashMap<String, String> dictionary;
    private Scanner scanner;
    private String file;
    private HashMap<String, String> dictionary2;
    
    
    public SaveableDictionary() {
        
        this.dictionary = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.dictionary2 = new HashMap<>();
        
    }
    
    
    public SaveableDictionary(String file) throws Exception {
        
        this.dictionary = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.file = file;
        this.dictionary2 = new HashMap<>();
        
        
 
    }
    
    
    public boolean load() {
        
        try (Scanner reader = new Scanner(new File(file))) {
 
            // read all lines from a file
            while (reader.hasNextLine()) {
                
                String line = reader.nextLine();
                String[] parts = line.split(":");
                
                add(parts[0], parts[1]);
                //dictionary2.putIfAbsent(parts[0], parts[1]);
                
            }
            return true;
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
    }
    
    
    
    public boolean save() {
        
        try (PrintWriter writer = new PrintWriter(file)) {
 
            for (String key : dictionary2.keySet()) {
            
                writer.println(key + ":" + dictionary2.get(key));
                //writer.println(dictionary.get(key));
            }
 
            return true;
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        
      
        
    }
    
    
    
    
    public void add(String words, String translation) {
        
        
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
        
        dictionary2.putIfAbsent(words, translation);
    }
    
    
    public void delete(String word) {
        
              
        String dummy = translate(word);
        
                
        dictionary.remove(word);
        dictionary.remove(dummy);
        
        dictionary2.remove(word);
        dictionary2.remove(dummy);
        
    }
    
    
    
    public String translate(String word) {
        
        
        for (String key : dictionary.keySet()) {
            if (key.contains(word)) {
                return dictionary.get(key);
            }
        }
                
        
        return null;
        
    }
    
   
    
    public void print() {
        
        for (String key : dictionary2.keySet()) {
            
                System.out.println(key);
            
        }
        
        System.out.println("");
        
        for (String key : dictionary2.keySet()) {
            
                System.out.println(dictionary.get(key));
            
        }
        
        
    }
    
    
    
    
    
    
}
