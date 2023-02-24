import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.AddLaptopsToCart;
import pages.PlaceOrderPage;

public class PlaceOrderTest extends TestBase {
	
	AddLaptopsToCart add;
	PlaceOrderPage orderPage;
	SHAFT.TestData.JSON placeOrderData;

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
	
	@Test(priority = 2)
	public void navigateToCompleteCheckout() {
		orderPage = new PlaceOrderPage(driver);
		orderPage.clickPlaceOrder();
	}
	
	@Test(priority = 3)
	public void CompleteProceed() {
		placeOrderData = new JSON("placeOrderData.json");
		orderPage = new PlaceOrderPage(driver);
		orderPage.placeOrder(placeOrderData.getTestData("name"), placeOrderData.getTestData("country"),
				placeOrderData.getTestData("city"), placeOrderData.getTestData("credit"),
				placeOrderData.getTestData("month"), placeOrderData.getTestData("year"));
		
		driver.assertThat().element(orderPage.getAssertionMessageLocator()).text().contains("Thank you for your purchase!").perform();
		orderPage.setCompleteCheckout();
	}

}
