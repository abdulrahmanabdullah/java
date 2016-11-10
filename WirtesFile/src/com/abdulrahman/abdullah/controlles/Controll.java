package com.abdulrahman.abdullah.controlles;

import com.abdulrahman.abdullah.model.WriteFile;
import com.abdulrahman.abdullah.view.CreateFile;
import com.abdulrahman.abdullah.view.ReadFile;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Controll {

    @FXML
    public TextField textFiled;
    public TextField locationDir;
    public Label labelResult;
    public TextArea textArea;
    private CreateFile mFile ;
    private WriteFile mWrite;
    private ReadFile mReadFile ;
    private Stage stage;
    private Scanner input ;

    //obj on model dir , WriteFile.class .
    //TODO:Set text and get Text and create file method you should write here in controller.class .


    public void callWindow(ActionEvent actionEvent) throws IOException {
        //TODO:Call new window for create file .. Done
        mFile.display();

    }

    public void createFile(ActionEvent actionEvent) throws IOException{
        //DirProperty();
        DirProperty();
        String nameFile = textFiled.getText();
        String nameDir = locationDir.getText();
        if( nameFile.equals("") || nameDir.equals("")){
            labelResult.setText("Error");
        }else {
            mWrite.mWriteFile(nameFile);
            labelResult.setText("Done.");
        }
    }

    private void DirProperty() {
        mWrite = new WriteFile(locationDir.getText());
    }

    public void exitApp(ActionEvent actionEvent) {
        Platform.exit();
//        System.exit(-1);
    }

    public void readFile(ActionEvent actionEvent) throws IOException {
        mReadFile = new ReadFile();
        mReadFile.ReadF();
    }

    public void cancel(ActionEvent actionEvent) throws IOException {
        return;
    }

    public void openFile() {

        File file ;
        FileChooser fileChooser = new FileChooser();
        //Property location file chooser .
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        //only text file show .
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text File","*.txt"),
                new FileChooser.ExtensionFilter("All Files","*.*")
                );
         file = fileChooser.showOpenDialog(stage);
        //System.out.println("File is : " + file);
        try{

            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line ;
            while((line = reader.readLine()) != null){
                String[] word = line.split("\\W");
                System.out.println(line);
                textArea.appendText(line+"\n");
            }
            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
