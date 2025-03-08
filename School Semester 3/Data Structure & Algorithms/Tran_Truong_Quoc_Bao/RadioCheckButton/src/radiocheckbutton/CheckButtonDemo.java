/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiocheckbutton;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class CheckButtonDemo extends RadioButtonDemo {

    @Override
    protected BorderPane getPane() {
        BorderPane pane= super.getPane(); 

        Font fontBoldItalic = Font.font("Times New Roman",FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman",FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Times New Roman",FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        text.setFont(fontNormal);               
        VBox paneForCheckBoxes= new VBox(20);
        paneForCheckBoxes.setStyle("-fx-border-color: green");
        paneForCheckBoxes.setPadding(new Insets(15,15,15,15));
        CheckBox chkBold= new CheckBox("Bold");
        CheckBox chkItalic= new CheckBox("italic");
        paneForCheckBoxes.getChildren().addAll(chkBold,chkItalic);
        
        EventHandler<ActionEvent> hander=e->{
             if (chkBold.isSelected() && chkItalic.isSelected()) {
                text.setFont(fontBoldItalic); // Both check boxes checked
              }
              else if (chkBold.isSelected()) {
                text.setFont(fontBold); // The Bold check box checked
              }
              else if (chkItalic.isSelected()) {
                text.setFont(fontItalic); // The Italic check box checked
              }      
              else {
                text.setFont(fontNormal); // Both check boxes unchecked
              }        
        
        };
        
        chkBold.setOnAction(hander);        
        chkItalic.setOnAction(hander);        
        pane.setRight(paneForCheckBoxes);
        return pane;
    }

    @Override
    public void start(Stage primaryStage) {
        super.start(primaryStage); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static void main(String[] args) {
        launch(args);
    }

}
