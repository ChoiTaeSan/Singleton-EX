package com.example.singleton_ex;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class SubController implements Initializable {
    @FXML private Label label;
    @FXML private Button btn_back;
    @FXML private AnchorPane sub_layout;
    DataSingleton dataSingleton = DataSingleton.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText(dataSingleton.getData());
        btn_back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StackPane stackPane = (StackPane) btn_back.getScene().getRoot();
                stackPane.getChildren().remove(sub_layout);
            }
        });

    }
}
