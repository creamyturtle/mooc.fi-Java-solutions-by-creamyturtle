package dictionary;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // You can test your dictionary here
        
        /*
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();
 
        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }
 
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        */
        
        
        
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();
 
        // use the dictionary
 
        //dictionary.save();
        
        
        
        System.out.println("");
        dictionary.print();
        
        
    }
}
