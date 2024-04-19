public class MagicSquareFactory {
 
    public MagicSquare createMagicSquare(int size) {
 
        MagicSquare square = new MagicSquare(size);
 
        // implement the creation of a magic square with the Siamese method algorithm here
 
        
        //square.placeValue(column, row, value)
        
        
        if (size % 2 == 1) {
            
            //set position for placing first "1"
            
            int initialPosition = (size / 2);
            
            square.placeValue(initialPosition, 0, 1);
            
            
            
            //place starting numbers in position 2
 
            int nextValue = 2;
 
            int nextColumn = initialPosition + 1;
 
            int nextRow = -1;
            
 
            
            
            while (nextValue <= size * size) {
                
               
                //catch already filled numbers
                
                if (square.readValue(nextColumn, nextRow) > 0) {
                    
                    nextRow++;
                    nextRow++;
                    nextColumn--;
 
                
                    
                //normal movement
                } else if (nextRow >= 0 && nextColumn <= size - 1) {
                   
                
                    square.placeValue(nextColumn, nextRow, nextValue);
 
                    nextColumn++;
                    nextRow--;
                    nextValue++;
                
                    
                //hitting column edge
                } else if (nextColumn > size - 1 && nextRow >= 0) {
                    
                    nextColumn = 0;
                    square.placeValue(nextColumn, nextRow, nextValue);
 
                    nextColumn++;
                    nextRow--;
                    nextValue++;
                
                    
                    
                //hitting row top
                } else if (nextRow < 0 && nextColumn <= size - 1) {
                    nextRow = size - 1;
                    
                    square.placeValue(nextColumn, nextRow, nextValue);
 
                    nextColumn++;
                    nextRow--;
                    nextValue++;
                    
                    
                //hitting top right corner??
                
                
                } else if (nextRow < 0 && nextColumn > size - 1) {
                    nextRow++;
                    nextRow++;
                    nextColumn--;
                    
                    square.placeValue(nextColumn, nextRow, nextValue);
                    
                    nextColumn++;
                    nextRow--;
                    nextValue++;
                    
                } else {
                    break;
                }
                
 
            }
            
 
        }
        
 
        
        return square;
    }
    
    
    
    
    
    
 
}
