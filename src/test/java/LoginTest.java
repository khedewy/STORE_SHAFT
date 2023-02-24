import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.LoginPage;
import pages.SignInPage;

public class LoginTest extends TestBase {
	HomePage home;
	SignInPage sign;
	LoginPage log;
	SHAFT.TestData.JSON signData;

	@Test
	public void navigateToSignIn() {
		home = new HomePage(driver);
		home.navigateToSignIN();
	}

	@Test(priority = 1)
	public void enterUserData() {

		signData = new JSON("signData.json");
		sign = new SignInPage(driver);
		sign.enterUserData(signData.getTestData("userName"), signData.getTestData("password"));
	}

	@Test(priority = 2)
	public void navigateToLogin() {
		home = new HomePage(driver);
		home.navigateToLogin();
	}

	@Test(priority = 3)
    public void EnterLoginData()   {
		signData = new JSON("signData.json");
        log = new LoginPage(driver);
		log.enterLoginData(signData.getTestData("userName"), signData.getTestData("password"));
        driver.assertThat().element(log.getAssertionLocator()).text().contains("Welcome MahmoudKhedewy000022").perform();;
    
    }

}
