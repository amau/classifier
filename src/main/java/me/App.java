
package me;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Classifier");
		Pane myPane = (Pane) FXMLLoader.load(getClass().getResource(
				"Application.fxml"));
		Scene myScene = new Scene(myPane);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}


	public static void main(String[] args)
	{
		launch(args);
	}
}
