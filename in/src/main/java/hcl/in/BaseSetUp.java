package hcl.in;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import hcl.in.ExcelReader;

public class BaseSetUp  {


	public static final Logger log = Logger.getLogger(BaseSetUp.class.getName());
	public WebDriver driver;
	String url ="http://automationpractice.com/index.php";
	ExcelReader excel;
	
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/haribabuchidipothu/Downloads/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "glogs.txt");
		driver = new FirefoxDriver();
		launch_url(url);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

	public void launch_url(String url) {
		log.info("launching URL"+url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public String[][] getTestData(String sName) throws IOException{
		String path="/Users/haribabuchidipothu/Documents/Selenium/DataEng.xls";
		excel= new ExcelReader(path);
		String[][] tdata = excel.excelReader(sName);
		return tdata;
		
	}
	
	
	
	
	
}
