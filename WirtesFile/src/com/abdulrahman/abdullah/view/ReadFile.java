package com.abdulrahman.abdullah.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by abdulrahman on 11/9/16.
 */
public class ReadFile {

    public void ReadF() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/readFile.fxml"));
        Stage stage = new Stage();
        stage.setTitle("ReadFile");
        Scene scene = new Scene(root,600,400);
        stage.setScene(scene);
        stage.show();

    }
}
