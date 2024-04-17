package steps;
import actions.Login_Actions;
import actions.Common_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class Login_steps {
	Common_Actions common_actions;
	Login_Actions login_actions;

	public Login_steps(Common_Actions common_actions, Login_Actions login_actions) {
		this.common_actions = common_actions;
		this.login_actions = login_actions;
	}

	@Given("I am on SauceDemo login Page")
	public void i_am_on_SauceDemo_login_Page() {
		common_actions.goToUrl("https://www.saucedemo.com/");
	}

	@When("I enter username")
	public void i_enter_username() {
	    login_actions.enterUsername();
	}
	@When("I enter password")
	public void i_enter_password() {
		login_actions.enterPassword();
	}

	@When("I Click on the login button")
	public void i_Click_on_the_login_button() {
		login_actions.clickLogin();
	}
}