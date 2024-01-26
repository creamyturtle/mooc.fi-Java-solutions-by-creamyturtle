public class Archive {
    private String id;
    private String name;
    
    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        if (this.id.equals(comparedArchive.id)) {
            return true;
        }
        
        return false;
        
        
        
        
    }
    
    
    
    
    @Override
    public String toString() {
        
        // System.out.println(this.id + ": " + this.name);
        return this.id + ": " + this.name;
    }
    
    
}
