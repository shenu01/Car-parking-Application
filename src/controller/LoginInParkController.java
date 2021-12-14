package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginInParkController {
    public AnchorPane InParkingContext;



    public void LogOut(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        InParkingContext.getChildren().clear();
        InParkingContext.getChildren().add(load);
    }

    public void OpenAddDriver(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriver.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Login confirmation");
        stage.show();
    }




    public void OpenAddVehicelll(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicel.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Login confiirmation");
        stage.show();
    }



    public void OpenInParkingUi(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LogInDilivery.fxml");
        Parent load = FXMLLoader.load(resource);
        InParkingContext.getChildren().clear();
        InParkingContext.getChildren().add(load);

    }
}
