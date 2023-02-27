package com.example.demo9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Button Clear;

    @FXML
    private Button Ghana;

    @FXML
    private Button Kenya;

    @FXML
    private AnchorPane LESOTHO;

    @FXML
    private Button Lesotho;

    @FXML
    private Button Rauru;

    @FXML
    private Button Singapore;

    @FXML
    private AnchorPane color1;

    @FXML
    private AnchorPane color2;

    @FXML
    private AnchorPane color3;

    @FXML
    void button1Onclick(MouseEvent event) {

    }

    @FXML
    void clear(ActionEvent event) {
        color1.setStyle("-fx-background-color:#EF3340");
        color2.setStyle("-fx-background-color:#FFD100");
        color3.setStyle("-fx-background-color:#009739");

    }

    @FXML
    void ghana(ActionEvent event) {
        color1.setStyle("-fx-background-color:#00FFFF");
        color2.setStyle("-fx-background-color:#00FFFF");
        color3.setStyle("-fx-background-color:#00FFFF");

    }

    @FXML
    void kenya(ActionEvent event) {
        color1.setStyle("-fx-background-color:#000000");
        color2.setStyle("-fx-background-color:#BB0000");
        color3.setStyle("-fx-background-color:#006600");

    }

    @FXML
    void lesotho(ActionEvent event) {
        color1.setStyle("-fx-background-color:#001489");
        color2.setStyle("-fx-background-color:#FFFFFF");
        color3.setStyle("-fx-background-color:#009A44");


    }

    @FXML
    void rassia(ActionEvent event) {
        color1.setStyle("-fx-background-color:#FFFFFF");
        color2.setStyle("-fx-background-color:#1C3578");
        color3.setStyle("-fx-background-color:#E4181C");

    }

    @FXML
    void germany(ActionEvent event) {
        color1.setStyle("-fx-background-color:#000000");
        color2.setStyle("-fx-background-color:#DD0000");
        color3.setStyle("-fx-background-color:#FFCE00");

    }

}