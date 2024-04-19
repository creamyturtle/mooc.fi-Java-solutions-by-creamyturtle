public class Program {
 
    public static void main(String[] args) {
        // Test your method here
        
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
        
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        int[][] matrix2 = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };
 
        System.out.println(arrayAsString(matrix2));
        
        
        
        
        
    }
    
    
    
    public static String arrayAsString(int[][] array) {
        
    StringBuilder output = new StringBuilder();
            
    for (int row = 0; row < array.length; row++) {
        for (int column = 0; column < array[row].length; column++) {
            int value = array[row][column];
            output.append(value);
            //System.out.println("" + row + ", " + column + ", " + value);
        }
        output.append("\n");
    }
            
     
    return output.toString();    
    }
        
 
}
