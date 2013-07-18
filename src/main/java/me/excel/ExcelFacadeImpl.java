//
// Tom Sawyer Software
// Copyright 2007 - 2013
// All rights reserved.
//
// www.tomsawyer.com
//

package me.excel;

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
	protected ExcelFacade instance;
	
	public ExcelFacade getInstance()
	{
		if(instance == null)
		{
			instance = new ExcelFacadeImpl();
		}
		return instance;
	}
	
	
	
	
	public static void main(String args[]) throws IOException, WriteException
	{
		WritableWorkbook workbook = Workbook.createWorkbook(new File("output.xls"));
		WritableSheet sheet = workbook.createSheet("First Sheet", 0);
		
		WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 10);
		WritableCellFormat arial10format = new WritableCellFormat (arial10font); 
		// Create the label, specifying content and format 
		Label label2 = new Label(1,0, "Arial 10 point label", arial10format); 
		sheet.addCell(label2);
		
		Label label3 = new Label(2, 0, "Another Arial 10 point label", arial10format); 
		sheet.addCell(label3);
		
		workbook.write(); 
		workbook.close();
	}
}
