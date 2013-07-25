
package me.util;

import java.io.File;

public class Animal implements Cloneable
{
	protected String fileName;

	protected String scientificName;

	protected String sex;

	protected String latitude;

	protected String longitude;

	protected String elevationInMeters;

	protected String weather;

	protected String vegetation;

	protected String county;

	protected String state;

	protected String country;

	protected String date;

	protected String timeCollected;

	protected String collector;

	protected String collectorNumber;

	protected String catalogNumber;

	protected String identifiedBy;

	protected String filmOrDigitalCamera;

	protected String project;

	protected String projectManager;

	protected String finantialSupport;

	protected String laboratoryManager;

	protected String digitalCardWork;

	protected File file;
	
	public Animal()
	{
		this.file = null;
		this.fileName = "";
		this.scientificName = "";
		this.sex = "";
		this.latitude = "";
		this.longitude = "";
		this.elevationInMeters = "";
		this.weather = "";
		this.vegetation = "";
		this.county = "";
		this.state = "";
		this.country = "";
		this.date = "";
		this.timeCollected = "";
		this.collector = "";
		this.collectorNumber = "";
		this.catalogNumber = "";
		this.identifiedBy = "";
		this.filmOrDigitalCamera = "";
		this.project = "";
		this.projectManager = "";
		this.finantialSupport = "";
		this.laboratoryManager = "";
		this.digitalCardWork = "";
	}


	public Animal(File file)
	{
		this.file = file;
		this.fileName = file.getName();
		this.scientificName = "";
		this.sex = "";
		this.latitude = "";
		this.longitude = "";
		this.elevationInMeters = "";
		this.weather = "";
		this.vegetation = "";
		this.county = "";
		this.state = "";
		this.country = "";
		this.date = "";
		this.timeCollected = "";
		this.collector = "";
		this.collectorNumber = "";
		this.catalogNumber = "";
		this.identifiedBy = "";
		this.filmOrDigitalCamera = "";
		this.project = "";
		this.projectManager = "";
		this.finantialSupport = "";
		this.laboratoryManager = "";
		this.digitalCardWork = "";
	}
	
	public Animal(Animal animal, File file)
	{
		this.file = file;
		this.fileName = file.getName();
		this.scientificName = animal.getScientificName();
		this.sex = animal.getSex();
		this.latitude = animal.getLatitude();
		this.longitude = animal.getLongitude();
		this.elevationInMeters = animal.getElevationInMeters();
		this.weather = animal.getWeather();
		this.vegetation = animal.getVegetation();
		this.county = animal.getCounty();
		this.state = animal.getState();
		this.country = animal.getCountry();
		this.date = animal.getDate();
		this.timeCollected = animal.getTimeCollected();
		this.collector = animal.getCollector();
		this.collectorNumber = animal.getCollectorNumber();
		this.catalogNumber = animal.getCatalogNumber();
		this.identifiedBy = animal.getIdentifiedBy();
		this.filmOrDigitalCamera = animal.getFilmOrDigitalCamera();
		this.project = animal.getProject();
		this.projectManager = animal.getProjectManager();
		this.finantialSupport = animal.getFinantialSupport();
		this.laboratoryManager = animal.getLaboratoryManager();
		this.digitalCardWork = animal.getDigitalCardWork();
	}


	public String getFileName()
	{
		return fileName;
	}


	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}


	public String getScientificName()
	{
		return scientificName;
	}


	public void setScientificName(String scientificName)
	{
		this.scientificName = scientificName;
	}


	public String getSex()
	{
		return sex;
	}


	public void setSex(String sex)
	{
		this.sex = sex;
	}


	public String getLatitude()
	{
		return latitude;
	}


	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}


	public String getLongitude()
	{
		return longitude;
	}


	public void setLongitude(String longitude)
	{
		this.longitude = longitude;
	}


	public String getElevationInMeters()
	{
		return elevationInMeters;
	}


	public void setElevationInMeters(String elevationInMeters)
	{
		this.elevationInMeters = elevationInMeters;
	}


	public String getWeather()
	{
		return weather;
	}


	public void setWeather(String weather)
	{
		this.weather = weather;
	}


	public String getVegetation()
	{
		return vegetation;
	}


	public void setVegetation(String vegetation)
	{
		this.vegetation = vegetation;
	}


	public String getCounty()
	{
		return county;
	}


	public void setCounty(String county)
	{
		this.county = county;
	}


	public String getState()
	{
		return state;
	}


	public void setState(String state)
	{
		this.state = state;
	}


	public String getCountry()
	{
		return country;
	}


	public void setCountry(String country)
	{
		this.country = country;
	}


	public String getDate()
	{
		return date;
	}


	public void setDate(String date)
	{
		this.date = date;
	}


	public String getTimeCollected()
	{
		return timeCollected;
	}


	public void setTimeCollected(String timeCollected)
	{
		this.timeCollected = timeCollected;
	}


	public String getCollector()
	{
		return collector;
	}


	public void setCollector(String collector)
	{
		this.collector = collector;
	}


	public String getCollectorNumber()
	{
		return collectorNumber;
	}


	public void setCollectorNumber(String collectorNumber)
	{
		this.collectorNumber = collectorNumber;
	}


	public String getCatalogNumber()
	{
		return catalogNumber;
	}


	public void setCatalogNumber(String catalogNumber)
	{
		this.catalogNumber = catalogNumber;
	}


	public String getIdentifiedBy()
	{
		return identifiedBy;
	}


	public void setIdentifiedBy(String identifiedBy)
	{
		this.identifiedBy = identifiedBy;
	}


	public String getFilmOrDigitalCamera()
	{
		return filmOrDigitalCamera;
	}


	public void setFilmOrDigitalCamera(String filmOrDigitalCamera)
	{
		this.filmOrDigitalCamera = filmOrDigitalCamera;
	}


	public String getProject()
	{
		return project;
	}


	public void setProject(String project)
	{
		this.project = project;
	}


	public String getProjectManager()
	{
		return projectManager;
	}


	public void setProjectManager(String projectManager)
	{
		this.projectManager = projectManager;
	}


	public String getFinantialSupport()
	{
		return finantialSupport;
	}


	public File getFile()
	{
		return file;
	}


	public void setFinantialSupport(String finantialSupport)
	{
		this.finantialSupport = finantialSupport;
	}


	public String getLaboratoryManager()
	{
		return laboratoryManager;
	}


	public void setLaboratoryManager(String laboratoryManager)
	{
		this.laboratoryManager = laboratoryManager;
	}


	public String getDigitalCardWork()
	{
		return digitalCardWork;
	}


	public void setDigitalCardWork(String digitalCardWork)
	{
		this.digitalCardWork = digitalCardWork;
	}


	public void setFile(File file)
	{
		this.file = file;

	}
}
