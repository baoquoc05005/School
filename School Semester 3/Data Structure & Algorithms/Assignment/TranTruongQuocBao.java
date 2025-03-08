// Full Name: Tran Truong Quoc Bao

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TranTruongQuocBao extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label lblNumber = new Label("Number:");
        TextField txtNumber = new TextField();

        Label lblName = new Label("Name:");
        TextField txtName = new TextField();

        Label lblPrice = new Label("Price:");
        TextField txtPrice = new TextField();

        Button btnSave = new Button("Save");
        Button btnQuit = new Button("Quit");

        // Set up the layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(new Label("Enter product information:"), 0, 0, 2, 1);

        gridPane.add(lblNumber, 0, 1);
        gridPane.add(txtNumber, 1, 1);

        gridPane.add(lblName, 0, 2);
        gridPane.add(txtName, 1, 2);

        gridPane.add(lblPrice, 0, 3);
        gridPane.add(txtPrice, 1, 3);

        gridPane.add(btnQuit, 0, 4);
        gridPane.add(btnSave, 1, 4);

        // Button actions
        btnSave.setOnAction(e -> {
            String number = txtNumber.getText();
            String name = txtName.getText();
            String price = txtPrice.getText();

            if (!number.isEmpty() && !name.isEmpty() && !price.isEmpty()) {
                saveProduct(number, name, price);
                txtNumber.clear();
                txtName.clear();
                txtPrice.clear();
            } else {
                showAlert("Error", "Please fill out all fields.");
            }
        });

        btnQuit.setOnAction(e -> {
            Platform.exit();
        });

        // Create scene and stage
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Inventory Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void saveProduct(String number, String name, String price) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Products.txt", true))) {
            writer.write(number + "," + name + "," + price);
            writer.newLine();
        } catch (IOException e) {
            showAlert("Error", "Failed to save product.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
