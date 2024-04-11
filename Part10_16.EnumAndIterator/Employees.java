import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 

public class Employees {
    
    private List<Person> employees;
    
    
    public Employees() {
        
        this.employees = new ArrayList<>();
        
    }
    
    
    public void add(Person personToAdd) {
        
        this.employees.add(personToAdd);
        
    }
    
    
    public void add(List<Person> peopleToAdd) {
        
        for (Person x : peopleToAdd) {
            employees.add(x);
        }
        
    }
    
    
    public void print() {
        
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
            
        }
        
        
    }
    
    public void print(Education education) {
        
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            
            Person nextPerson = iterator.next();
            
            if(nextPerson.getEducation() == education) {
                
                System.out.println(nextPerson);
                
            }
            
            
            
        }
        
    }
    
    
    
    public void fire(Education education) {
        
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            
            Person nextPerson = iterator.next();
            
            if(nextPerson.getEducation() == education) {
                
                iterator.remove();
                
            }
            
            
            
        }
        
    }
    
    
    
    
}
