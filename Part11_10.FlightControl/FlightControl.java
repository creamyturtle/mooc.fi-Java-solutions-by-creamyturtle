package FlightControl.logic;
 
import domain.Flight;
import domain.Place;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import domain.Airplane;
 
 

public class FlightControl {
    
    public HashMap<String, Flight> flights;
    public HashMap<String, Airplane> planes;
    public HashMap<String, Place> places;
    
    
    
    
    public FlightControl() {
        
        this.flights = new HashMap<>();
        this.planes = new HashMap<>();
        this.places = new HashMap<>();
        
    }
    
    
    public void addPlane(String name, int capacity) {
        
        Airplane plane = new Airplane(name, capacity);
        
        this.planes.put(name, plane);
        
    }
    
    
    public void addFlight(Airplane planeName, Place departAirport, Place targetAirport) {
        
        Flight flight = new Flight(planeName, departAirport, targetAirport);
        
        this.flights.put(flight.toString(), flight);
        
        
    }
    
    
    public Airplane getPlane(String ID) {
        return this.planes.get(ID);
    }
    
    
 
    
}
