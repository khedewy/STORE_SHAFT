package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.AlertActions;

public class AddLaptopsToCart {
	private SHAFT.GUI.WebDriver driver;

	public AddLaptopsToCart(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By Laptops = By.xpath("//a[text()='Laptops']");
	private final By laptopsOption = By.linkText("MacBook air");
	private final By laptopsAssertion = By.xpath("//h2[text()='MacBook air']");
	private final By addToCartBtn = By.xpath("//a[text()='Add to cart']");
	private final By viewCartBtn = By.xpath("//a[text()='Cart']");
	private final By assertProductAdded = By.xpath("//h3[text()='700']");
	private final By TowProductAssertion = By.xpath("//h3[text()='1060']");

	public void navigateToAddLaptopToCart() {
		driver.element().click(Laptops);
		driver.element().click(laptopsOption);
	}

	public String assertionLaptopsMessage() {
		return driver.element().getText(laptopsAssertion);
	}
	
	public By getLaptopsAssertionLocator() {
		return laptopsAssertion;
		
	}

	public void addLaptopsToCart() {
		driver.element().click(addToCartBtn);
		AlertActions alert = driver.element().performAlertAction();
		alert.acceptAlert();
		driver.element().click(viewCartBtn);
	}

	public String getAssertionThatProductAdded() {
		return driver.element().getText(assertProductAdded);
	}
	
	public By getProductAddedAsssertionLocator() {
		return assertProductAdded;
	}

	public String towProductAssertion() {
		return driver.element().getText(TowProductAssertion);
	}
	
	public By getTowProductAddedAssertion() {
		return TowProductAssertion;
	}

}
