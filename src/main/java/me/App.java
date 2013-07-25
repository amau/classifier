
package me;

import me.excel.ExcelFacade;
import me.excel.ExcelFacadeImpl;
import me.model.Context;
import me.util.Animal;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.write.WriteException;

public class App extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		try
		{
			File file = new File("");
			Context.getInstance().loadProperties(
					new File(file.getAbsolutePath(),
							"target/classes/me/photo.properties"));
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		primaryStage.setTitle("Example");
		Pane myPane = (Pane) FXMLLoader.load(getClass().getResource(
				"Application.fxml"));
		Scene myScene = new Scene(myPane);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}


	/**
	 * This method handles the event for the #chooseDirectory menu item.
	 * It lets the user choose a directory which will be scanned for
	 * image files. It will then will populate the file list in the
	 * classify panel.
	 * 
	 * @param event
	 */
	@FXML
	protected void chooseDirectory(ActionEvent event)
	{
		DirectoryChooser chooser = new DirectoryChooser();
		chooser.setTitle("Choose a directory to work with");
		File file = chooser.showDialog(null);

		if (file != null)
		{
			Context.getInstance().addDirectory(file);
		}
	}


	/**
	 * This method gets called when the user selects #chooseProperties
	 * menu item. It loads a file that contains the default values to
	 * use when creating an <code>Animal</code>. The file must follow
	 * properties files standard, key=value pairs.
	 * 
	 * @param event
	 */
	@FXML
	protected void chooseProperties(ActionEvent event)
	{

		FileChooser chooser = new FileChooser();
		chooser.setTitle("Choose a directory to work with");
		File file = chooser.showOpenDialog(null);

		if (file != null)
		{
			try
			{
				Context.getInstance().loadProperties(file);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}


	/**
	 * This method is called when the menu item #saveExcel is called. It
	 * writes the information of the animals in the <code>Context</code>
	 * object into an excel file.
	 */
	@FXML
	protected void saveExcel(ActionEvent event)
	{
		ExcelFacade excel = new ExcelFacadeImpl(new File("classifier-"
				+ System.currentTimeMillis() + ".xls"));
		int i = 1;
		try
		{
			for (Animal animal : Context.getInstance().getAnimals())
			{
				excel.writeAnimal(animal, i);
				i++;
			}
			excel.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (WriteException e)
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args)
	{
		launch(args);
	}
}
