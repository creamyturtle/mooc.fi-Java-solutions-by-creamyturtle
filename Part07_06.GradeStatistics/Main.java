import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops:");
        
        GradeRegister gr = new GradeRegister();
 
 
        
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input < 0 || input > 100) {
                continue;
            }
 
            
            gr.addPointsToArray(input);
            gr.pointsAsGrades(input);
 
        }
        
 
        
        System.out.println("Point average (all): " + gr.calcAverage());
        
        System.out.println(gr.calcPassingAverage());
                
        System.out.println("Pass percentage: " + gr.passPct());
        
        
        
        System.out.println("Grade distribution:");
        
        //System.out.println(gr.getGrades(5));
        
        
        int grade = 5;
        while (grade >= 0) {
            
            int stars = gr.getGrades(grade);
            System.out.print(grade + ": ");
            
            while (stars > 0) {
                System.out.print("*");
                stars--;
                
            }
            System.out.println("");
            
            grade--;
        }
        
        
        
        
    }
}
 
