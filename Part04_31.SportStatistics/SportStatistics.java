import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            int count = 0;
            int homeWins = 0;
            int awayWins = 0;
            int wins = 0;
            int homeLosses = 0;
            int awayLosses = 0;
            int losses = 0;
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                
                if (home.equals(team) || away.equals(team)) {
                    count++;
                }
                
                if (home.equals(team) && homePoints > awayPoints) {
                    homeWins++;
                }
                
                if (home.equals(team) && homePoints < awayPoints) {
                    homeLosses++;
                }
                
                if (away.equals(team) && homePoints < awayPoints) {
                    awayWins++;
                }
                
                if (away.equals(team) && homePoints > awayPoints) {
                    awayLosses++;
                }
                
                wins = homeWins + awayWins;
                losses = homeLosses + awayLosses;
                
            }
            
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
            
            
            
            
        } catch (Exception e) {
            System.out.println("File cannot be read homie");
        }
        
        
        //read file here
        
        //print data
        
        
        
        
        
        
 
    }
 
}
