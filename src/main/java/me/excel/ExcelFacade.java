//
// Tom Sawyer Software
// Copyright 2007 - 2013
// All rights reserved.
//
// www.tomsawyer.com
//

package me.excel;

import java.io.IOException;

import jxl.write.WriteException;
import me.util.Animal;

public interface ExcelFacade
{

	void writeAnimal(Animal animal, int i) throws IOException, WriteException;

}
