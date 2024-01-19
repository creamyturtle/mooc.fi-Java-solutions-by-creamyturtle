public class AdvancedAstrology {
 
    public static void printStars(int number) {
        // part 1 of the exercise
        
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        
        
    }
 
    public static void printSpaces(int number) {
        // part 1 of the exercise
        
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
 
        
        
        
    }
 
    public static void printTriangle(int size) {
        // part 2 of the exercise
        
        int i = 1;
        int dummysize = size;
        
        while (i <= dummysize) {
            printSpaces(size - 1);
            printStars(i);
            i++;
            size--;
            
        }
        
        
        
    }
 
    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int i = 1;
        int dummysize = height * 2;
        int treebase = height;
        
        while (i < dummysize) {
            printSpaces(height -1);
            printStars(i);
            i = i + 2;
            height--;
            
        }
        
        int push = treebase - 2;
             
        
        printSpaces(push);
        printStars(3);
        printSpaces(push);
        printStars(3);
        
        
    }
 
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
 
        printTriangle(4);
        
        System.out.println("---");
        
        christmasTree(4);
        
        System.out.println("---");
        
        christmasTree(10);
    }
}
