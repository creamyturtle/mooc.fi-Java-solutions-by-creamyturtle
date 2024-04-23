package textstatistics;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Arrays;
 
 
public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        Label letterCount = new Label("Letters: 0");
        Label wordCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        TextArea textArea = new TextArea("");
        
        
        
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();
 
            
            letterCount.setText("Letters: " + characters);
            wordCount.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
        });
        
        
        
        
        
        HBox texts = new HBox();
        texts.setSpacing(20);
        
        //texts.getChildren().add(new Label("Letters: "));
        texts.getChildren().add(letterCount);
        
        //texts.getChildren().add(new Label("Words: "));
        texts.getChildren().add(wordCount);
        
        //texts.getChildren().add(new Label("The longest word is:"));
        texts.getChildren().add(longestWord);
        
        
        layout.setBottom(texts);
        layout.setCenter(textArea);
        
 
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.setTitle("Text Statistics App");
        window.show();
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        launch(TextStatisticsApplication.class);
        
    }
 
}
