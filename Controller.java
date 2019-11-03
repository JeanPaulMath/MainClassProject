package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.util.HashMap;

public class Controller {
    /**
    * fxml ids for SceneBuilder
    */

    @FXML
    private Button loginButton;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button SubmitBtn;

    @FXML
    private ComboBox ProductTypeCombo;

    @FXML
    public void onLoginClick(ActionEvent click) throws Exception{
        Stage productStage = (Stage) loginButton.getScene().getWindow();
        Parent main = FXMLLoader.load(getClass().getResource("ProductTracker.fxml"));

        if (usernameField.getText().equalsIgnoreCase("JeanPaul") && passwordField.getText().equalsIgnoreCase("password")){
            productStage.setScene(new Scene(main));
            productStage.show();
        }
        else{
            usernameField.setText("Wrong Credentials!");
            passwordField.setText("Wrong Credentials!");
        }
    }
/*
    @FXML
    private ComboBox <Product.Type> ProductCodeCombo;

    */

// sample method for pressing the submit button
    public void submitClicked(){
        SubmitBtn.setText("ouch");
    }


    //combobox still doesn't display options
    @FXML
    public void ProdTypeSelection(ActionEvent click) {
       HashMap<String,String> itemType = new HashMap<>();
       itemType.put("Audio","AU");
       itemType.put("Visual","VI");
       itemType.put("AudioMobile","AM");
       itemType.put("VisualMobile","VM");
        ProductTypeCombo.setPromptText("Select Product Type");
        for (String i: itemType.keySet()){
            ProductTypeCombo.setPromptText(itemType.get(i));
        }
    }



}
