public class Statistics implements Comparable <Statistics>{
    
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacy;
    
    
    public Statistics(String theme, String ageGroup, String gender, String country, int year, double literacy) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacy = literacy;
 
    }
    
    
    public String getTheme() {
        return theme;
    }
    
    public String getAgeGroup() {
        return ageGroup;
    }
    
    public String getGender() {
               
        return gender.substring(0, gender.length() - 4);
        
    }
    
    public String getCountry() {
        return country;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getLiteracy() {
        return literacy;
    }
    
    
    @Override
    public int compareTo(Statistics statistics) {
        //return this.literacy - statistics.getLiteracy();
        
        if (this.literacy < statistics.getLiteracy()) {
            return -1;
        } else if (this.literacy > statistics.getLiteracy()) {
            return 1;
        } else {
            return 0;
        }
        
    }
    
    
    @Override
    public String toString() {
        
        return this.country + " (" + this.year + "), " + getGender() + ", " + this.literacy;
        
    }

    
    
}
