package com.example.libraryassignmentapseries3;

import com.example.libraryassignmentapseries3.Login.Login;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.nio.charset.Charset;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        new Login (getClass().getResource("Login.fxml"),stage);
    }

}
