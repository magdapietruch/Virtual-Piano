package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PianoLoggedController extends PianoKeysController{
	
	@FXML private Label username_label;
	
	
//	public PianoLoggedController(){
//		setLabel();
//	}
	
	@FXML
	public void setLabel(){
		Database d = new Database();
		String user = d.getLoggedUser();
		username_label.setText("You're currently playing as " + user);
	}
	
}
