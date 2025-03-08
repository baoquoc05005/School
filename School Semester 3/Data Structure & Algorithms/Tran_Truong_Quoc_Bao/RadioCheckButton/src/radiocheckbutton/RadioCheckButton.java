package radiocheckbutton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class RadioCheckButton extends Application {
    
    Text text = new Text(100, 100, "JavaFX Programming");
    
    @Override
    public void start(Stage primaryStage) {         
        Scene scene = new Scene(getPane(), 600, 400); =
        primaryStage.setTitle("Move the Text!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    protected BorderPane getPane() {
        BorderPane pane = new BorderPane();
        
        // Define buttons
        Button btLeft = new Button("Left", new ImageView("/Images/left.gif"));
        Button btRight = new Button("Right", new ImageView("/Images/right.gif"));
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btTopLeft = new Button("Top Left");
        Button btTopRight = new Button("Top Right");
        Button btBottomLeft = new Button("Bottom Left");
        Button btBottomRight = new Button("Bottom Right");

        btRight.setContentDisplay(ContentDisplay.RIGHT);
        
        // Define event handlers for button actions
        btLeft.setOnAction(e -> {
            double x = text.getX();
            if (x > 60)
                text.setX(x - 4);        
        });
        
        btRight.setOnAction(e -> {
            double x = text.getX();
            if (x < 180)
                text.setX(x + 4);        
        });
        
        btUp.setOnAction(e -> {
            double y = text.getY();
            if (y > 40)
                text.setY(y - 4);
        });
        
        btDown.setOnAction(e -> {
            double y = text.getY();
            if (y < 180)
                text.setY(y + 4);
        });
        
        btTopLeft.setOnAction(e -> {
            double x = text.getX();
            double y = text.getY();
            if (x > 60 && y > 40) {
                text.setX(x - 4);
                text.setY(y - 4);
            }
        });
        
        btTopRight.setOnAction(e -> {
            double x = text.getX();
            double y = text.getY();
            if (x < 180 && y > 40) {
                text.setX(x + 4);
                text.setY(y - 4);
            }
        });
        
        btBottomLeft.setOnAction(e -> {
            double x = text.getX();
            double y = text.getY();
            if (x > 60 && y < 180) {
                text.setX(x - 4);
                text.setY(y + 4);
            }
        });
        
        btBottomRight.setOnAction(e -> {
            double x = text.getX();
            double y = text.getY();
            if (x < 180 && y < 180) {
                text.setX(x + 4);
                text.setY(y + 4);
            }
        });

        // I put buttons and add them to HBox
        HBox buttonBox = new HBox(10);
        buttonBox.setStyle("-fx-border-color:green");
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(10, 10, 10, 10));
        buttonBox.getChildren().addAll(btLeft, btRight, btUp, btDown, btTopLeft, btTopRight, btBottomLeft, btBottomRight);
        
        // Add HBox to BorderPane and set the text in the center of the pane
        pane.setBottom(buttonBox);
        
        Pane textPane = new Pane();
        textPane.getChildren().add(text);
        pane.setCenter(textPane);

        return pane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
