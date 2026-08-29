package UsingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDataToExcel {
	@Test
	public void writeData() throws EncryptedDocumentException, IOException {
		//convert the physical file to java object
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		//fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);
		//fetch the sheet
		Sheet sh = wb.getSheet("data");
		//fetch the row
		Row r = sh.getRow(2);
		//create the row
		Row nr = sh.createRow(9);
		
		//create the cell
		Cell c = r.createCell(2);
		Cell nc = nr.createCell(1);
		
		//write data to cell
		c.setCellValue("salaar");
		nc.setCellValue(20);
		
		//convert obj to physical file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		
		//close the excel
		wb.close();
		
	}
}
