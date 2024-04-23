package ticTacToe;
 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
 
 
public class TicTacToeApplication extends Application {
    
    
    public void start(Stage stage) {
        
        Logic logic = new Logic();
        
        
        BorderPane layout = new BorderPane();
        GridPane gp = new GridPane();
        
        Label topLabel = new Label("Turn: X");
        topLabel.setFont(Font.font("Monospaced", 40));
        
        layout.setTop(topLabel);
        layout.setCenter(gp);
        
        Button one = new Button();
        Button two = new Button();
        Button three = new Button();
        Button four = new Button();
        Button five = new Button();
        Button six = new Button();
        Button seven = new Button();
        Button eight = new Button();
        Button nine = new Button();
        
        one.setFont(Font.font("Monospaced", 40));
        two.setFont(Font.font("Monospaced", 40));
        three.setFont(Font.font("Monospaced", 40));
        four.setFont(Font.font("Monospaced", 40));
        five.setFont(Font.font("Monospaced", 40));
        six.setFont(Font.font("Monospaced", 40));
        seven.setFont(Font.font("Monospaced", 40));
        eight.setFont(Font.font("Monospaced", 40));
        nine.setFont(Font.font("Monospaced", 40));
        
        one.setPrefSize(75, 75);
        two.setPrefSize(75, 75);
        three.setPrefSize(75, 75);
        four.setPrefSize(75, 75);
        five.setPrefSize(75, 75);
        six.setPrefSize(75, 75);
        seven.setPrefSize(75, 75);
        eight.setPrefSize(75, 75);
        nine.setPrefSize(75, 75);
 
 
        gp.add(one, 1, 1);
        gp.add(two, 2, 1);
        gp.add(three, 3, 1);
        gp.add(four, 1, 2);
        gp.add(five, 2, 2);
        gp.add(six, 3, 2);
        gp.add(seven, 1, 3);
        gp.add(eight, 2, 3);
        gp.add(nine, 3, 3);
        
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPrefSize(250, 300);
        
        
        
        //actions
        
        String player1 = "X";
        String player2 = "O";
        String activePlayer = player2;
        String otherPlayer = player1;
        
        
 
            
        String dummy = activePlayer;
 
        one.setOnAction((event) -> {
 
 
 
            if (logic.oneIsPlayed == false && logic.ticTacToe() == false) {
                one.setText(logic.box1(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
 
        });
 
 
        two.setOnAction((event) -> {
 
 
            if (logic.twoIsPlayed == false && logic.ticTacToe() == false) {
                two.setText(logic.box2(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
        });
 
 
        three.setOnAction((event) -> {
 
 
            if (logic.threeIsPlayed == false && logic.ticTacToe() == false) {
                three.setText(logic.box3(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
        });
 
 
        four.setOnAction((event) -> {
 
 
            if (logic.fourIsPlayed == false && logic.ticTacToe() == false) {
                four.setText(logic.box4(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
        });
 
 
        five.setOnAction((event) -> {
 
 
            if (logic.fiveIsPlayed == false && logic.ticTacToe() == false) {
                five.setText(logic.box5(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
        });
 
 
        six.setOnAction((event) -> {
 
 
            if (logic.sixIsPlayed == false && logic.ticTacToe() == false) {
                six.setText(logic.box6(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
        });
 
 
        seven.setOnAction((event) -> {
 
 
            if (logic.sevenIsPlayed == false && logic.ticTacToe() == false) {
                seven.setText(logic.box7(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
        });
 
 
        eight.setOnAction((event) -> {
 
 
            if (logic.eightIsPlayed == false && logic.ticTacToe() == false) {
                eight.setText(logic.box8(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
        });
 
 
        nine.setOnAction((event) -> {
 
 
            if (logic.nineIsPlayed == false && logic.ticTacToe() == false) {
                nine.setText(logic.box9(logic.getActivePlayer()));
                logic.setActivePlayer(logic.getActivePlayer());
                topLabel.setText("Turn: " + logic.getActivePlayer());
 
            }
 
            if (logic.ticTacToe() == true) {
                topLabel.setText("The end!");
            }
 
 
        });
            
 
        
        
        Scene view = new Scene(layout, 300, 350);
        
        stage.setScene(view);
        stage.show();
    }
 
    
    
 
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
 
}
