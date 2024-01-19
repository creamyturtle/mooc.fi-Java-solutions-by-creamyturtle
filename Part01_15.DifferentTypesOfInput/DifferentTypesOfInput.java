import java.util.Scanner;
 
public class DifferentTypesOfInput {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        // Write your program here
        
        System.out.println("Give a string:");
        
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        
        int integ = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        
        double dub = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        
        boolean boo = Boolean.valueOf(scan.nextLine());
        
        
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integ);
        System.out.println("You gave the double " + dub);
        System.out.println("You gave the boolean " + boo);
        
        
        
        
 
    }
}
