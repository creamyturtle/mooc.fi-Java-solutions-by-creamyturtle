package FlightControl.ui;
 
import java.util.Scanner;
import FlightControl.logic.FlightControl;
import domain.Airplane;
import domain.Flight;
import domain.Place;
 

public class TextUI {
    
    private FlightControl flightControl;
    private Scanner scanner;
    
    
    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    
    
    public void start() {
        
        assetControl();
        
        flightControl();
        
        
    }
    
    
    public void assetControl() {
        
        System.out.println("Part 1: Airport Asset Control");
        System.out.println("");
        
        
        while (true) {
            
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.println(">");
            
            String command = scanner.nextLine();
            
            if (command.equals("1")) {
                
                addAnAirplane();
                
            }
            
            if (command.equals("2")) {
                
                addAFlight();
                
            }
            
            if (command.equals("x")) {
                break;
            }
            
            
            
        }
        
 
        
 
        
    }
    
    
    public void flightControl() {
        
        System.out.println("");
        System.out.println("Part 2: Flight Control");
        System.out.println("");
        
        
        while (true) {
            
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.println(">");
            
            String command = scanner.nextLine();
            
            if (command.equals("1")) {
                
                printAirplanes();
                
            }
            
            if (command.equals("2")) {
                
                printFlights();
                
            }
            
            if (command.equals("3")) {
                
                System.out.println("Give the airplane id: ");
                String aplane = scanner.nextLine();
             
                
                printPlaneDetails(aplane);
                
            }
                        
            if (command.equals("x")) {
                break;
            }
            
        }
 
        
    }
    
    
    public void addAnAirplane() {
        
        System.out.println("Give the airplane id: ");
        String planeID = scanner.nextLine();
        
        System.out.println("Give the airplane capacity: ");
        int planeCapacity = Integer.valueOf(scanner.nextLine());
        
      
        flightControl.addPlane(planeID, planeCapacity);
        
        
        
    }
    
    
    public void addAFlight() {
        
        System.out.println("Give the airplane id: ");
        String planeID = scanner.nextLine();
        
        System.out.println("Give the departure airport id: ");
        Place departAirport = new Place(scanner.nextLine());
        
        System.out.println("Give the target airport id: ");
        Place targetAirport = new Place(scanner.nextLine());
 
        
        flightControl.addFlight(flightControl.getPlane(planeID), departAirport, targetAirport);
        
    }
    
    
    public void printAirplanes() {
        
        for (Airplane value : flightControl.planes.values()) {
            System.out.println(value);
        }
        
    }
    
    
    public void printFlights() {
        
        for (Flight value : flightControl.flights.values()) {
            System.out.println(value);
        }
        
    }
    
    
    public void printPlaneDetails(String aplane) {
        
        for (String key : flightControl.planes.keySet()) {
            if (key.contains(aplane)) {
                System.out.println(flightControl.planes.get(key));
            }
        }
        
    }
    
    
}
