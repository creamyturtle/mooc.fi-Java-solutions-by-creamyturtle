package validating;
 
public class Person {
 
    private String name;
    private int age;
 
    public Person(String name, int age) {
        
        if (name == null) {
            throw new IllegalArgumentException("fail");
        }
        
        if (name.equals("")) {
            throw new IllegalArgumentException("fail");
        }
        
        if (name.length() > 40) {
            throw new IllegalArgumentException("fail");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("fail");
        }
        
 
        this.name = name;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
}
