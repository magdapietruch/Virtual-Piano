package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class PianoKeysController {

	@FXML public void handleLoginButton(ActionEvent event) throws IOException{
		Parent login_window_parent = FXMLLoader.load(getClass().getResource("LoginWindowView.fxml"));
		Scene login_window_scene = new Scene(login_window_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.close();
		app_stage.setScene(login_window_scene);
		app_stage.show();	
	}
	
	@FXML public void handleMainMenu(ActionEvent event) throws IOException{
		Parent main_window_parent = FXMLLoader.load(getClass().getResource("MainWindowView.fxml"));
		Scene main_window_scene = new Scene(main_window_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.close();
		app_stage.setScene(main_window_scene);
		app_stage.show();	
		
	}
	
	@FXML public void playC(){
		String musicFile = "sounds/C.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playC_s(){
		String musicFile = "sounds/C_s.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playD(){
		String musicFile = "sounds/D.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playD_s(){
		String musicFile = "sounds/D_s.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playE(){
		String musicFile = "sounds/E.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playF(){
		String musicFile = "sounds/F.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playF_s(){
		String musicFile = "sounds/F_s.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playG(){
		String musicFile = "sounds/G.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playG_s(){
		String musicFile = "sounds/G_s.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playA(){
		String musicFile = "sounds/A.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playA_s(){
		String musicFile = "sounds/A_s.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playB(){
		String musicFile = "sounds/B.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playC_1(){
		String musicFile = "sounds/C_1.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playC_s_1(){
		String musicFile = "sounds/C_s_1.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playD_1(){
		String musicFile = "sounds/D_1.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playD_s_1(){
		String musicFile = "sounds/D_s_1.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playE_1(){
		String musicFile = "sounds/E_1.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
	
	@FXML public void playF_1(){
		String musicFile = "sounds/F_1.wav";

		Media sound = new Media(new File(musicFile).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
	}
}
