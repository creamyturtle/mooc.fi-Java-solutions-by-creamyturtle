/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Skytech Shiva
 */
public class GradeRegister {
    private ArrayList<Integer> pts;
    private ArrayList<Integer> grades;
    
    public GradeRegister() {
        this.pts = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    
    public void addPointsToArray(int points) {
        
        this.pts.add(points);
        
    }
    
    
    public double calcAverage() {
        
        int sum = 0;
        for (int i = 0; i < this.pts.size(); i++) {
            sum += this.pts.get(i);
        }
        
        double avg = 1.0 * sum / this.pts.size();
        
        return avg;
    }
    
    
    public String calcPassingAverage() {
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < this.pts.size(); i++) {
            
            if (this.pts.get(i) >= 50) {
                sum += this.pts.get(i);
                count++;
            }
 
        }
        
        double avg = 1.0 * sum / count;
        
        if (count == 0) {
            return "Point average (passing): -";
        } else {
            return "Point average (passing): " + avg;
        }
 
    }
    
    
    public double passPct() {
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < this.pts.size(); i++) {
            
            if (this.pts.get(i) >= 50) {
                sum += this.pts.get(i);
                count++;
            }
 
        }
   
        return 1.0 * count / this.pts.size() * 100.00;
 
    }
    
    
    public void pointsAsGrades(int grade) {
        
 
 
        if (grade < 50) {
            this.grades.add(0);
        } else if (grade < 60) {
            this.grades.add(1);
        } else if (grade < 70) {
            this.grades.add(2);
        } else if (grade < 80) {
            this.grades.add(3);
        } else if (grade < 90) {
            this.grades.add(4);
        } else if (grade >= 90) {
            this.grades.add(5);
        }
 
        
    }
    
    
    
    public int numberOfGrades() {
        return this.grades.size();
    }
    
    
    
    public int getGrades(int grade) {
        
        int count = 0;
        int i = 0;
        
        while (i < this.grades.size()) {
            if (this.grades.get(i) == grade) {
                count++;
            }
            i++;
        }
        return count;
        
    }
    
 
    
    
    
    
}
