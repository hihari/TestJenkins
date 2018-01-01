package hcl.in;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement Signin;

	@FindBy(xpath = ".//*[@id='SubmitLogin']")
	WebElement Login;
	

	HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApp() {
		log.info("Clicking on Signin");
		Signin.click();
		log.info("Clicking on Login");
		Login.click();
		

	}

}