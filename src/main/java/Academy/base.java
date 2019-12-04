package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	
	public WebDriver initializeDRiver() throws IOException
	{
	Properties prop = new Properties();
	FileInputStream fis= new FileInputStream("/home/knoldus/workspaceNew/E2EProject/src/main/java/Academy/data.properties");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	if(browserName == "chrome")
	{
		System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Automation/chromedriver_linux64");
		driver = new ChromeDriver();
	}
	
	else if(browserName == "firefox")
	{
		driver = new FirefoxDriver();
	}
	else if(browserName=="IE")
	{
		//IE code
	}
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	return driver;
	}
	

}
