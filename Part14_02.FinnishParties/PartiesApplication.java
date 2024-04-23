package application;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class PartiesApplication extends Application {
    
    
    @Override
    public void start(Stage stage) {
        
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");
 
        
        Scanner scanner = new Scanner(System.in);
 
        String filename = "partiesdata.tsv";
 
        Map<String, Map<Integer, Double>> values = readData(filename);
        
        
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
 
            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
 
            // and add the data set to the chart
            lineChart.getData().add(data);
        });
 
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
 
        
    }
    
 
    public static void main(String[] args) {
        launch(PartiesApplication.class);
        
    }
    
    
    public static Map<String, Map<Integer, Double>> readData(String file) {
        
        Map<String, Map<Integer, Double>> dummy = new HashMap<>();
        
        ArrayList<Integer> years = new ArrayList<>();
        
        //years does not contain "party" label at posistion 0
        //there are 11 years of data.  so positions 0 through 10, or < 11
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
    
            String row = scanner.nextLine();
 
            String[] pieces = row.split("\t");
 
            String partyLabel = pieces[0];
 
            for (int i = 1; i < pieces.length; i++) {
                years.add(Integer.valueOf(pieces[i]));
            }
                
                
            while(scanner.hasNextLine()) { 
                
               
                String row2 = scanner.nextLine();
                
                String[] data = row2.split("\t");
                
                int x = 0;
                
                HashMap<Integer, Double> middle = new HashMap<>();
 
                
                for (int i = 1; i < data.length; i++) {
                    
                    if (!data[i].equals("-")) {
                        middle.put(years.get(i - 1), Double.valueOf(data[i]));
                    }
 
                
                }
 
                dummy.put(data[0], middle);
                x++;
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error homie");
        }
        
 
        
        return dummy;
        
    }
    
 
}
