package frameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import dataDrivenFramework.Flib;

public class WriteByUsingFlibMethods {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	Flib flib = new Flib();
	for (int i = 10; i < 20; i++) {
		flib.writeExcelData("./Data/TestData.xlsx","IPL",i, 0,"Jade");
	}
	
	
}
}
