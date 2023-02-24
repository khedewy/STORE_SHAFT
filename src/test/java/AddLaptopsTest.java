import org.testng.annotations.Test;

import pages.AddLaptopsToCart;

public class AddLaptopsTest extends TestBase {
	AddLaptopsToCart add;

	@Test
	public void navigateAddLaptopsToCART() {
		add = new AddLaptopsToCart(driver);
		add.navigateToAddLaptopToCart();
		driver.assertThat().element(add.getLaptopsAssertionLocator()).text().contains("MacBook air").perform();;
	}

	@Test(priority = 1)
	public void addLaptopsToCart() {
		add = new AddLaptopsToCart(driver);
		add.addLaptopsToCart();
		driver.assertThat().element(add.getProductAddedAsssertionLocator()).text().contains("700").perform();;
		
	}

}
