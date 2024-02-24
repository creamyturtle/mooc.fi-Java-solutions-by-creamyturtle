import java.util.Scanner;
import java.util.ArrayList;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
 
            if (input > 0) {
                numbers.add(input);
            }
 
        }
        
        
        if (numbers.isEmpty()) {
            System.out.println("Cannot calculate the average");
            
        } else {
            int sum = 0;
        
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
 
            double avg = 1.0 * sum / numbers.size();
 
            System.out.println(avg);
 
            
        }
 
 
    }
}
 
