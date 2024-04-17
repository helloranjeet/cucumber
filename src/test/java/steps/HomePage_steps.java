package steps;

import actions.Common_Actions;
import actions.HomePage_actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage_steps {
	Common_Actions common_actions;
	HomePage_actions homePage_actions;

	public HomePage_steps(Common_Actions common_actions, HomePage_actions homePage_actions) {
		this.common_actions = common_actions;
		this.homePage_actions = homePage_actions;
	}

	@When("I should land to PLP page and click menu")
	public void i_should_land_to_plp_and_click_menu() throws InterruptedException {
		homePage_actions.clickmenu();
	}

	@When("I look for max priced value item")
	public void i_look_for_max_priced_value_item() throws InterruptedException {
	homePage_actions.selectHighestPricedItem();

	}
}