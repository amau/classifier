//
// Tom Sawyer Software
// Copyright 2007 - 2013
// All rights reserved.
//
// www.tomsawyer.com
//

package me.excel;

import me.util.Animal;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.format.CellFormat;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelFacadeImpl implements ExcelFacade
{
	protected static ExcelFacade instance;
	
	public static ExcelFacade getInstance()
	{
		if(instance == null)
		{
			instance = new ExcelFacadeImpl();
		}
		return instance;
	}
	
	public void writeAnimal(Animal animal, int row) throws IOException, WriteException
	{
		WritableWorkbook workbook = Workbook.createWorkbook(new File("output.xls"));
		WritableSheet sheet = workbook.createSheet("First Sheet", 0);
		
		WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 10);
		WritableCellFormat arial10format = new WritableCellFormat (arial10font); 
		// Create the label, specifying content and format 
		sheet.addCell(new Label(0,row, animal.getFileName(), arial10format));
		sheet.addCell(new Label(1,row, animal.getScientificName(), arial10format));
		sheet.addCell(new Label(2,row, animal.getSex(), arial10format));
		sheet.addCell(new Label(3,row, animal.getLatitude()+"", arial10format));
		sheet.addCell(new Label(4,row, animal.getLongitude()+"", arial10format));
		sheet.addCell(new Label(5,row, animal.getElevationInMeters()+"", arial10format));
		sheet.addCell(new Label(6,row, animal.getWeather(), arial10format));
		sheet.addCell(new Label(7,row, animal.getVegetation(), arial10format));
		sheet.addCell(new Label(8,row, animal.getCountry(), arial10format));
		sheet.addCell(new Label(9,row, animal.getState(), arial10format));
		sheet.addCell(new Label(10,row, animal.getDate(), arial10format));
		sheet.addCell(new Label(11,row, animal.getTimeCollected(), arial10format));
		sheet.addCell(new Label(12,row, animal.getCollector(), arial10format));
		sheet.addCell(new Label(13,row, animal.getCollectorNumber(), arial10format));
		sheet.addCell(new Label(14,row, animal.getCatalogNumber(), arial10format));
		sheet.addCell(new Label(15,row, animal.getIdentifiedBy(), arial10format));
		sheet.addCell(new Label(16,row, animal.getFilmOrDigitalCamera(), arial10format));
		sheet.addCell(new Label(17,row, animal.getProject(), arial10format));
		sheet.addCell(new Label(18,row, animal.getProjectManager(), arial10format));
		sheet.addCell(new Label(19,row, animal.getFinantialSupport(), arial10format));
		sheet.addCell(new Label(20,row, animal.getLaboratoryManager(), arial10format));
		sheet.addCell(new Label(21,row, animal.getDigitalCardWork(), arial10format));
		
		workbook.write(); 
		workbook.close();
	}
	
	
	public static void main(String args[]) throws IOException, WriteException
	{
		Animal animal = new Animal();
		
		animal.setFileName("ZLM1214.tif");
		animal.setScientificName("Canis latrans");
		animal.setSex("ND");
		animal.setLatitude(17.92334);
		animal.setLongitude(-97.05452);
		animal.setElevationInMeters(776);
		animal.setWeather("BSo(h')w");
		animal.setVegetation("Selva Baja Caducifolia Secundaria");
		animal.setCounty("Santa María Tecomavaca");
		animal.setState("Oaxaca");
		animal.setCountry("México");
		animal.setDate("07/18/2012");
		animal.setTimeCollected("10:49");
		animal.setCollector("Comité de Vigilancia Ambiental de Santa Maria Tecomavaca, Francisco Botello");
		animal.setCollectorNumber("FB-12204");
		animal.setCatalogNumber("IBUNAM-CFB-14925");
		animal.setIdentifiedBy("Zalluly Lona");
		animal.setFilmOrDigitalCamera("Ltl Acorn 12 Megapixels");
		animal.setProject("Fortalecimiento de la red de monitoreo de fauna silvestre en la RBTC. Fase II: A-P- RBTC-12-33; Planeación de acciones de manejo a partir de monitoreo participativo de la RBTC: CS-09-I-DS-013-12.");
		animal.setProjectManager("Francisco Botello");
		animal.setFinantialSupport("Fondo Mexicano para la Conservación de la Naturaleza, A. C., Instituto Nacional de Desarrollo Social.");
		animal.setLaboratoryManager("Francisco Botello");
		animal.setDigitalCardWork("Zalluly Lona, Francisco Botello, Arturo Pérez");
		
		ExcelFacadeImpl.getInstance().writeAnimal(animal,1);
	}
}
