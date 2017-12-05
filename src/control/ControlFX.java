package control;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author pabli
 * @see MainFX
 * 
 *
 */
public class ControlFX {
	
	private Stage stage;

	@FXML
	public void loadNewScene(ActionEvent event) {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../vista/FreeSolo.fxml"));
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
		}
	}

	@FXML
	public void closeFreeSolo(ActionEvent event) {
		stage.close();
	}
}
