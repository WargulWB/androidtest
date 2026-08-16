package com.github.wargulwb.androidtest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        TextArea textArea = new TextArea("Type text here to save...");
        Button saveBtn = new Button("Save to Phone");
        Button loadBtn = new Button("Load from Phone");

        saveBtn.setOnAction(e -> DataManager.saveData(textArea.getText()));
        loadBtn.setOnAction(e -> textArea.setText(DataManager.readData()));

        VBox root = new VBox(10, textArea, saveBtn, loadBtn);
        Scene scene = new Scene(root, 360, 640);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}