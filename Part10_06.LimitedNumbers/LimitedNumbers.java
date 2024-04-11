import java.util.ArrayList;
import java.util.Scanner;
 
public class LimitedNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> intz = new ArrayList<>();
        
        while(true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0) {
                break;
            }
            
            intz.add(input);
           
            
        }
        
        intz.stream()
                .filter(s -> s >= 1)
                .filter(s -> s <= 5)
                .forEach(werdz -> System.out.println(werdz));
        
        
 
 
    }
}
