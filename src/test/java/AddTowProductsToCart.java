import org.testng.annotations.Test;

import pages.AddLaptopsToCart;
import pages.AddMobilesToCart;
import pages.HomePage;

public class AddTowProductsToCart extends TestBase {
	AddLaptopsToCart add;
	AddMobilesToCart addMobile;
	HomePage home;

	@Test()
	public void navigateToAddToCART() {
		addMobile = new AddMobilesToCart(driver);
		addMobile.navigateToAddToCart();
		driver.assertThat().element(addMobile.getSamsungAssertionLocator()).text().contains("Samsung galaxy s6")
				.perform();
	}

	@Test(priority = 1)
	public void addToCART() {
		addMobile = new AddMobilesToCart(driver);
		addMobile.addProductToCart();
		driver.assertThat().element(addMobile.getProductAddedAssertionLocator()).text().contains("360").perform();

	}

	@Test(priority = 2)
	public void navigateBackToHomePage() {
		home = new HomePage(driver);
		home.returnToHomePage();
	}

	@Test(priority = 3)
	public void navigateAddLaptopsToCART() {
		add = new AddLaptopsToCart(driver);
		add.navigateToAddLaptopToCart();
		driver.assertThat().element(add.getLaptopsAssertionLocator()).text().contains("MacBook air").perform();
		;
	}

	@Test(priority = 4)
	public void addLaptopsToCart() {
		add = new AddLaptopsToCart(driver);
		add.addLaptopsToCart();
		driver.assertThat().element(add.getTowProductAddedAssertion()).text().contains("1060").perform();

	}

}
