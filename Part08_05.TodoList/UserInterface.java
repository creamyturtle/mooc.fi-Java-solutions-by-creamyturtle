import java.util.Scanner;

public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
        
    }
    
    
    public void start() {
        
        while (true) {
            
            System.out.println("Command: ");
            
            String input = scanner.nextLine();
            
            
            if (input.equals("stop")) {
                break;
            }
            
            
            if (input.equals("add")) {
                System.out.println("To add: ");
                
                String adding = scanner.nextLine();
                
                todolist.add(adding);
                
                
                
            }
            
            
            if (input.equals("list")) {
                
                todolist.print();
                
                
            }
            
            
            if (input.equals("remove")) {
                System.out.println("Which one is removed? ");
                
                int removing = Integer.valueOf(scanner.nextLine());
                
                todolist.remove(removing);
                
                
            }
            
            
            
        }
        
        
        
        
        
        
    }
    
    
    
    
    
}
