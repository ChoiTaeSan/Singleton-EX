package com.example.singleton_ex;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button btn_next;
    @FXML
    private TextField tf_input;
    DataSingleton dataSingleton = DataSingleton.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn_next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    String str = tf_input.getText();
                    dataSingleton.setData(str);

                    Parent sub = FXMLLoader.load(getClass().getResource("sub.fxml"));
                    StackPane stackPane = (StackPane) btn_next.getScene().getRoot();
                    stackPane.getChildren().add(sub);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}