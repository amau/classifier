
package me.classify;

import me.model.Context;
import me.util.Animal;
import me.util.Helper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassifyController implements Initializable
{
	@FXML
	public Tab liveTab;

	@FXML
	protected ListView<Animal> listView;

	@FXML
	protected ListView<Animal> animalsList;

	@FXML
	public ImageView imageContainer;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		System.out.println("On initialize Classify Controler.");
		Context.getInstance().setAnimals(animalsList.getItems());
		Context.getInstance().setFiles(listView.getItems());

		Helper.setCellFactory(listView);

		Helper.setCellFactory(animalsList);

		setChangeListener(listView);

		setChangeListener(animalsList);

	}


	@FXML
	protected void addAnimal(ActionEvent event)
	{
		int i = listView.getSelectionModel().getSelectedIndex();
		if (!(i < 0))
		{
			animalsList.getItems().add(listView.getItems().remove(i));
		}

	}


	@FXML
	protected void removeAnimal(ActionEvent event)
	{
		int i = animalsList.getSelectionModel().getSelectedIndex();
		if (!(i < 0))
		{
			listView.getItems().add(animalsList.getItems().remove(i));
		}
	}


	protected void setChangeListener(ListView<Animal> list)
	{
		list.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<Animal>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends Animal> observable,
							Animal oldValue, Animal newValue)
					{

						if (newValue != null)
						{
							Image image = new Image("file:"
									+ newValue.getFile()
											.getAbsolutePath());

							imageContainer.setImage(image);
						}

					}
				});

	}

}
