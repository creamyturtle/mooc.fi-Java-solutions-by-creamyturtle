public class Book {
    
    private String name;
    private int age;
    
    
    public Book(String name, int age) {
        
        this.name = name;
        this.age = age;
        
    }
    
    
    public String getName() {
        return this.name;
    }
    
    
    public int getAge() {
        return this.age;
    }
    
    
    @Override
    public String toString() {
        return this.name + " (recommend for " + this.age + " year-olds or older)";
    }
    
    
    
    
    
}
