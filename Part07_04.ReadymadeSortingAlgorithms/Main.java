import java.util.Arrays;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
 
public class Main {
 
    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] arrayz = {"dork", "punk", "nerd", "fag", "flunkie"};
        
        Main.sort(array);
        Main.sort(arrayz);
        
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayz));
        
        
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(69);
        ints.add(48);
        ints.add(100);
        
        ArrayList<String> strng = new ArrayList<>();
        strng.add("test");
        strng.add("cat");
        strng.add("frog");
        strng.add("tester");
        
        Main.sortIntegers(ints);
        Main.sortStrings(strng);
        
        System.out.println(ints);
        System.out.println(strng);
        
        
        
        
    }
    
    
    public static void sort(int[] array) {
        //System.out.println(Arrays.sort(array));
        Arrays.sort(array);
    }
    
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
    
 
}
