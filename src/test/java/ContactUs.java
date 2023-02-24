import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUs extends TestBase {
	HomePage home;
	ContactUsPage contact;
	SHAFT.TestData.JSON contactUsData;

	@Test
	public void navigateToContactUsPage() {
		home = new HomePage(driver);
		home.navigateToContactUsPage();
	}

	@Test(priority = 1)
	public void contactUs() {
		contactUsData = new JSON("contactUsData.json");
		contact = new ContactUsPage(driver);
		contact.SendMessage(contactUsData.getTestData("email"),contactUsData.getTestData("name"),contactUsData.getTestData("message"));
	}

}
