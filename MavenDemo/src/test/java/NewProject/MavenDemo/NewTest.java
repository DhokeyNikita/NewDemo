package NewProject.MavenDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	//Logger log = Logger.getLogger("FirstMavenDemo");

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before method");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil\\git\\NewDemo\\MavenDemo\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//log.info("Opening browser...");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		//log.info("Closing the browser...");
	}

@Test
	public void loginFB() throws InterruptedException
	{
		driver.get("https://www.youtube.com");
		//log.info("Opening Youtube page...");
		System.out.println("Opening Youtube page...");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//div[@id='search-input']//input"));
		email.sendKeys("jenkins pipeline tutorial");
	//	log.info("Search... ");
		System.out.println("Search... ");
		Thread.sleep(2000);

		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']"
				+ "//li/descendant::div[@class='sbqs_c']")); 

		for(WebElement element:ele)
		{
			String str = element.getText();
			if(str.equals("jenkins pipeline tutorial"))
			//	log.info("Click on.... " +str);
			System.out.println("Click on  "+str);
			Thread.sleep(3000);
			element.click();
			Thread.sleep(3000);
			break;
			
		}
		
		WebElement newLink = driver.findElement(By.xpath("//h3[@id='video-title']"));
		
		if(newLink.isDisplayed())
		{
			Thread.sleep(2000);
			newLink.click();
			String str1 = newLink.getText();
			System.out.println(str1+" Opening... ");
			Thread.sleep(2000);
		}
		
	}
	
}
