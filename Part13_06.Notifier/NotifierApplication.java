package notifier;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
 
public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage stage) {
        
        
        TextField topText = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        
        button.setOnAction((event) -> {
            label.setText(topText.getText());
        });
        
        
        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(topText, button, label);        
        
        
        Scene viewport = new Scene(componentGroup);
        
        stage.setScene(viewport);
        stage.show();
        
    }
 
 
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
 
}
 
