package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which browser you want to open ");
		String browserValue = sc.next();
		if (browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();

		}
		
else if (browserValue.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();

		}
		/*
		System.out.println("Press 1 to open Chrome Browser\nPress 2 to open firefox browser");
int choice =sc.nextInt();
switch(choice)
{
	case 1:System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();break;
	case 2:System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver1=new FirefoxDriver();
	driver1.manage().window().maximize();
	Thread.sleep(3000);
	driver1.close();break;
	 
	}*/

	}

}
