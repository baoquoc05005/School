/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiocheckbutton;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class RadioButtonDemo extends RadioCheckButton {
    @Override
    protected BorderPane getPane() {
        BorderPane pane= super.getPane();        
        VBox paneForRdaioButtons= new VBox(20);
        paneForRdaioButtons.setStyle("-fx-border-color: green");
        paneForRdaioButtons.setPadding(new Insets(15,15,15,15));
        
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        paneForRdaioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
        pane.setLeft(paneForRdaioButtons);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        
        rbRed.setOnAction(e -> {
        if (rbRed.isSelected()) {
              text.setFill(Color.RED);
        }
      });
    
    rbGreen.setOnAction(e -> {
      if (rbGreen.isSelected()) {
        text.setFill(Color.GREEN);
      }
    });
//
    rbBlue.setOnAction(e -> {
      if (rbBlue.isSelected()) {
        text.setFill(Color.BLUE);
      }
    });  
        return pane;
    }
    
     @Override
    public void start(Stage primaryStage) {
        
        super.start(primaryStage); //To change body of generated methods, choose Tools | Templates.
    }
   

}
