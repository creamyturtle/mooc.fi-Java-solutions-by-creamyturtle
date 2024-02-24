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
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
 
    
    
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
        
    }
    
    
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
 
            processCommand(input);
            //System.out.println("");
        }
        
        
    }
    
    
    public void processCommand(String command) {
        
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            System.out.println("Which one is removed?");
            int rem = Integer.valueOf(scanner.nextLine());
            remove(rem);    
        } else {
            System.out.println("Unknown command");
        }
        
    }
    
    public void add() {
        
        System.out.println("To add: ");
        String word = this.scanner.nextLine();
 
        this.todoList.add(word);
        
    }
    
    
    public void list() {
        
        this.todoList.print();
        
    }
    
    
    public void remove(int number) {
 
        this.todoList.remove(number);
        
    }
    
    
    
    
}
