package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    Stage primaryStage;
    VBox vbox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Fallout PNP Character Generator");
        setUpCharacterGenerator();
    }

    private void setUpCharacterGenerator(){
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Launcher.class.getResource("view/Launcher.fxml"));
            vbox =  loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(vbox);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
