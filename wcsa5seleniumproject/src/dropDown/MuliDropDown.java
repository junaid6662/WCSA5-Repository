package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MuliDropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/DELL/Desktop/WCSA%20%205/web%20elements/Multiselect%20dropdown.html");
	WebElement multiDD = driver.findElement(By.id("menu"));
	Select sel = new Select(multiDD);
	//To select by using Index
	
	sel.selectByIndex(1);
	Thread.sleep(1000);
	//To select by using Visible Text
	sel.selectByVisibleText("Vadapaw");
	Thread.sleep(1000);
	//to select by using value
	sel.selectByValue("v4");
	Thread.sleep(1000);
	//Deselect by using index
	sel.deselectByIndex(1);
	Thread.sleep(1000);
	//deselect by using visibleText
	sel.deselectByVisibleText("Vadapaw");
	Thread.sleep(1000);
	//deselect by using value
	sel.deselectByValue("v4");
	Thread.sleep(1000);
	//select all options using For Loop
	for (int i = 0; i < 6; i++) {
		sel.selectByIndex(i);
		Thread.sleep(1000);
	}
	sel.deselectAll();

	///////operational methods 
	//isMultipleMethod
	boolean res = sel.isMultiple();
	System.out.println(res);
	System.out.println("**************************");
	//getOptions()
	List<WebElement> DDoptions = sel.getOptions();
	for (int i =DDoptions.size()-1 ; i >=0 ; i--) {
		String ops = DDoptions.get(i).getText();
		System.out.println(ops);
		Thread.sleep(1000);
	}
	System.out.println("**************************");
	for(WebElement op :DDoptions)
	{
		String text = op.getText();
		System.out.println(text);
		Thread.sleep(1000);
	}
	//Get First selected OptionMethod
sel.deselectAll();
for (int i = 2; i < 4; i++) {
	sel.selectByIndex(i);
	Thread.sleep(1000);
}
WebElement first = sel.getFirstSelectedOption();
System.out.println("First selected Option is : "+first.getText());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
