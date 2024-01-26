public class SimpleDate {
 
    private int day;
    private int month;
    private int year;
 
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
 
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
 
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }
 
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
 
        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }
 
        return false;
    }
    
    
    public void advance() {
        
        if (this.day == 30 && this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year = this.year + 1;
            
            
            
        } else if (this.day == 30) {
            this.day = 1;
            this.month = this.month + 1;
            
        } else if (this.day <= 30) {
            this.day = this.day + 1;
            
        }
    }
    
    public void advance(int howManyDays) {
        
        /*
        int days = 1;
        int months = days * 30;
        int years = months * 12;
        */
        
        if (howManyDays > 360) {
            this.year = this.year + (howManyDays / 360);
            this.month = this.month + (howManyDays % 360) / 30;
            this.day = this.day + (((howManyDays) % 360) % 30);
        }
        
        if (howManyDays > 30 && howManyDays < 360) {
            this.month = this.month + (howManyDays / 30);
            this.day = this.day + howManyDays % 30;
        }
        
        
        if (this.day == 30 && this.month == 12) {
            this.day = howManyDays;
            this.month = 1;
            this.year = this.year + 1;
            
            
            
        } else if (this.day == 30) {
            this.day = howManyDays;
            this.month = this.month + 1;
            
        } else if (this.day <= 30) {
            this.day = this.day + howManyDays;
            
        }
        
        
        
        
        if (this.day > 30) {
            this.day = this.day - 30;
            this.month = this.month + 1;
        }
        
        
        
        
 
        
    }
    
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        newDate.advance(days);
        
        
        return newDate;
    }
    
    
    
    
 
}
