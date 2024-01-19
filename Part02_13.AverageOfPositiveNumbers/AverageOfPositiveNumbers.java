import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int sum = 0;
        int values = 0;
        
        while (true) {
            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum = sum + number;
                values = values + 1;
            }
 
            
 
            
        }
        
        if (values == 0) {
            System.out.println("Cannot calculate the average");
        }
        
        if (values > 0) {
            double average = 1.0 * sum / values;
            System.out.println(average);
        }
        
 
 
    }
}
