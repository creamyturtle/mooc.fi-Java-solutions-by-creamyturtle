import java.util.ArrayList;

public class Book implements Packable {
    
    private String author;
    private String bookName;
    private double weight;
    private ArrayList<Packable> packables;
    
    
    public Book(String author, String bookName, double weight) {
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
        this.packables = new ArrayList<>();
        
    }
    
    
    public void add(Packable packable) {
        this.packables.add(packable);
    }
    
    
    @Override
    public String toString() {
        
        return this.author + ": " + this.bookName;
        
    }
    
    
    
    @Override
    public double weight() {
        return this.weight;
    }
    
}
