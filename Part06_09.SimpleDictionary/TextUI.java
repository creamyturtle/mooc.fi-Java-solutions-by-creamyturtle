/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Skytech Shiva
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
        
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    
    public void start() {
        
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                
                System.out.println("Translation:");
                String trans = scanner.nextLine();
                
                this.simpleDictionary.add(word, trans);
                
                continue;                
                
            }
            
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String tobeTrans = scanner.nextLine();
                    
                if ((this.simpleDictionary.translate(tobeTrans) == null)) {
                    System.out.println("Word " + tobeTrans + " was not found");
                    continue;
                }
                System.out.println("Translation: " + this.simpleDictionary.translate(tobeTrans));
                
                continue;
                
            }
            
            
            
            System.out.println("Unknown command");
            
        }
        
    }
    
    
    
}
