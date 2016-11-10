package com.abdulrahman.abdullah;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{


    public static void main(String[] args) {
	// write your code here
        launch(args);
       // CreateFile.display();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/fxml/simple.fxml"));
        stage.setTitle("Create File ");
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.show();

    }
}
