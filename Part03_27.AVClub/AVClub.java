import java.util.Scanner;
import java.util.Arrays;
 
public class AVClub {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        
        while (true) {
            
            boolean b = false; 
            
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(" ");
               
            
            int i = 0;
            
            while(i < pieces.length) {  
            
                
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                    b = true;
                
                }
                i++;
            
            }
            
            //while(i < pieces.length) {  
            
                
            //    if (!(pieces[i].contains("av"))) {
                    
                
            //    }
            //    i++;
            
            //}
            
            int x = 0;
            while (x < pieces.length) {
                pieces[x].equals("");
                x++;
            }
            
            
            if (b == false) {
                continue;
            }
            
            
            
            
            
        }
            
        
       
 
    }
}
