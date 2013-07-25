
package me.data;

import me.model.Context;
import me.util.Animal;
import me.util.Helper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DataController implements Initializable
{
	@FXML
	public Tab liveTab;

	@FXML
	protected ListView<Animal> animalsList;

	@FXML
	public ImageView imageContainer;

	@FXML
	public SplitPane splitPane;

	@FXML
	protected TextField fileName;

	@FXML
	protected TextField scientificName;

	@FXML
	protected TextField sex;

	@FXML
	protected TextField latitude;

	@FXML
	protected TextField longitude;

	@FXML
	protected TextField elevationInMeters;

	@FXML
	protected TextField weather;

	@FXML
	protected TextField vegetation;

	@FXML
	protected TextField county;

	@FXML
	protected TextField state;

	@FXML
	protected TextField country;

	@FXML
	protected TextField date;

	@FXML
	protected TextField timeCollected;

	@FXML
	protected TextField collector;

	@FXML
	protected TextField collectorNumber;

	@FXML
	protected TextField catalogNumber;

	@FXML
	protected TextField identifiedBy;

	@FXML
	protected TextField filmOrDigitalCamera;

	@FXML
	protected TextField project;

	@FXML
	protected TextField projectManager;

	@FXML
	protected TextField finantialSupport;

	@FXML
	protected TextField laboratoryManager;

	@FXML
	protected TextField digitalCardWork;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		System.out.println("On initialize Data Controler.");
		Helper.setCellFactory(animalsList);
		setChangeListener(animalsList);
		
		fileName.setEditable(false);
		
		scientificName.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setScientificName(newValue);
						}
					}
				});
		sex.textProperty().addListener(new ChangeListener<String>()
		{
			@Override
			public void changed(
					ObservableValue< ? extends String> observable,
					String oldValue, String newValue)
			{
				Animal animal = animalsList.getSelectionModel()
						.getSelectedItem();
				if (animalsList.getSelectionModel().getSelectedItem() != null)
				{
					animal.setSex(newValue);
				}
			}
		});
		latitude.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setLatitude(newValue);
						}
					}
				});
		longitude.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setLongitude(newValue);
						}
					}
				});
		elevationInMeters.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setElevationInMeters(newValue);
						}
					}
				});
		weather.textProperty().addListener(new ChangeListener<String>()
		{
			@Override
			public void changed(
					ObservableValue< ? extends String> observable,
					String oldValue, String newValue)
			{
				Animal animal = animalsList.getSelectionModel()
						.getSelectedItem();
				if (animalsList.getSelectionModel().getSelectedItem() != null)
				{
					animal.setWeather(newValue);
				}
			}
		});
		vegetation.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setVegetation(newValue);
						}
					}
				});
		county.textProperty().addListener(new ChangeListener<String>()
		{
			@Override
			public void changed(
					ObservableValue< ? extends String> observable,
					String oldValue, String newValue)
			{
				Animal animal = animalsList.getSelectionModel()
						.getSelectedItem();
				if (animalsList.getSelectionModel().getSelectedItem() != null)
				{
					animal.setCounty(newValue);
				}
			}
		});
		state.textProperty().addListener(new ChangeListener<String>()
		{
			@Override
			public void changed(
					ObservableValue< ? extends String> observable,
					String oldValue, String newValue)
			{
				Animal animal = animalsList.getSelectionModel()
						.getSelectedItem();
				if (animalsList.getSelectionModel().getSelectedItem() != null)
				{
					animal.setState(newValue);
				}
			}
		});
		country.textProperty().addListener(new ChangeListener<String>()
		{
			@Override
			public void changed(
					ObservableValue< ? extends String> observable,
					String oldValue, String newValue)
			{
				Animal animal = animalsList.getSelectionModel()
						.getSelectedItem();
				if (animalsList.getSelectionModel().getSelectedItem() != null)
				{
					animal.setCountry(newValue);
				}
			}
		});
		date.textProperty().addListener(new ChangeListener<String>()
		{
			@Override
			public void changed(
					ObservableValue< ? extends String> observable,
					String oldValue, String newValue)
			{
				Animal animal = animalsList.getSelectionModel()
						.getSelectedItem();
				if (animalsList.getSelectionModel().getSelectedItem() != null)
				{
					animal.setDate(newValue);
				}
			}
		});
		timeCollected.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setTimeCollected(newValue);
						}
					}
				});
		collector.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setCollector(newValue);
						}
					}
				});
		collectorNumber.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setCollectorNumber(newValue);
						}
					}
				});
		catalogNumber.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setCatalogNumber(newValue);
						}
					}
				});
		identifiedBy.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setIdentifiedBy(newValue);
						}
					}
				});
		filmOrDigitalCamera.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setFilmOrDigitalCamera(newValue);
						}
					}
				});
		project.textProperty().addListener(new ChangeListener<String>()
		{
			@Override
			public void changed(
					ObservableValue< ? extends String> observable,
					String oldValue, String newValue)
			{
				Animal animal = animalsList.getSelectionModel()
						.getSelectedItem();
				if (animalsList.getSelectionModel().getSelectedItem() != null)
				{
					animal.setProject(newValue);
				}
			}
		});
		projectManager.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setProjectManager(newValue);
						}
					}
				});
		finantialSupport.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setFinantialSupport(newValue);
						}
					}
				});
		laboratoryManager.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setLaboratoryManager(newValue);
						}
					}
				});
		digitalCardWork.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{
						Animal animal = animalsList.getSelectionModel()
								.getSelectedItem();
						if (animalsList.getSelectionModel()
								.getSelectedItem() != null)
						{
							animal.setDigitalCardWork(newValue);
						}
					}
				});

		liveTab.tabPaneProperty().addListener(
				new ChangeListener<TabPane>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends TabPane> ov,
							TabPane t, TabPane tabPane)
					{
						tabPane.getSelectionModel()
								.selectedItemProperty()
								.addListener(new ChangeListener<Tab>()
								{
									@Override
									public void changed(
											ObservableValue< ? extends Tab> ov,
											Tab oldTab, Tab newTab)
									{
										if ("Fill Data".equals(newTab
												.getText()))
										{
											// LIVE TAB SELECTED
											animalsList.getItems()
													.clear();
											animalsList
													.getItems()
													.addAll(Context
															.getInstance()
															.getAnimals());
										}
									}
								});
					}
				});

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

							fileName.setText(newValue.getFileName());
							scientificName.setText(newValue
									.getScientificName());
							sex.setText(newValue.getSex());
							latitude.setText(newValue.getLatitude());
							longitude.setText(newValue.getLongitude());
							elevationInMeters.setText(newValue
									.getElevationInMeters());
							weather.setText(newValue.getWeather());
							vegetation.setText(newValue.getVegetation());
							county.setText(newValue.getCounty());
							state.setText(newValue.getState());
							country.setText(newValue.getCountry());
							date.setText(newValue.getDate());
							timeCollected.setText(newValue
									.getTimeCollected());
							collector.setText(newValue.getCollector());
							collectorNumber.setText(newValue
									.getCollectorNumber());
							catalogNumber.setText(newValue
									.getCatalogNumber());
							identifiedBy.setText(newValue
									.getIdentifiedBy());
							filmOrDigitalCamera.setText(newValue
									.getFilmOrDigitalCamera());
							project.setText(newValue.getProject());
							projectManager.setText(newValue
									.getProjectManager());
							finantialSupport.setText(newValue
									.getFinantialSupport());
							laboratoryManager.setText(newValue
									.getLaboratoryManager());
							digitalCardWork.setText(newValue
									.getDigitalCardWork());
						}

					}
				});

	}


	public void addChangeListener(final TextField textField)
	{
		textField.textProperty().addListener(
				new ChangeListener<String>()
				{
					@Override
					public void changed(
							ObservableValue< ? extends String> observable,
							String oldValue, String newValue)
					{

						System.out
								.println("TextField Text Changed (newValue: "
										+ newValue + ")\n");
						System.out.println("Id: " + textField.getId());

						System.out.println("Selected animal: "
								+ animalsList.getSelectionModel()
										.getSelectedItem());
					}
				});
	}
}