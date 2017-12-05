package control;

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
	public void loadNewScene() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../vista/FreeSolo.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
		}
	}

	@FXML
	public void closeFreeSolo() {
		stage.close();
	}
}
