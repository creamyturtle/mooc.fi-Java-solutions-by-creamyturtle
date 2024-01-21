import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int longest = 0;
        int sum = 0;
        String name = "";
        int count = 0;
        
        while (true) {
            
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            String dummy = parts[0];
            int length = dummy.length();
            
            if (length > longest) {
                longest = length;
                name = parts[0];
                
            }
            
            int year = Integer.valueOf(parts[1]);
            sum = sum + year;
            count++;
            
 
            
            
        }
        
        double avg = 1.0 * sum / count;
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);
        
        
        
 
 
    }
}
