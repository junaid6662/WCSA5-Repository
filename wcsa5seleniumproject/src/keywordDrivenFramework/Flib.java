package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	
	public String readExcelData(String excellPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excellPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
	    String data = cell.getStringCellValue();
		return data;
		
	}
	
	public int getlastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//Provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//Make a file for ready to read
		Sheet sheet = wb.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum();
		return lastRow;
		
	}
	
	
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		 
		 FileOutputStream fos = new FileOutputStream(excelPath);
		 wb.write(fos);
		 
	}
	
	// It is used to fetch the data from property file
	
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		//Create a Object of properties class
		Properties prop = new Properties();
		//Make a file Ready to read
		prop.load(fis);
		//read the particular key from file
		String data = prop.getProperty(key);
		return data;
	
	}
	

}
