package actions;

import elements.HomePage_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.Common_Steps;

import java.util.List;

public class HomePage_actions {

	private WebDriver driver;
	HomePage_Elements homePage_elements;

	public HomePage_actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		homePage_elements = new HomePage_Elements(driver);
	}
	

	public void clickmenu() throws InterruptedException {
		//homePage_elements.Menu.wait(5000);
		Thread.sleep(5000);
		homePage_elements.Menu.click();
	}
	public void selectHighestPricedItem() {
		List<WebElement> productPrices = driver.findElements(By.className("inventory_item_price"));
		double highestPrice = 0;
		WebElement highestPricedItem = null;

		for (WebElement priceElement : productPrices) {
			String priceText = priceElement.getText().replace("$", "");
			System.out.println("Value of price*******"+priceText);
			double price = Double.parseDouble(priceText);

			if (price > highestPrice) {
				highestPrice = price;
			}
					}
		System.out.println("Value of Highest price*******"+highestPrice);
		// Value is hard coded for time being
		highestPricedItem = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));

			highestPricedItem.click();

	}
}
