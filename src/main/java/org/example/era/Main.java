package org.example.era;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Controller.stage = primaryStage;
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"))));
        primaryStage.setTitle("The New Era");
        primaryStage.setOnCloseRequest(e -> {
            Platform.exit();
            System.exit(0);
        });
        primaryStage.show();
    }
}
