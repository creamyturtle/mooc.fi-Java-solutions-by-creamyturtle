import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
 
public class PositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
        List<Integer> dummy = new ArrayList<>();
        dummy.add(69);
        dummy.add(-420);
        dummy.add(6);
        dummy.add(9);
        dummy.add(-22);
        dummy.add(696);
        
 
        
        System.out.println(positive(dummy));
        
 
    }
    
    
    public static List<Integer> positive(List<Integer> numbers) {
        
        
        return numbers.stream()
                .filter(value -> value > 0)
                //.collect(Collectors.toCollection(ArrayList::new));
                .collect(Collectors.toList());
        
        
        
        
        
    }
 
}
