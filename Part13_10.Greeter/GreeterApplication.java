package application;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
 
 
public class GreeterApplication extends Application {
    
    public void start(Stage stage) {
        
        Label enterName = new Label("Enter your name and start.");
        TextField text = new TextField("");
        Button start = new Button("Start");
        
        Label welcome = new Label();
        
        
        
        GridPane inputLayout = new GridPane();
        
        inputLayout.add(enterName, 0, 0);
        inputLayout.add(text, 0, 1);
        inputLayout.add(start, 0, 2);
        
        inputLayout.setPrefSize(300, 180);
        inputLayout.setAlignment(Pos.CENTER);
        inputLayout.setVgap(10);
        inputLayout.setHgap(10);
        inputLayout.setPadding(new Insets(20, 20, 20, 20));
        
        
        
        Scene inputView = new Scene(inputLayout);
        
        
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcome);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        
        
        start.setOnAction((event) -> {
 
            welcome.setText("Welcome " + text.getText() + "!");
            stage.setScene(welcomeView);
            
        });
        
        
 
        
        stage.setScene(inputView);
        stage.show();
    }
    
    
    
 
 
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
