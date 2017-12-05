package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainFX extends Application {
	private Stage stage;

	@Override
	public void start(Stage primaryStage) {
		this.stage = primaryStage;
		loadMainWindow();

	}

	public static void main(String[] args) {
		launch(args);
	}

	public void loadMainWindow() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("../vista/Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../vista/assets/styles/styles.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
