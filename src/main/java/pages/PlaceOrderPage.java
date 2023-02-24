package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class PlaceOrderPage {
	private SHAFT.GUI.WebDriver driver;

	public PlaceOrderPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By placeOrderBtn = By.xpath("//button[text()='Place Order']");

	private final By nameTXt = By.id("name");
	private final By CountryTxt = By.id("country");
	private final By cityTxt = By.id("city");
	private final By creditNumber = By.id("card");
	private final By monthTxt = By.id("month");
	private final By yearTxt = By.id("year");
	private final By submitBtn = By.xpath("//button[text()='Purchase']");
	private final By assertionMessage = By.xpath("//h2[text()='Thank you for your purchase!']");
	private final By completeCheckout = By.xpath("//button[text()='OK']");

	public void clickPlaceOrder() {
		driver.element().click(placeOrderBtn);
	}

	public void placeOrder(String name, String country, String city, String credit, String month, String year) {
		driver.element().type(nameTXt, name);
		driver.element().type(CountryTxt, country);
		driver.element().type(cityTxt, city);
		driver.element().type(creditNumber, credit);
		driver.element().type(monthTxt, month);
		driver.element().type(yearTxt, year);
		driver.element().click(submitBtn);
	}

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}

	public By getAssertionMessageLocator() {
		return assertionMessage;
	}

	public void setCompleteCheckout() {
		driver.element().click(completeCheckout);
	}

}
