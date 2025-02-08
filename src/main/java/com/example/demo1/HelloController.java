package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;

public class HelloController {
    @FXML
    private Button button;

    @FXML
    private TextField Text;

    @FXML
    private Button naviguer;

    @FXML
    public void click(ActionEvent actionEvent) {
        Text.setText("Vous avez cliqué !");
    }

    @FXML
    public void naviguer(ActionEvent actionEvent) throws IOException {
        loadScene(actionEvent, "page2.fxml");
    }

    private void loadScene(ActionEvent event, String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();

        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


}
