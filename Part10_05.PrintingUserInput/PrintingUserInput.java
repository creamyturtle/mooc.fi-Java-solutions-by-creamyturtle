import java.util.ArrayList;
import java.util.Scanner;
 
public class PrintingUserInput {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> stringz = new ArrayList<>();
        
        while(true) {
            
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            stringz.add(input);
           
            
        }
        
        stringz.stream()
                .forEach(werdz -> System.out.println(werdz));
        
        

 
    }
}
