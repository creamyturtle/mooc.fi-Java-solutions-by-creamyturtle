import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
 
 
public class MainProgram {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        List<Book> list = new ArrayList<>();
        
        int count = 0;
        
        while (true) {
            
            System.out.println("Input the name of the book, empty stops");
            
            String inputName = scanner.nextLine();
            
            if (inputName.equals("")) {
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            
            int ageInput = Integer.valueOf(scanner.nextLine());
            
            
            list.add(new Book(inputName, ageInput));
            count++;
            
            System.out.println("");
 
            
        }
        
        
        System.out.println(count + " books in total.");
        
        
        System.out.println("");
        System.out.println("Books: ");
        
 
        
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        
        Collections.sort(list, comparator);
        
        
        for (Book x : list) {
            System.out.println(x);
        }
        
        
 
    }
 
}
