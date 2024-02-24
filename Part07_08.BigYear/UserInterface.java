/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Skytech Shiva
 */
public class UserInterface {
    
    private BirdManager birdManager;
    private Scanner scanner;
    private ArrayList<BirdManager> birdies;
    
    
    public UserInterface(Scanner scanner) {
        this.birdManager = birdManager;
        this.scanner = scanner;
        this.birdies = new ArrayList<>();
    }
    
    
    public void start() {
        
        
        //ArrayList <BirdManager> birdies = new ArrayList<>();
        
        while (true) {
            
            System.out.println("?");
 
            //Add - adds a bird
            //Observation - adds an observation
            //All - prints all birds
            //One - prints one bird
            //Quit - ends the program
 
            String command = scanner.nextLine();
 
            if (command.equals("Quit")) {
                break;
            }
 
 
            if (command.equals("Add")) {
                
                System.out.println("Name: ");
                String birdName = scanner.nextLine();
                
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                
                int observations = 0;
                
                
                BirdManager penis = new BirdManager(birdName, latinName, observations);
                birdies.add(penis);
 
                
                
            }
            
            
            if (command.equals("Observation")) {
                
                System.out.println("Bird? ");
                String check = scanner.nextLine();
 
                
                Boolean trueness = true;
                
                
 
                //String searching = check;
                
                int index = 0;
                while (index < birdies.size()) {
                    if (birdies.get(index).getBird().equals(check)) {
                        
                        this.birdies.get(index).addObservation();
                        
                        trueness = false;  
                        
                        
                    }
 
                    index++;
                }        
                
                /*
                for (BirdManager x : birdies) {
                    
                    if (x.getBird().contains(check)) {
                        
                        System.out.println("Bird Observation Added!");
                        
                        this.birdies.get(0).addObservation();
                        
                        trueness = false;
                    }
                }
                */
                
                
                if (trueness == true) {
                    System.out.println("Not a bird!");
                }
                
 
                
            }
            
            
            if (command.equals("All")) {
                
                //System.out.println(birdies);
                
                int i = 0;
                while (i < birdies.size()) {
                    System.out.println(birdies.get(i));
                    i++;
                }
 
                
            }
            
            
            if (command.equals("One")) {
                
                
                System.out.println("Bird? ");
                String one = scanner.nextLine();
                
                int index = 0;
                while (index < birdies.size()) {
                    if (birdies.get(index).getBird().equals(one)) {
                        
                        System.out.println(birdies.get(index));
                        break;
    
                    }
 
                    index++;
                }        
                
                
            }
            
            
 
            
        }
        
        
        
 
    }
    
 
    
}
