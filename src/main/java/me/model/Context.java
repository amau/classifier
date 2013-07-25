//
// Tom Sawyer Software
// Copyright 2007 - 2013
// All rights reserved.
//
// www.tomsawyer.com
//

package me.model;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import me.util.Animal;
import javafx.collections.ObservableList;

public class Context
{
	protected ObservableList<Animal> animals;

	protected ObservableList<Animal> files;

	protected static Context instance;

	protected static Animal base;


	protected Context()
	{

	}


	public void addAnimal(Animal animal)
	{
		animals.add(animal);
	}


	public void addFile(Animal file)
	{
		files.add(file);
	}


	public void setAnimals(ObservableList<Animal> animals)
	{
		this.animals = animals;
	}


	public void setFiles(ObservableList<Animal> files)
	{
		this.files = files;
	}


	public static Context getInstance()
	{
		if (instance == null)
		{
			instance = new Context();
		}
		return instance;
	}


	public ObservableList<Animal> getAnimals()
	{
		return animals;
	}


	public static Animal getBaseAnimal()
	{
		if (base == null)
		{
			base = new Animal();
		}
		return base;
	}


	public void addDirectory(File file)
	{
		Animal animal;

		File[] filteredFiles = file.listFiles(new FileFilter()
		{
			public boolean accept(File fileName)
			{
				return fileName.getName().matches(".*\\.jpe?g$")
						|| fileName.getName().matches(".*\\.gif$")
						|| fileName.getName().matches(".*\\.tiff$")
						|| fileName.getName().matches(".*\\.png$");
			}
		});

		for (int i = 0; i < filteredFiles.length; i++)
		{
			animal = new Animal(Context.getBaseAnimal(),filteredFiles[i]);
			files.add(animal);
		}
	}


	public void loadProperties(File file) throws FileNotFoundException,
			IOException
	{
		Properties properties = new Properties();

		properties.load(new FileReader(file));

		if (properties.getProperty("scientificName") != null)
		{
			Context.getBaseAnimal().setScientificName(
					properties.getProperty("scientificName"));
		}
		else
		{
			Context.getBaseAnimal().setScientificName("");
		}
		if (properties.getProperty("sex") != null)
		{
			Context.getBaseAnimal().setSex(
					properties.getProperty("sex"));
		}
		else
		{
			Context.getBaseAnimal().setSex("");
		}
		if (properties.getProperty("latitude") != null)
		{
			Context.getBaseAnimal().setLatitude(
					properties.getProperty("latitude"));
		}
		else
		{
			Context.getBaseAnimal().setLatitude("");
		}
		if (properties.getProperty("longitude") != null)
		{
			Context.getBaseAnimal().setLongitude(
					properties.getProperty("longitude"));
		}
		else
		{
			Context.getBaseAnimal().setLongitude("");
		}
		if (properties.getProperty("elevationInMeters") != null)
		{
			Context.getBaseAnimal().setElevationInMeters(
					properties.getProperty("elevationInMeters"));
		}
		else
		{
			Context.getBaseAnimal().setElevationInMeters("");
		}
		if (properties.getProperty("weather") != null)
		{
			Context.getBaseAnimal().setWeather(
					properties.getProperty("weather"));
		}
		else
		{
			Context.getBaseAnimal().setWeather("");
		}
		if (properties.getProperty("vegetation") != null)
		{
			Context.getBaseAnimal().setVegetation(
					properties.getProperty("vegetation"));
		}
		else
		{
			Context.getBaseAnimal().setVegetation("");
		}
		if (properties.getProperty("county") != null)
		{
			Context.getBaseAnimal().setCounty(
					properties.getProperty("county"));
		}
		else
		{
			Context.getBaseAnimal().setCounty("");
		}
		if (properties.getProperty("state") != null)
		{
			Context.getBaseAnimal().setState(
					properties.getProperty("state"));
		}
		else
		{
			Context.getBaseAnimal().setState("");
		}
		if (properties.getProperty("country") != null)
		{
			Context.getBaseAnimal().setCountry(
					properties.getProperty("country"));
		}
		else
		{
			Context.getBaseAnimal().setCountry("");
		}
		if (properties.getProperty("date") != null)
		{
			Context.getBaseAnimal().setDate(
					properties.getProperty("date"));
		}
		else
		{
			Context.getBaseAnimal().setDate("");
		}
		if (properties.getProperty("timeCollected") != null)
		{
			Context.getBaseAnimal().setTimeCollected(
					properties.getProperty("timeCollected"));
		}
		else
		{
			Context.getBaseAnimal().setTimeCollected("");
		}
		if (properties.getProperty("collector") != null)
		{
			Context.getBaseAnimal().setCollector(
					properties.getProperty("collector"));
		}
		else
		{
			Context.getBaseAnimal().setCollector("");
		}
		if (properties.getProperty("collectorNumber") != null)
		{
			Context.getBaseAnimal().setCollectorNumber(
					properties.getProperty("collectorNumber"));
		}
		else
		{
			Context.getBaseAnimal().setCollectorNumber("");
		}
		if (properties.getProperty("catalogNumber") != null)
		{
			Context.getBaseAnimal().setCatalogNumber(
					properties.getProperty("catalogNumber"));
		}
		else
		{
			Context.getBaseAnimal().setCatalogNumber("");
		}
		if (properties.getProperty("identifiedBy") != null)
		{
			Context.getBaseAnimal().setIdentifiedBy(
					properties.getProperty("identifiedBy"));
		}
		else
		{
			Context.getBaseAnimal().setIdentifiedBy("");
		}
		if (properties.getProperty("filmOrDigitalCamera") != null)
		{
			Context.getBaseAnimal().setFilmOrDigitalCamera(
					properties.getProperty("filmOrDigitalCamera"));
		}
		else
		{
			Context.getBaseAnimal().setFilmOrDigitalCamera("");
		}
		if (properties.getProperty("project") != null)
		{
			Context.getBaseAnimal().setProject(
					properties.getProperty("project"));
		}
		else
		{
			Context.getBaseAnimal().setProject("");
		}
		if (properties.getProperty("projectManager") != null)
		{
			Context.getBaseAnimal().setProjectManager(
					properties.getProperty("projectManager"));
		}
		else
		{
			Context.getBaseAnimal().setProjectManager("");
		}
		if (properties.getProperty("finantialSupport") != null)
		{
			Context.getBaseAnimal().setFinantialSupport(
					properties.getProperty("finantialSupport"));
		}
		else
		{
			Context.getBaseAnimal().setFinantialSupport("");
		}
		if (properties.getProperty("laboratoryManager") != null)
		{
			Context.getBaseAnimal().setLaboratoryManager(
					properties.getProperty("laboratoryManager"));
		}
		else
		{
			Context.getBaseAnimal().setLaboratoryManager("");
		}
		if (properties.getProperty("digitalCardWork") != null)
		{
			Context.getBaseAnimal().setDigitalCardWork(
					properties.getProperty("digitalCardWork"));
		}
		else
		{
			Context.getBaseAnimal().setDigitalCardWork("");
		}
	}
}
