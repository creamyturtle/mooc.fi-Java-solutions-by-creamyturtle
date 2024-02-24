import java.util.Arrays;
 
 
public class MainProgram {
 
    public static void main(String[] args) {
        // write your test code here
        
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
                
        
    }
    
    
    public static int smallest(int[] array) {
        
        int smallest = array[0];
        int i = 0;
        
        while (i < array.length) {
            if (array[i] < smallest){
                smallest = array[i];
            }
            i++;
        }
        return smallest;
        
        
    }
    
    
    public static int indexOfSmallest(int[] array) {
        
        int smallest = array[0];
        int i = 0;
        int index = 0;
        
        while (i < array.length) {
            if (array[i] < smallest){
                smallest = array[i];
                index = i;
            }
            i++;
        }
        return index;
        
        
    }
    
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        int smallest = table[startIndex];
        int i = startIndex;
        int index = 0;
        
        while (i < table.length) {
            if (table[i] <= smallest){
                smallest = table[i];
                index = i;
            }
            i++;
        }
        return index;
 
        
    }
    
    
    public static void swap(int[] array, int index1, int index2) {
        
        int dummy = array[index1];
        array[index1] = array[index2];
        array[index2] = dummy;
        
 
    }
    
    
    public static void sort(int[] array) {
        
        
        System.out.println(Arrays.toString(array));
        int i = 0;
       
        while (i < array.length - 1) {
            
            int smallest = MainProgram.indexOfSmallestFrom(array, i);
            
            MainProgram.swap(array, i, smallest);
            
            System.out.println(Arrays.toString(array));
            
            
            i++;
            
            
            
            //use MainProgram.swap(numbers, 0, smallest)
            
            //then start at position 1 and do the same thing
            
            //then go to position 2 and do the same thing, etc
            
            
        }
        
        
        
        
    }
    
    
    
    
    
 
}
 
