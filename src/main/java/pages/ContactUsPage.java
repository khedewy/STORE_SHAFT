package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.AlertActions;

public class ContactUsPage {
	private SHAFT.GUI.WebDriver driver;

	public ContactUsPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By emailTxt = By.id("recipient-email");
	private final By nameTXt = By.id("recipient-name");
	private final By messageTxt = By.id("message-text");
	private final By sendMessageBtn = By.xpath("//button[text()='Send message']");

	public void SendMessage(String email, String name, String message) {
		driver.element().type(emailTxt, email);
		driver.element().type(nameTXt, name);
		driver.element().type(messageTxt, message);
		driver.element().click(sendMessageBtn);
		AlertActions alert = driver.element().performAlertAction();
		alert.acceptAlert();
	}

}
