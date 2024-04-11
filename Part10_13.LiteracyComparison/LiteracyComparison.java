import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
 
 
public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        
        String filename = "literacy.csv";
        
        
        List<Statistics> rows = readStats(filename);
        
        
        rows.stream()
                .forEach(item -> System.out.println(item));
        
        
 
    }
    
    
    
    
    public static List<Statistics> readStats(String file) {
        
        List<Statistics> dummy = new ArrayList<>();
        
        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get(file))
                // splitting the row into parts on the "," character
                .map(row -> row.split(","))
                // deleting the split rows that have less than four parts (we want the rows to always contain both the name and the birth year)
                .filter(parts -> parts.length >= 6)
                // creating books from the parts
                .map(parts -> new Statistics(parts[0], parts[1].trim(), parts[2].trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                .sorted()
                // and finally add the persons to the list
                .forEach(stat -> dummy.add(stat));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return dummy;
        
        
    }
    
    
    
}
