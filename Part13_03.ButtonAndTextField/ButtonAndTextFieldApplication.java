package buttonandtextfield;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
 
public class ButtonAndTextFieldApplication extends Application {
    
    
    
    public void start(Stage window) {
        
        TextField text = new TextField("text here");
        Button button = new Button("button text");
        
        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(text);
        
        
        Scene view = new Scene(components);
        
        window.setScene(view);
        window.show();
        
    }
    
 
 
    public static void main(String[] args) {
        
        launch(ButtonAndTextFieldApplication.class);
        
    }
 
}
