package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model01.Demo;

import java.io.IOException;
import java.net.URL;

public class AddDrivercontroller {
    public AnchorPane AddDriverContext;


    public TextField txtName;
    public TextField txtDriver;
    public TextField txtNic;
    public TextField txtAddress;
    public TextField textContact;

    public void addingDriver(ActionEvent actionEvent) {
        String  a =txtName.getText();
        String  b =txtDriver.getText();
        String c =txtNic.getText();
        String d =txtAddress.getText();
        String e =textContact.getText();

        Demo.addAnotherDriver(a,b,c,d,e);
        txtName.clear();
        txtDriver.clear();
        txtNic.clear();
        txtAddress.clear();
        textContact.clear();
        new Alert(Alert.AlertType.CONFIRMATION, " Added Driver has Been successful ", ButtonType.CLOSE).show();




    }
}
