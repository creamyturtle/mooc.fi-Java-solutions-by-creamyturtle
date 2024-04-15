package domain;
 

public class Place {
    
    private String airport;
    
    
    public Place(String airport) {
        this.airport = airport;
    }
    
    public String getAirport() {
        return this.airport;
    }
    
    
    @Override
    public String toString() {
        return this.airport;
    }
    
    
    
    
    
}
