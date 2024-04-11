import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.*;
 
 

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand;
    
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    
    public void add(Card card) {
        
        hand.add(card);
        
    }
    
    
       
    
    public void print() {
        
                
        Iterator<Card> iterator = hand.iterator();
        
        while (iterator.hasNext()) {
            
            Card nextCard = iterator.next();
            System.out.println(nextCard);
            
        }
        
 
    }
    
    
    public void sort() {
        
               
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        
        
        Collections.sort(hand, comparator);
        
                
    }
    
    
    
    
    
    @Override
    public int compareTo(Hand anotherHand) {
        
        int sum1 = 0;
        int sum2 = 0;
        
        
        int x = 0;
        while (x < hand.size()) {
            sum1 += hand.get(x).getValue();
            x++;
        }
        
        
        
        int i = 0;
        while (i < anotherHand.hand.size()) {
            sum2 += anotherHand.hand.get(i).getValue();
            i++;
        }
        
        
        if (sum1 > sum2) {
            return 1;
        } else if (sum1 < sum2) {
            return -1;
        } else {
            return 0;
        }
        
 
    }
    
    
    public void sortBySuit() {
        
        BySuitInValueOrder sorted = new BySuitInValueOrder();
        Collections.sort(hand, sorted);
        
    }
    
    
 
    
}
