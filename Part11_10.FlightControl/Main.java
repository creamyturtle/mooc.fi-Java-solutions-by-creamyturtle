package FlightControl;
 
import java.util.Scanner;
import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;
 

public class Main {
    
    
    public static void main(String[] args) {
    
    
        Scanner scanner = new Scanner(System.in);
 
        FlightControl flightcontrol = new FlightControl();
 
        TextUI ui = new TextUI(flightcontrol, scanner);
 
        ui.start();
    
    }
    
}
