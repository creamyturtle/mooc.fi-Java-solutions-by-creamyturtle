import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
 
public class ReadingFilesPerLine {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
 
        
        String filename = "test.txt";
        
        
        List<String> rows = read(filename);
        
        
        rows.stream()
                .forEach(item -> System.out.println(item));
        
 
 
    }
    
    
    public static List<String> read(String file) {
        
        List<String> dummy = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file)).forEach(row -> dummy.add(row));
            
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
        
        
        return dummy.stream()
                .collect(Collectors.toCollection(ArrayList::new));
        
    }
 
}
