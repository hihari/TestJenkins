package hcl.in;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test001 extends BaseSetUp {
	public static final Logger log = Logger.getLogger(Test001.class.getName());
	HomePage homepage;

	@BeforeTest
	public void init() {
		setup();
	}

	@Test
	public void hpNavigation() {
		log.info("Starting Test001");
		homepage = new HomePage(driver);
		homepage.loginToApp();
	}
	
	@AfterTest
	public void browserClose(){
		driver.close();
		
	}
	
	
}
