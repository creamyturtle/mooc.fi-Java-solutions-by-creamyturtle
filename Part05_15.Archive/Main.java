import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        
        
        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if (id.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            Archive archive = new Archive(id, name);
            
            if (list.contains(archive)) {
                
            } else {
                list.add(archive);
            }
            
            
 
            
        }
        
        System.out.println("==Items==");
        
 
        
        // System.out.println(list.getId() + ": " + list.getName());
        
        
        int i = 0;
        while (i < list.size()) {
            
            
                System.out.println(list.get(i));
                
            
            i++;
            
        }
        
 
 
    }
}
