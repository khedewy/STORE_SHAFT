package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HomePage {
	private SHAFT.GUI.WebDriver driver;

	public HomePage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private By signInButton = By.id("signin2");
	private By loginButton = By.id("login2");
	private By homeBtn = By.xpath("//a[@class='nav-link']");
	private By contactUsBtn = By.xpath("//a[text()='Contact']");

	public SignInPage navigateToSignIN() {
		driver.element().click(signInButton);
		return new SignInPage(driver);
	}

	public LoginPage navigateToLogin() {
		driver.element().click(loginButton);
		return new LoginPage(driver);
	}

	public void returnToHomePage() {
		driver.element().click(homeBtn);

	}

	public ContactUsPage navigateToContactUsPage() {
        driver.element().click(contactUsBtn);
		return new ContactUsPage(driver);
	}

}
