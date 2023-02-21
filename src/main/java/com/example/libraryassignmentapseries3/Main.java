package com.example.libraryassignmentapseries3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("front.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),300, 300);
        stage.setScene(scene);
        stage.show();
    }
    
}
