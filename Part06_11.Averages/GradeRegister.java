import java.util.ArrayList;
 
public class GradeRegister {
 
    private ArrayList<Integer> grades;
    private ArrayList<Integer> rawPoints;
 
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.rawPoints = new ArrayList<>();
    }
 
    public void addGradeBasedOnPoints(int points) {
        
        this.rawPoints.add(points);
        this.grades.add(pointsToGrade(points));
    }
 
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
 
        return count;
    }
 
    public static int pointsToGrade(int points) {
 
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
 
        return grade;
    }
    
    
    public double averageOfGrades() {
        
        if (grades.isEmpty()) {
            return -1;
        }
        
        int i = 0;
        int sum = 0;
        
        while (i < grades.size()) {
            sum += this.grades.get(i);
            i++;
        }
        
        double avg = 1.0 * sum / grades.size();
        
        return avg;
        
        
    }
    
    
    public double averageOfPoints() {
        
        if (rawPoints.isEmpty()) {
            return -1;
        }
        
        int i = 0;
        int sum = 0;
        
        while (i < rawPoints.size()) {
            sum += this.rawPoints.get(i);
            i++;
        }
        
        double avg = 1.0 * sum / rawPoints.size();
        
        return avg;
       
    }
    
    
    
    
    
}
