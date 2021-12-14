package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import view.tm.LoggingTM;

import java.io.IOException;
import java.net.URL;

public class LoginManagementController {
    public AnchorPane LogInContext;
    public JFXTextField userName;
    public JFXTextField userPassword;

    public void OpenLogingWindow(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        LogInContext.getChildren().clear();
        LogInContext.getChildren().add(load);
    }

    public void OpenInParkig(ActionEvent actionEvent) throws IOException {
      if (userName.getText().equals(LoggingTM.GetAddminName())&& userPassword.getText().equals(LoggingTM.GetAddminPassword())){
        URL resource = getClass().getResource("../view/LoginInPark.fxml");
        Parent load = FXMLLoader.load(resource);
        LogInContext.getChildren().clear();
        LogInContext.getChildren().add(load);
      } else {
          new Alert(Alert.AlertType.WARNING, "The user name or password that you entered is incorrect.Try Again.. ", ButtonType.CLOSE).show();
      }
    }




}
