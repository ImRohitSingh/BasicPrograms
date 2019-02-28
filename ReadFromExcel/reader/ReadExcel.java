package reader;

import java.io.IOException;
import java.io.File;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.Sheet;
import jxl.Cell;
import jxl.CellType;

public class ReadExcel 
{
	private String inputFilePath;

	public void setInputFileLocation(String inputFilePath) 
	{
		this.inputFilePath = inputFilePath;
	}

	public void startReading() throws IOException, BiffException 
	{
		File inputWorkbook = new File(inputFilePath);
		
		Workbook workbook;
		workbook = Workbook.getWorkbook(inputWorkbook);

		Sheet sheet = workbook.getSheet(0); // '0' points to the first Excel sheet
		
		for (int i = 0; i < sheet.getRows(); ++i) 
		{
			for (int j = 0; j < sheet.getColumns(); ++j) 
			{
				Cell cell = sheet.getCell(j, i);
				CellType type = cell.getType();
				if( type == CellType.LABEL) // to maintain indentation at console
					// modify according to the Excel file you are working on
					System.out.print("\t"+cell.getContents()+"\t\t\t");
				if( type == CellType.NUMBER)
					System.out.print(" "+cell.getContents());
			}
			System.out.println();
		}
	}

}
