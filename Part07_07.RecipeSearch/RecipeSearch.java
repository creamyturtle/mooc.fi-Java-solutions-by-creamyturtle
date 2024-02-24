import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class RecipeSearch {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ingredients = new ArrayList<>();
        ArrayList<Recipe> book = new ArrayList<>();
        
        RecipeBook recipeBook = new RecipeBook();
 
        System.out.println("File to read:");
        String input = scanner.nextLine();
        
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient\n");
        
        
 
        
        try (Scanner reader = new Scanner(Paths.get(input))) {
 
 
            while (reader.hasNextLine()) {
                
    
                
                String name = reader.nextLine();
                
                
                int cookTime = Integer.valueOf(reader.nextLine());
                
                Recipe recipe = new Recipe(name, cookTime);
                book.add(recipe);
                
                while (reader.hasNextLine()) {
                    
                                        
                    String ing = reader.nextLine();
 
                    
                    if (ing.isEmpty()) {
                        
                        break;
                    }
                    recipe.addIngredients(ing);
                    
 
                }
 
            }
                                        
 
 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
                
        
        
        
 
        
        
        
        while (true) {
            
            System.out.println("Enter command:");
        
            String command = scanner.nextLine();
            
            
            //if (!(command.equals("list") || command.equals("stop") || command.equals("find name") || command.equals("find cooking time"))) {
            //    continue;
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                
                System.out.println("Searched word:");
                String search = scanner.nextLine();
                
                System.out.println("");
                System.out.println("Recipes: ");
                
                //recipeBook.findName(search);
                
                
                for (Recipe recipe : book) {
                    if (recipe.getRecipeName().contains(search)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
                
                
            } else if (command.equals("find cooking time")) {
                
                System.out.println("Max cooking time:");
                int searchCookTime = Integer.valueOf(scanner.nextLine());
                
                System.out.println("");
                System.out.println("Recipes: ");
                
                               
                for (Recipe recipe : book) {
                    if (recipe.getCookTime() <= searchCookTime) {
                        System.out.println(recipe);
                    }
                }    
                
                System.out.println("");
            
                
            } else if (command.equals("find ingredient")) {
                
                System.out.println("Ingredient:");
                String ingred = scanner.nextLine();
                
                System.out.println("");
                System.out.println("Recipes: ");
                
 
                for (int i = 0; i < book.size(); i++) {
                    if (book.get(i).getIngredients().contains(ingred)) {
                        System.out.println(book.get(i));
                    }
                }
                
                
                System.out.println("");    
                
            
            
            } else if (command.equals("list")) {
                
 
                //two ways to print the same shit
 
                int i = 0;
                while (i < book.size()) {
                    System.out.println(book.get(i));
                    i++;
                }
                
                
                /*
                for (Recipe r: book) {
                    
                        System.out.println(r);
                   
                }
                */
                
                //tests
                //System.out.println(dummyList);
                //System.out.println(recipe.getRecipeName().contains(rolls));
                
                
                for (Recipe recipe : book) {
                    if (recipe.getRecipeName().contains("roll")) {
                        System.out.println(recipe);
                    }
                }
                
            } else {
                continue;
            }
 
            
        }
 
    }
 
}
