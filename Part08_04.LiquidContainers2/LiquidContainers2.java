import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        
        /*
        Container container = new Container();
        System.out.println(container);
 
        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());
 
        container.remove(60);
        System.out.println(container);
 
        container.add(200);
        System.out.println(container);
        */
        
        
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
 
 
        while (true) {
            
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
 
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                
                first.add(amount);
 
                
            }
            
            if (command.equals("move")) {
                
                if (amount <= 0) {
                    continue;
                }
                
                if (first.contains() < amount) {
                    second.add(first.contains());
                    first.remove(amount);
                    continue;
                }
                
                first.remove(amount);
                second.add(amount);
 
                
            }
            
            
            
            if (command.equals("remove")) {
                
                second.remove(amount);
                
 
            }
            
 
 
        }
        
 
    }
 
}
