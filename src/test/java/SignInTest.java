import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.SignInPage;

public class SignInTest extends TestBase{
	HomePage home;
	SignInPage sign;
	SHAFT.TestData.JSON signinData;
	
	@Test
	public void NavigateToSign() {
		home = new HomePage(driver);
		home.navigateToSignIN();
	}
	
	@Test(priority = 1)
	public void UserSignInSuccefully() {
		signinData = new JSON("signData.json");
		sign = new SignInPage(driver);
		sign.enterUserData(signinData.getTestData("userName"), signinData.getTestData("password"));
	}
 
}
