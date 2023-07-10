package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prac5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("http://desktop-ualjqae/login.do");
	Thread.sleep(1500);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(1500);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(1500);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1500);
	WebElement targetTask = driver.findElement(By.xpath("//div[.='Tasks']"));
	Actions act = new Actions(driver);
	act.doubleClick(targetTask).perform();
	driver.findElement(By.xpath("//a[.='Projects & Customers']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Abcd");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
	System.out.println("Customer created successfully !!!!");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
	Thread.sleep(1500);
	WebElement dd1 = driver.findElement(By.xpath("//select[@name='customerId']"));
	Select sel=new Select(dd1);
	sel.selectByVisibleText("Abcd");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Audi");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
	System.out.println("Project created successfully !!!!");
	//click on user 
	driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	Thread.sleep(1500);
	//manager username
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manabc");
	Thread.sleep(1500);
	//manager password
	driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("manager");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("manager");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Manager");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Abc");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='workdayDurationStr']")).clear();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='workdayDurationStr']")).sendKeys("9:00");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("overtimeTrackingLevel_ReadOnly")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("releaseDateId")).sendKeys("Jun 20, 2024");
	Thread.sleep(1500);
	//Permission for manager
	driver.findElement(By.xpath("//input[@name='rightGranted[12]']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='rightGranted[1]']")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("right2")).click();
//	Thread.sleep(1500);
//	driver.findElement(By.id("right13")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='rightGranted[5]']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='rightGranted[7]']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();

	System.out.println("Manager Account created!!!!!");
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	//Login as manager
	driver.findElement(By.name("username")).sendKeys("manabc");
	Thread.sleep(1500);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(1500);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1500);
	//create a Task by manager
	driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
	Thread.sleep(1500);
	WebElement dd2cust = driver.findElement(By.xpath("//select[@name='customerId']"));
	Select sel2=new Select(dd2cust);
	Thread.sleep(1500);
	sel2.selectByVisibleText("Abcd");
	WebElement dd2proj = driver.findElement(By.xpath("//select[@name='projectId']"));
	Thread.sleep(1500);
	Select sel3=new Select(dd2proj);
	sel3.selectByVisibleText("Audi");
	Thread.sleep(1500);
    driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys("Write functional test case");
    Thread.sleep(1500);
    WebElement dd3 = driver.findElement(By.xpath("//select[@name='task[0].billingType']"));
	Select sel4 = new Select(dd3);
	sel4.selectByVisibleText("Billable");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='task[0].markedToBeAddedToUserTasks']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
	Thread.sleep(1000);
	//////////////problem occuring
	WebElement target4 = driver.findElement(By.xpath("//div[@class='label' and (text()='Users')]"));
	act.doubleClick(target4).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testabc");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("manager");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("manager");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("TestEngg");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("abc");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='workdayDurationStr']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='workdayDurationStr']")).sendKeys("9:00");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
	
	Thread.sleep(1500);
	driver.findElement(By.id("overtimeTrackingLevel_ReadOnly")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("releaseDateId")).sendKeys("Jun 20, 2024");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	Thread.sleep(1500);
	//Assign task to testengg
	driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=1692528820'])[4]")).click();
	Thread.sleep(1500);
	WebElement dd4 = driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']"));
	Select seldd4 = new Select(dd4);
	seldd4.selectByVisibleText("abc, TestEngg (testabc)");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[text()='Insert existing tasks']")).click();
	Thread.sleep(4000);
	//////////////////////Problem Here
	  driver.findElement(By.id("cpSelector.cpButton.contentsContainer")).click();
	 // act.doubleClick(dd5).perform();
//	  driver.findElement(By.id("allActiveCustomersProjectsRadio")).click();
//	  Thread.sleep(1500);
	  driver.findElement(By.id("cpSelector.cpPopup.cpListbox_item_0")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.id("closeButton")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@name='selected_11']")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@value='Insert Selected Tasks to the Enter Time-Track Page']")).click();
	 
	//cpSelector.cpPopup.cpListbox_item_0
	
}
}
