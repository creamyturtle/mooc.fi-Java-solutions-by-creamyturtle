package application;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class ShanghaiApplication extends Application {
    
    
    @Override
    public void start(Stage stage) {
        
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series rankData = new XYChart.Series();
        rankData.setName("University of Helsinki");
        
        rankData.getData().add(new XYChart.Data(2007, 73));
        rankData.getData().add(new XYChart.Data(2008, 68));
        rankData.getData().add(new XYChart.Data(2009, 72));
        rankData.getData().add(new XYChart.Data(2010, 72));
        rankData.getData().add(new XYChart.Data(2011, 74));
        rankData.getData().add(new XYChart.Data(2012, 73));
        rankData.getData().add(new XYChart.Data(2013, 76));
        rankData.getData().add(new XYChart.Data(2014, 73));
        rankData.getData().add(new XYChart.Data(2015, 67));
        rankData.getData().add(new XYChart.Data(2016, 56));
        rankData.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(rankData);
        
        
        
        
        
        Scene view = new Scene(lineChart, 640, 480);
        
        stage.setScene(view);
        stage.show();
    }
    
    
    
 
    public static void main(String[] args) {
        
        launch(ShanghaiApplication.class);
        
    }
 
}
