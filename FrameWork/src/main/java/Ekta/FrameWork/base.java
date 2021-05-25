package Ekta.FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\vijet\\eclipse-workspace\\TestFramework\\src\\main\\java\\Ekta\\data.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName=="chrome") {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijet\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else if(browserName=="firefox") {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijet\\Downloads\\geckodriver-v0.29.1-win32\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browserName=="ie") {
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
		
	}
	
	
	
	
	
