package utils.GUI;

import beans.food.vegetables.Cabbage;
import beans.food.vegetables.Carrot;
import beans.food.vegetables.Potato;
import beans.food.vegetables.Pumpkin;
import beans.food.vegetables.Tomato;
import constants.VegetablesNames;
import inventory.AbstractInventory;
import inventory.Inventory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Dmitry
 */
public class NewFXMain extends Application {

    AbstractInventory inventory = new Inventory(500, 100);
    Label volume = new Label();
    Label weight = new Label();

    @Override
    public void start(Stage primaryStage) {

        volume.setPrefSize(75, 20);
        volume.setLayoutX(0);
        volume.setLayoutY(0);

        weight.setPrefSize(75, 20);
        weight.setLayoutX(0);
        weight.setLayoutY(20);

        volume.setText("Volume: " + inventory.getFreeVolume());
        weight.setText("Weight: " + inventory.getFreeWeight());

        Button btn = new Button();
        btn.setLayoutX(0);
        btn.setLayoutY(200);

        btn.setText("Print");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println(inventory.getInventoryObjects());
            }
        });

        Button cabbage = new Button(VegetablesNames.CABBAGE);
//        cabbage.setLayoutX(50);
//        cabbage.setLayoutY(200);
        cabbage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inventory.addObject(new Cabbage());
                rename();
            }
        });
        
        Button carrot = new Button(VegetablesNames.CARROT);
//        carrot.setLayoutX(105);
//        carrot.setLayoutY(200);
        carrot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inventory.addObject(new Carrot());
                rename();
            }
        });
        
        Button potato = new Button(VegetablesNames.POTATO);
//        potato.setLayoutX(150);
//        potato.setLayoutY(200);
        potato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inventory.addObject(new Potato());
                rename();
            }
        });
        
        Button pumkin = new Button(VegetablesNames.PUMKIN);
//        pumkin.setLayoutX(200);
//        pumkin.setLayoutY(200);
        pumkin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inventory.addObject(new Pumpkin());
                rename();
            }
        });
        
        Button tomato = new Button(VegetablesNames.TOMATO);
//        tomato.setLayoutX(250);
//        tomato.setLayoutY(200);
        tomato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inventory.addObject(new Tomato());
                rename();
            }
        });

        VBox vBox = new VBox(5);
        vBox.setLayoutX(200);
        vBox.getChildren().addAll(cabbage, carrot, potato, pumkin, tomato);
        
//        inventory.getElement(3);
        
        Pane root = new Pane();
//        StackPane root = new StackPane();
        root.getChildren().addAll(btn, volume, weight, vBox);

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

    private void rename() {
        volume.setText("Volume: " + inventory.getFreeVolume());
        weight.setText("Weight: " + inventory.getFreeWeight());
    }

}
