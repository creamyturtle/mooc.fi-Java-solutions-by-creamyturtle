/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Skytech Shiva
 */
public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    
    public Recipe (String name, int cookTime) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList<>();
        
 
    }
    
    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String getRecipeName() {
        return this.name;
    }
    
    public int getCookTime() {
        return this.cookTime;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
 
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookTime;
        //return this.name + ", cooking time: " + this.cookTime + " " + this.ingredients;
    }
    
}
