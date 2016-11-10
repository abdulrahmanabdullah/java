package com.abdulrahman.abdullah.view;

import com.abdulrahman.abdullah.model.WriteFile;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by abdulrahman on 11/1/16.
 */
public class CreateFile {

    public static void display() throws IOException {
        Parent root = FXMLLoader.load(CreateFile.class.getResource("/fxml/createFile.fxml"));
        Stage stage = new Stage() ;
        stage.setTitle("Create File");
        Scene scene = new Scene(root,600,400);
        stage.setScene(scene);

        stage.show();

    }
}
