import java.util.ArrayList;

public class CD implements Packable {
    
    private String artist;
    private String cdName;
    private int pubYear;
    private double weight;
    private ArrayList<Packable> packables;
    
    
    public CD(String artist, String cdName, int pubYear) {
        
        this.artist = artist;
        this.cdName = cdName;
        this.pubYear = pubYear;
        this.weight = 0.1;
        this.packables = new ArrayList<>();
        
    }
    
    
    public void add(Packable packable) {
        this.packables.add(packable);
    }
    
    
    @Override
    public String toString() {
        
        return this.artist + ": " + this.cdName + " (" + this.pubYear + ")";
        
    }
    
    
    
    @Override
    public double weight() {
        return this.weight;
    }
    
}
 
