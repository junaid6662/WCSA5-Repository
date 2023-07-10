package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartContainsxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[contains(@title, 'Search for products, brands and more')]")).sendKeys("Hp Laptop" , Keys.ENTER);
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		if (title.equals("Hp Laptop- Buy Products Online at Best Price in India - All Categories | Flipkart.com") ) {
			System.out.println("HPLaptop displayed Sucessfully !!");
		}
		else {
			System.out.println("HPLaptop does not displayed Sucessfully !!");
		}
		Thread.sleep(4000);
		driver.close();
	
	}

}
