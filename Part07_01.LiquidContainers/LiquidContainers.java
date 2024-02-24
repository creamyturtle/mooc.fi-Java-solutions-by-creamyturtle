import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
 
        int first = 0;
        int second = 0;
            
        while (true) {
            //System.out.print("> ");
            
            
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
 
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            int firstFreeSpace = 100 - first;
            int secondFreeSpace = 100 - second;
            
            
            if (command.equals("add")) {
                if (amount > 0 && amount <= firstFreeSpace) {
                    first = first + amount;
                } else if (amount > 0 && amount >= firstFreeSpace ) {
                    first = 100;
                } else {
                    //System.out.println("Too much liquid!  cannot add");
                    
                }
            }
            
            if (command.equals("move")) {
                
                if (amount > first && first == 0) {
                    //do nothing
                } else if (amount > 0 && amount > first) {
                    second = first;
                    first = 0;    
 
                } else if (amount > 0 && amount <= secondFreeSpace) {
                    second = second + amount;
                    first = first - amount;
                    
                //request to overfill container 2
                } else if (amount > 0 && amount >= secondFreeSpace ) {
                    second = 100;
                    
                    if (amount >= first) {
                        first = 0;
                    } else {
                        first = first - secondFreeSpace;
                    }
                    
                //request to move more than is available
                
                } else {
                    //System.out.println("Too much liquid!  cannot add");
                    
                }
            }
            
            
            if (command.equals("remove")) {
                if (amount > 0 && amount <= second) {
                    second = second - amount;
                } else if (amount > 0 && amount >= second ) {
                    second = 0;
                } else {
                    //System.out.println("Too much liquid!  cannot add");
                    
                }
            }
            
            
            
            System.out.println("");
            
            
            
 
        }
    }
 
}
 
