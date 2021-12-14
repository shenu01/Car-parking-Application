import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model01.Demo;

import java.io.IOException;
import java.net.URL;

public class AppInitilizer extends Application {

    public static void main(String[] args) {
        Demo.test(args);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("view/LoginWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene= new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Parking System");
        primaryStage.show();


    }
}
