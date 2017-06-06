package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWindowController {
	
	private Main main; 
	
	public void setMain(Main main){
		this.main = main;
	}
	
	@FXML public void handleLoginButton(ActionEvent event) throws IOException{
		Parent login_window_parent = FXMLLoader.load(getClass().getResource("LoginWindowView.fxml"));
		Scene login_window_scene = new Scene(login_window_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.close();
		app_stage.setScene(login_window_scene);
		app_stage.show();
	}
	
	@FXML public void handlePlayButton(ActionEvent event) throws IOException{
		Parent piano_keys_parent = FXMLLoader.load(getClass().getResource("PianoKeysView.fxml"));
		Scene piano_keys_scene = new Scene(piano_keys_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.close();
		app_stage.setScene(piano_keys_scene);
		app_stage.show();
	}
	
}

