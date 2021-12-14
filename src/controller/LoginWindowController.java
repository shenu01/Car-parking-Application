package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model01.*;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoginWindowController {
    public AnchorPane ParkingSystemContext;
    public ComboBox cmbVehicle;
    public ComboBox cmbDriver;
    public TextField vehicleType;
    public Label slotContext;
    public Button diliveryContext;
    public Button parkContext;
    public Label lblTime;
    public Label lblDate;
    String vehicleNumber;


    

    public void initialize() {
        Vehicle[] vehicle = AddVehicle.getArry();
        for (int i = 0; i < vehicle.length; i++) {
            cmbVehicle.getItems().add(vehicle[i].getNumber());

        }
        Driver[] driver = AddDriver.getArray();
        for (int j = 0; j < driver.length; j++){
            cmbDriver.getItems().add(driver[j].getName());
        }
        diliveryContext.setVisible(false);
        parkContext.setVisible(false);

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy:MM:dd");
            lblTime.setText(LocalDateTime.now().format(formatter));
            lblDate.setText(LocalDateTime.now().format(formatter1));
        }),new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }


    public void LogIn(ActionEvent actionEvent) throws IOException {
            URL resource = getClass().getResource("../view/LoginManagement.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Login confirmation");
            stage.show();
        }


 int temp;
    public void selectOnAction(ActionEvent actionEvent) {

        diliveryContext.setVisible(true);
        parkContext.setVisible(true);

        vehicleNumber=cmbVehicle.getSelectionModel().getSelectedItem().toString();



        String type = AddVehicle.getVehicleType(vehicleNumber);
        vehicleType.setText(type);
        int temp=AddSlot.searchSlot(vehicleNumber,type);
        if (temp==0){
            slotContext.setText("park");
            parkContext.setVisible(false);


        }else if(temp==-1){
            slotContext.setText("parked");

        }else{
            slotContext.setText(String.valueOf(temp));
        }


    }


    public void OnDiliver(ActionEvent actionEvent) {
        ParkingSlot[]parkingSlot=AddSlot.getArray();
        for (int i=0;i<parkingSlot.length;i++) {
            if (vehicleNumber.equals(parkingSlot[i])) {
                slotContext.setText("Park");
            }
        }
    }

    public void parkVehicle(ActionEvent actionEvent) {
        ParkingSlot[]parkingSlot=AddSlot.getArray();
        System.out.println(parkingSlot[temp].getSlot());
        parkingSlot[temp].setSlot(vehicleNumber);
        System.out.println(parkingSlot[temp].getSlot());
     }

    public void SelectOn(MouseEvent mouseEvent) {
    }

    public void adsdfsfadfdfdf(MouseEvent mouseEvent) {
    }
}

