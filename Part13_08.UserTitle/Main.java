package title;
 
import javafx.application.Application;
import java.util.Scanner;
 
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a title for your application:");
        String tit = scanner.nextLine();
        String longtit = "--title=" + tit;
        
        Application.launch(UserTitle.class, longtit);
        
        
 
    }
 
}
