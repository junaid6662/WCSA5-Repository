package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
// To store generic reusable methods
	//all the methods are non static
	// it is used to fetch the data from excel file
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		
		return data;
		
	}
	
	//it is used to get last count of row where we store data
	
	public int getlastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//Provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//Make a file for ready to read
		Sheet sheet = wb.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum();
		return lastRow;
		
	}
	
	//It is used to write the data into Excel
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
	
	public void readPropertyData()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
