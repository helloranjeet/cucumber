package actions;

import elements.Login_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Common_Steps;

import java.util.List;

public class Login_Actions {

	private WebDriver driver;
	Login_Elements login_elements;

	public Login_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		login_elements = new Login_Elements(driver);
	}
	
	public void enterUsername() {
		login_elements.Username.sendKeys("standard_user");
	}
	public void enterPassword() {
		login_elements.Password.sendKeys("secret_sauce");
	}

	public void clickLogin() {
		login_elements.LoginButton.click();
	}
}
