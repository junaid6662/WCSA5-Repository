package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLauchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative Path of driver exetuable file
		System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
		//Upcast in to WebDriver(I)
		WebDriver driver =new  ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Provide the delay of 2 sec
		Thread.sleep(2000);//stop exe for 2sec
		//To close browser
		driver.close();
		

	}
	

}
