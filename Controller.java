package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

// fxml ids for SceneBuilder
    @FXML
    private Button SubmitBtn;

// sample method for pressing the submit button
    public void submitClicked(){
        SubmitBtn.setText("ouch");
    }

}
