import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        while (true) {
                    
            int input = Integer.valueOf(scanner.nextLine());
            
            list.add(input);
            if (input == 9999) {
                break;
            
            } 
        
        }
        
        int smallest = list.get(0);
        int index = 0;
        
        for (int i = 0; i < list.size(); i++) {
            
            int number = list.get(i);
            
            if (smallest > number) {
                smallest = number;
            }
                      
            
        }
        
        System.out.println("Smallest number: " + smallest);
        
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                index = i;
            System.out.println("Found at index: " + index);    
            }
            
        }
        
        
        
        
        
        
        
        
 
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
 
        
    }
}
