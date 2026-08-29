package UsingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchDataFromExcel {
	@Test
	public void fetchData() throws EncryptedDocumentException, IOException {
		//convert the physical file to java object
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData.xlsx");
		//fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);
		//fetch the sheet
		Sheet sh = wb.getSheet("data");
		//fetch the row
		Row r = sh.getRow(1);
		Row nr = sh.getRow(2);
		//fetch the cell
		Cell c = r.getCell(0);
		Cell nc = nr.getCell(1);
		//fetch the data
		String data = c.getStringCellValue();
		double num = nc.getNumericCellValue();
		System.out.println(nc.toString());
		System.out.println(data+" "+num);
		//close the excel
		wb.close();
		
	}
}
