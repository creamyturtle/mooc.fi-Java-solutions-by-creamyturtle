package domain;
 
 
 

public class Flight {
    
    private Airplane airplane;
    private Place departure;
    private Place target;
    
    
    public Flight(Airplane airplane, Place departure, Place target) {
        this.airplane = airplane;
        this.departure = departure;
        this.target = target;
    }
    
    
    public Airplane getAirplane() {
        return this.airplane;
    }
    
    
    public Place getDeparture() {
        return this.departure;
    }
    
    
    public Place getTarget() {
        return this.target;
    }
    
    
      
    
    
    @Override
    public String toString() {
        return airplane + " (" + departure + "-" + target + ")";
    }
    
    
    
}
