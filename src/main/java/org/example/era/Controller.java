package org.example.era;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.net.URI;

public class Controller {
    @FXML
    private TextField urlTextField;
    @FXML
    private TextField pathTextField;

    private String name = null;
    private URI directory = null;

    public static Stage stage;

    @FXML
    private void initialize() {

    }

    @FXML
    private void onDownload(ActionEvent event) {

    }

    @FXML
    private void onEnable(ActionEvent event) {
        var node = (CheckBox) event.getSource();

        if (node.isSelected()) {
            pathTextField.getParent().getParent().setDisable(false);
        } else {
            pathTextField.setText(null);
            pathTextField.getParent().getParent().setDisable(true);
            name = null;
            directory = null;
        }
    }

    @FXML
    private void onChoose() {
        pathTextField.setText((directory = new DirectoryChooser().showDialog(stage.getScene().getWindow()).toURI()).toString());
    }
}
