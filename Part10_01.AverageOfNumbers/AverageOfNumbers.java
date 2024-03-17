import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
 
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        List<String> inputs = new ArrayList<>();
        
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            
            String input = scanner.nextLine();
        
            if (input.equals("end")) {
                break;
            }
            
            inputs.add(input);           
            
            
        }
        
        double averageComputation = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        
        
        //mooc style solution
        //double averageComputation = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        
 
            
        System.out.println("average of the numbers: " + averageComputation);
        
 
 
    }
}
