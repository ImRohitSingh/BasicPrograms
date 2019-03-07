package reader;

import java.io.IOException;

import jxl.read.biff.BiffException;

public class DriverReader 
{
	public static void main(String args[]) throws IOException, BiffException 
	{
		ReadExcel excelReader = new ReadExcel();
		excelReader.setInputFileLocation("C:\\Users\\RS\\Documents\\BookDemo.xls");
		excelReader.startReading();
	}

}
