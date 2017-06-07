package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PianoLoggedController extends PianoKeysController{
	
	@FXML private Label username_label;
	@FXML private ImageView imageView;
	
	@FXML
	public void initialize(){
		username_label.setText("You're currently playing as " + LoginWindowController.loggedUsername);
	}
	
	@FXML 
	public void handleLogoutButton(ActionEvent event) throws IOException{
		LoginWindowController.loggedUsername = null;
		
		Parent main_window_parent = FXMLLoader.load(getClass().getResource("MainWindowView.fxml"));
		Scene main_window_scene = new Scene(main_window_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.close();
		app_stage.setScene(main_window_scene);
		app_stage.show();
	}
	
	@FXML
	public void displaySong1(ActionEvent event){
		 File file = new File("pictures/wlazlKotek.png");
		 Image image = new Image(file.toURI().toString());
	     imageView.setImage(image);
	}
	
	
}
