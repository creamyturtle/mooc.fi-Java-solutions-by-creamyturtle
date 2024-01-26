public class Money {
 
    private final int euros;
    private final int cents;
 
    public Money(int euros, int cents) {
 
        
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        
        if (cents < 0) {
            euros = euros - 1;
            cents = Math.abs(100 + cents);
        }
        
 
        this.euros = euros;
        this.cents = cents;
    }
    
    
    //public void Money() {
        
    //}
    
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth
        
        
        // return the new Money object
        return newMoney;
    }
    
    
    
    public Money minus(Money decreaser) {
        Money lessMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        
        Money zeroMoney = new Money(0, 0);
        
        /*
        if (decreaser.cents > this.cents) {
            lessMoney.euros = lessMoney.euros -1;
        }
        */
        
        /*
        if (lessMoney.cents < 0) {
            lessMoney.euros = lessMoney.euros - 1;
        }
        */
        
        
        if (lessMoney.lessThan(zeroMoney)) {
            lessMoney = zeroMoney;
        }
        
        return lessMoney;
    }
    
    
    
    
    public boolean lessThan(Money compared) {
        Money compMoney = new Money(compared.euros, compared.cents);
        
        if (this == compared) {
            return false;
        }
        
        if (!(compared instanceof Money)) {
            return false;
        }
        
        Money comparedMoney = (Money) compared;
        
        if (this.euros < comparedMoney.euros) {
            return true;
        }
        
        if (this.euros == comparedMoney.euros && this.cents < comparedMoney.cents) {
            return true;
        }
        
        return false;
    }
    
    
    
    
 
    public int euros() {
        return this.euros;
    }
 
    public int cents() {
        return this.cents;
    }
 
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
 
        return this.euros + "." + zero + this.cents + "e";
    }
 
}
