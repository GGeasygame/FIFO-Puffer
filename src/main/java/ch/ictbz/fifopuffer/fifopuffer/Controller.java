package ch.ictbz.fifopuffer.fifopuffer;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField pufferSizeTextField;
    @FXML
    private TextField inputTextField;
    @FXML
    private TextField outPutTextField;

    private FifoPuffer puffer;
    public void onButtonCreatePuffer() {
        puffer = new FifoPuffer(Integer.parseInt(pufferSizeTextField.getText()));
    }

    public void onButtonPut() {
        try {
            puffer.put(Integer.parseInt(inputTextField.getText()));
        } catch(Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Die Zahl konnte nicht in den Puffer gelegt werden.");
            alert.setContentText(String.valueOf(e));
        }
    }

    public void onButtonGet() {
        try {
            outPutTextField.setText(String.valueOf(puffer.get()));
        } catch(Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Die Zahl konnte nicht vom Puffer gelesen werden.");
            alert.setContentText(String.valueOf(e));
        }

    }

    public void onButtonGetAll() {
        outPutTextField.setText(puffer.getAll());
    }
}