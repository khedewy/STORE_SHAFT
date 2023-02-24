package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.AlertActions;

public class AddMobilesToCart {
	private SHAFT.GUI.WebDriver driver;

	public AddMobilesToCart(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By phonesBtn = By.xpath("//a[text()='Phones']");
	private final By samsungOption = By.linkText("Samsung galaxy s6");
	private final By samsungAssertionMessage = By.xpath("//h2[text()='Samsung galaxy s6']");
	private final By addToCartBtn = By.xpath("//a[text()='Add to cart']");
	private final By viewCartBtn = By.xpath("//a[text()='Cart']");
	private final By assertProductAdded = By.xpath("//h3[text()='360']");

	public void navigateToAddToCart() {
		driver.element().click(phonesBtn);
		driver.element().click(samsungOption);
	}

	public String getSamsungAssertionMessage() {
		return driver.element().getText(samsungAssertionMessage);
	}
	
	public By getSamsungAssertionLocator() {
		return samsungAssertionMessage;
	}

	public void addProductToCart() {
		driver.element().click(addToCartBtn);
		AlertActions alert = driver.element().performAlertAction();
		alert.acceptAlert();
		driver.element().click(viewCartBtn);
	}

	public String assertProductAdded() {
		return driver.element().getText(assertProductAdded);
	}
	
	public By getProductAddedAssertionLocator() {
		return assertProductAdded;
	}

}
