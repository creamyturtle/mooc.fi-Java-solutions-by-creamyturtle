package application;
 
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.event.EventType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.geometry.Insets;
import javafx.scene.chart.XYChart;
 
public class SavingsCalculatorApplication extends Application {
 
    public void start(Stage stage) {
        
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Years");
        yAxis.setLabel("Savings");
        
        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("Savings Account");
        lineChart.setAnimated(false);
        
        BorderPane topPane = new BorderPane();
        Label monthlySavings = new Label("Monthly savings");
        Slider topSlider = new Slider(25, 250, 50);
        topSlider.setShowTickMarks(true);
        topSlider.setShowTickLabels(true);
        topSlider.setMajorTickUnit(25);
        topSlider.setBlockIncrement(5);
        
        Label savingsValue = new Label("");
        topPane.setPadding(new Insets(10, 10, 10, 10));
        
        savingsValue.setText(String.valueOf(topSlider.getValue()));
        
        topPane.setLeft(monthlySavings);
        topPane.setCenter(topSlider);
        topPane.setRight(savingsValue);
        
        
        BorderPane topBotPane = new BorderPane();
        Label yearlyInt = new Label("Yearly interest rate");
        Slider botSlider = new Slider(0, 10, 10);
        botSlider.setShowTickMarks(true);
        botSlider.setShowTickLabels(true);
        botSlider.setMajorTickUnit(10f);
        botSlider.setBlockIncrement(10);
        
        
        Label interestValue = new Label("");
        topBotPane.setPadding(new Insets(10, 10, 10, 10));
        
        interestValue.setText(String.valueOf(botSlider.getValue()));
        
        topBotPane.setLeft(yearlyInt);
        topBotPane.setCenter(botSlider);
        topBotPane.setRight(interestValue);
 
        
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 10, 10, 10));
        
        vbox.getChildren().addAll(topPane, topBotPane);
 
        
        layout.setCenter(lineChart);
        layout.setTop(vbox);
        
        
        //adding slider data
        
        XYChart.Series moneyData = new XYChart.Series();
        moneyData.setName("Money");
        
        XYChart.Series interestData = new XYChart.Series();
        interestData.setName("Money w/ Interest");
        
        
        
        //STARTING DATA PLOTS
        //money without interest
        
        int year = 0;
        double savings = topSlider.getValue() * 12;
        double dummy = savings;
        
        moneyData.getData().add(new XYChart.Data(0, 0));
        
        for (year = 1; year < 31; year++) {
            
            moneyData.getData().add(new XYChart.Data(year, savings));
            
            
            savings += dummy;
 
        }
        
        lineChart.getData().add(moneyData);
        
        
        //money with interest
        
        year = 0;
        double rate = botSlider.getValue();
        savings = (topSlider.getValue() * 12);
        dummy = savings;
        double cumInterest = 0;
        
        interestData.getData().add(new XYChart.Data(0, 0));
        
        for (year = 1; year < 31; year++) {
            
            cumInterest = savings * (rate / 100);
            savings += cumInterest;
            
            interestData.getData().add(new XYChart.Data(year, savings));
 
            savings += dummy;
            
 
        }
        
        lineChart.getData().add(interestData);
        
 
        
        
        //actions when moving the top slider, update data
        
        ChangeListener<Object> listener = (obs, oldValue, newValue) -> {
            
            lineChart.getData().clear();
            moneyData.getData().clear();
            
            moneyData.getData().add(new XYChart.Data(0, 0));    
            
            double savings2 = topSlider.getValue() * 12;
            double dummy2 = savings2;
            
            for (int year2 = 1; year2 < 31; year2++) {
            
                moneyData.getData().add(new XYChart.Data(year2, savings2));
 
 
                savings2 += dummy2;
 
            }
            lineChart.getData().add(moneyData);    
                
            double rounded = Math.round(topSlider.getValue() * 100.0) / 100.0;
            savingsValue.setText(String.valueOf(rounded));
            
            
            
            interestData.getData().clear();
            
            int year3 = 0;
            double rate3 = botSlider.getValue();
            double savings3 = (topSlider.getValue() * 12);
            double dummy3 = savings3;
            double cumInterest3 = 0;
 
            interestData.getData().add(new XYChart.Data(0, 0));
 
            for (year3 = 1; year3 < 31; year3++) {
                
                cumInterest3 = savings3 * (rate3 / 100);
                savings3 += cumInterest3;
                
                interestData.getData().add(new XYChart.Data(year3, savings3));
 
                savings3 += dummy3;
                
 
            }
 
            lineChart.getData().add(interestData);
 
            
            
        };
        topSlider.valueProperty().addListener(listener);
        topSlider.valueChangingProperty().addListener(listener);
        
        
        
        
        //actions when moving the bottom slider, update data
        
        ChangeListener<Object> listener2 = (obs, oldValue, newValue) -> {
            
            lineChart.getData().clear();
            
            moneyData.getData().clear();
            
            moneyData.getData().add(new XYChart.Data(0, 0));    
            
            double savings2 = topSlider.getValue() * 12;
            double dummy2 = savings2;
            
            for (int year2 = 1; year2 < 31; year2++) {
            
                moneyData.getData().add(new XYChart.Data(year2, savings2));
 
 
                savings2 += dummy2;
 
            }
            lineChart.getData().add(moneyData);    
                
            double rounded = Math.round(topSlider.getValue() * 100.0) / 100.0;
            savingsValue.setText(String.valueOf(rounded));
            
           
            interestData.getData().clear();
            
            int year3 = 0;
            double rate3 = botSlider.getValue();
            double savings3 = (topSlider.getValue() * 12);
            double dummy3 = savings3;
            double cumInterest3 = 0;
 
            interestData.getData().add(new XYChart.Data(0, 0));
 
            for (year3 = 1; year3 < 31; year3++) {
                
                cumInterest3 = savings3 * (rate3 / 100);
                savings3 += cumInterest3;
                
                interestData.getData().add(new XYChart.Data(year3, savings3));
 
 
                savings3 += dummy3;
 
 
            }
 
            lineChart.getData().add(interestData);
 
            double rounded2 = Math.round(botSlider.getValue() * 100.0) / 100.0;
            interestValue.setText(String.valueOf(rounded2));
            
        };
        botSlider.valueProperty().addListener(listener2);
        botSlider.valueChangingProperty().addListener(listener2);
        
 
 
        
        
        Scene view = new Scene(layout, 650, 500);
        
        stage.setScene(view);
        stage.show();
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        launch(SavingsCalculatorApplication.class);
        
        
    }
 
    
 
}
