package NewProject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFirst {

	public WebDriver driver;
	Logger log = Logger.getLogger("TestChrome");
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil\\git\\MavenDemo\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		log.info("Opening browser...");
		driver.manage().window().maximize();	
	}

	public void closeBrowser()
	{
		driver.quit();
		log.info("Closing the browser...");
	}
	
	///     MavenDemo\pom.xml
}
