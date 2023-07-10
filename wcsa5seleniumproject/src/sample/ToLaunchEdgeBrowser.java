package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative Path of driver exetuable file
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
             WebDriver driver=new EdgeDriver();
             driver.manage().window().maximize();
             Thread.sleep(4000);
             driver.close();
            
	}

}
