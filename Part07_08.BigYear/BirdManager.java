/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.ArrayList;
import java.util.Random;
 
 
/**
 *
 * @author Skytech Shiva
 */
public class BirdManager {
    
    private String bird;
    private String latin;
    private int observations;
    
    
    public BirdManager(String bird, String latin, int observations) {
        this.bird = bird;
        this.latin = latin;
        this.observations = observations;
    }
    
    
    
    /*
    public void addBird(String bird) {
        this.bird.add(bird);
    }
    
    public void addLatin(String latin) {
        this.latin.add(latin);
    }
    */
    
    
    
    public String getBird() {
        return this.bird;
    }
    
    public String getLatin() {
        return this.latin;
    }
    
    
    
    
    
    public void addObservation() {
        this.observations = this.observations + 1;
    }
    
    
    
    public String drawBird() {
        
        if (this.bird.isEmpty()) {
            return "No birds available";
        }
 
        Random rand = new Random();
        //return this.bird.get(rand.nextInt(birdies.size()));
        return this.bird;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.bird + " (" + this.latin + "): " + observations + " observations";
        
    }
    
    
    
    
    
    
    
    
    
}
