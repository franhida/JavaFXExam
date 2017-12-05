package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX extends Application{
	private Stage stage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.stage = primaryStage;
	}
	public void loadNewScene() {
		try {
		AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../vista/FreeSolo.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("../vista/assets/styles/styles.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		} catch (Exception e) {
	}
	}
}
