package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
public static void main(String[] args) throws IOException {
	//read data from congig.properties file
	
     FileInputStream fis = new FileInputStream("./Data/config.properties");
     
     //Create a Object of properties class
     Properties prop = new Properties();
     //make a file ready to read
     prop.load(fis);
     //Read the particular property from the file
     String data = prop.getProperty("Username");
     System.out.println(data);
     
   
}
}
