package practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prac1 {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of browser :");
		String browserName = sc.next();
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().minimize();
				Thread.sleep(3000);
				driver.close();
			}
		else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else {
			System.out.println("Invalid Input");
		}
	
	}

}
