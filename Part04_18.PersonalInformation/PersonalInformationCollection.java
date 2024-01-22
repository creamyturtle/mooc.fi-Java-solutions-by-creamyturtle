import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalInformationCollection {
 
    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
 
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("First name:");
            String fname = scanner.nextLine();
            if (fname.isEmpty()) {
                break;
            }
            
            
            System.out.println("Last name:");
            String lname = scanner.nextLine();
            if (lname.isEmpty()) {
                break;
            }
            
            System.out.println("Identification number:");
            String idnum = scanner.nextLine();
            if (idnum.isEmpty()) {
                break;
            }
        
            infoCollection.add(new PersonalInformation(fname, lname, idnum));
            
            
        }
        
        System.out.println();
        
        /*
        for (PersonalInformation x : infoCollection) {
            System.out.println(x);
        }
        */
        
        
        
        for (int i =0; i < infoCollection.size(); i++) {
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
            
            //System.out.println(infoCollection.getFirstName());
        }
        
        
        
        
 
    }
}
