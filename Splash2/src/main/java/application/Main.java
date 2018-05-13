package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

Parent root = FXMLLoader.load(getClass().getResource("../views/mainPage.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("application/application.css");
        
        stage.setTitle("Splash");
        stage.setScene(scene);
        
        stage.show();
}
	
	public static void main(String[] args) {
		launch(args);
	}
}
