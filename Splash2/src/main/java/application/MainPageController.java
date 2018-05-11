package application;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import models.Reservation;

public class MainPageController {

	
	@FXML
	private Button btn_megtekintes,btn_arjegyzek,btn_foglalas;
	
	
    @FXML
    public void megtekintes(ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_megtekintes.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../views/reservations.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("application/application.css");
        stage.setScene(scene);
        
//        JsonHandler handler = new JsonHandler();
//        handler.write();
}
    
    @FXML
    public void foglalas(ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_foglalas.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../views/reservationCreator.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("application/application.css");
        stage.setScene(scene);
    }
    
    @FXML
    public void ar(ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_arjegyzek.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../views/prices.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("application/application.css");
        stage.setScene(scene);
    }
}
