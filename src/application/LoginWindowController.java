package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.stage.Stage;

public class LoginWindowController {
	@FXML private TextField login_username_box;
	@FXML private TextField login_password_box;
	@FXML private TextField reg_username_box;
	@FXML private TextField reg_password_box;
	@FXML private TextField reg_rep_password_box;
	@FXML private Label login_invalid_label;
	@FXML private Label reg_invalid_username_label;
	@FXML private Label reg_invalid_password_label;
	@FXML private Label success_reg_label;
	
	@FXML public void handleLoginButton(ActionEvent event) throws IOException{
		Parent piano_logged_parent = FXMLLoader.load(getClass().getResource("PianoLoggedView.fxml"));
		Scene piano_logged_scene = new Scene(piano_logged_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		
		if (isValidCredentials()){
			String username = login_username_box.getText();
			Database d = new Database();
			d.setLoggedUser(username);
			app_stage.close();
			app_stage.setScene(piano_logged_scene);
			app_stage.show();
		}
		
		else {
			login_username_box.clear();
			login_password_box.clear();
			login_invalid_label.setText("Invalid username or password!");
		}
	}
	
	@FXML public void handleRegButton(ActionEvent event) throws IOException{
		
		String newUsername = reg_username_box.getText();
		String newPass = reg_password_box.getText();
		String repPass = reg_rep_password_box.getText();
		
		reg_invalid_password_label.setText("");
		reg_invalid_username_label.setText("");
		success_reg_label.setText("");
		
		Database d = new Database();
		
		try {
			if (!d.ifUserExists(newUsername)){
				
				if (newPass.equals(repPass)){
					try {
						d.addUser(newUsername, newPass);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					success_reg_label.setText("Registrated successfully! Please log in!");
				}
				
				else {
					reg_invalid_password_label.setText("Incorrect password!");

				}
			}
			
			else {
				reg_invalid_username_label.setText("Username taken!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reg_username_box.clear();
		reg_password_box.clear();
		reg_rep_password_box.clear();
		
	}
	
	@FXML
	private boolean isValidCredentials(){
		boolean let_in = false;
		
		String username = login_username_box.getText();
		String password = login_password_box.getText();
		
		Database d = new Database();
		String password_db = new String();
		try {
			password_db = d.returnPassword(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (password.equals(password_db)){
			let_in = true;
		}
		
		return let_in;
	}
	
}
