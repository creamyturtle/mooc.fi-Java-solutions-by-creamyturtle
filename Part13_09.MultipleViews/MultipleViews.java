package application;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
 
 
 
public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window) {
 
        Button firstButton = new Button("To the second view!");
        Label topText = new Label("First view!");
        
        Button secondButton = new Button("To the third view!");
        Label secondText = new Label("Second view!");
        
        Button thirdButton = new Button("To the first view!");
        Label thirdText = new Label("Third view!");
        
        
        
        BorderPane bpane = new BorderPane();
        bpane.setTop(topText);
        bpane.setCenter(firstButton);
        
        VBox vbox = new VBox();
        vbox.getChildren().add(secondButton);
        vbox.getChildren().add(secondText);
        
        GridPane gpane = new GridPane();
        gpane.add(thirdText, 0, 0);
        gpane.add(thirdButton, 1, 1);
        
        
 
        Scene firstScene = new Scene(bpane);
        Scene secondScene = new Scene(vbox);
        Scene thirdScene = new Scene(gpane);
        
 
        
        firstButton.setOnAction((event) -> {
            window.setScene(secondScene);
        });
 
        secondButton.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        
        thirdButton.setOnAction((event) -> {
            window.setScene(firstScene);
        });
        
 
        
        window.setScene(firstScene);
        window.show();
    }
    
 
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
 
}
