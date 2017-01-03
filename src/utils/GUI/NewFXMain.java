/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.GUI;

import inventory.Inventory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dmitry
 */
public class NewFXMain extends Application {
    
    Inventory inventory = new Inventory(500, 1000);
    
    @Override
    public void start(Stage primaryStage) {
        Label volume = new Label();
        Label weight = new Label();
        
        volume.setText(Integer.toString(inventory.getFreeVolume()));
        weight.setText(Integer.toString(inventory.getFreeWeight()));
        
        Button btn = new Button();
        
        
        
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().addAll(btn, volume, weight);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
