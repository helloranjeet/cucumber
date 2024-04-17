package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Login_Elements {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='user-name']") public WebElement Username;
	@FindBy(xpath = "//input[@id='password']") public WebElement Password;
	@FindBy(xpath = "//input[@id='login-button']") public WebElement LoginButton;


	public Login_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
