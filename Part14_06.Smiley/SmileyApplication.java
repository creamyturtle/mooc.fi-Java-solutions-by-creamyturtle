package smiley;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
 
 
public class SmileyApplication extends Application {
    
    
    @Override
    public void start(Stage window) {
        
        Canvas paintingCanvas = new Canvas(400, 400);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        
        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        
        
        painter.setFill(Color.WHITE);
        painter.clearRect(0, 0, 400, 400);
        
        painter.setFill(Color.BLACK);
        
        //eyes
        painter.fillRect(100, 50, 50, 50);
        painter.fillRect(250, 50, 50, 50);
        
        //mouth
        painter.fillRect(50, 200, 50, 50);
        painter.fillRect(300, 200, 50, 50);
        
        painter.fillRect(100, 250, 50, 50);
        painter.fillRect(150, 250, 50, 50);
        painter.fillRect(200, 250, 50, 50);
        painter.fillRect(250, 250, 50, 50);
        
        
        
        Scene view = new Scene(paintingLayout);
        
        window.setScene(view);
        window.show();
    }
    
 
 
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
 
}
