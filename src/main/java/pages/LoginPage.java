package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class LoginPage {
	private SHAFT.GUI.WebDriver driver;

	public LoginPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By userNameTxt = By.id("loginusername");
	private final By passwordTxt = By.id("loginpassword");
	private final By loginBtn = By.xpath("//button[@onclick='logIn()']");
	private final By assertionMessage = By.xpath("//a[@class='nav-link' and @id='nameofuser']");

	public void enterLoginData(String name, String password) {
		driver.element().type(userNameTxt, name);
		driver.element().type(passwordTxt, password);
		driver.element().click(loginBtn);
		
	}

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}
	
	public By getAssertionLocator() {
		return assertionMessage;
	}

}
