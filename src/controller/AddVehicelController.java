package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model01.Demo;

import java.io.IOException;
import java.net.URL;

public class AddVehicelController {
    public AnchorPane AddVehicelContext;
    public TextField TxtNumber;
    public TextField TxtPassengers;
    public TextField TxtWeigth;
    public ComboBox cmbType;

    public void initialize(){

        cmbType.getItems().addAll(
                "Van","CargoLorry","Bus");
    }


    public void AddingVehicel(ActionEvent actionEvent) {

        String a=TxtNumber.getText();
        String b=cmbType.getSelectionModel().getSelectedItem().toString();
        String c=TxtWeigth.getText();
        String d=TxtPassengers.getText();

        Demo.addAnotherVehicel(a,b,c,d);
        cmbType.getSelectionModel().clearSelection();
        TxtNumber.clear();
        TxtWeigth.clear();
        TxtPassengers.clear();
        new Alert(Alert.AlertType.CONFIRMATION, " Added Vehicle has Been successful  ", ButtonType.CLOSE).show();





    }
}
