package frameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//read Data from IPL Sheet
	
	FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");//Provide the path of the file
	Workbook wb = WorkbookFactory.create(fis); //Make this File For Ready to read
	Sheet sheet = wb.getSheet("IPL");   //Get into the Sheet
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	String data = cell.getStringCellValue();
	System.out.println(data);
	
}
}
