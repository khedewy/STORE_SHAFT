import org.testng.annotations.Test;

import pages.AddMobilesToCart;

public class AddMobilesTest extends TestBase {
	AddMobilesToCart add;

	@Test
	public void navigateToAddToCART() {
		add = new AddMobilesToCart(driver);
		add.navigateToAddToCart();
		driver.assertThat().element(add.getSamsungAssertionLocator()).text().contains("Samsung galaxy s6").perform();
	}

	@Test(priority = 1)
	public void addToCART() {
		add = new AddMobilesToCart(driver);
		add.addProductToCart();
		driver.assertThat().element(add.getProductAddedAssertionLocator()).text().contains("360").perform();
		
	}

}
