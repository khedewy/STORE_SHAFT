package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.AlertActions;

public class SignInPage {
	private SHAFT.GUI.WebDriver driver;
	public SignInPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}
	private final By userNameTxt = By.id("sign-username");
    private final By passwordTxt = By.id("sign-password");
    private final By signBtn = By.xpath("//button[@onclick='register()']");
    
    public void enterUserData(String  name, String password){
        driver.element().type(userNameTxt, name);
        driver.element().type(passwordTxt, password);
        driver.element().click(signBtn);
        AlertActions alert = driver.element().performAlertAction();
        alert.acceptAlert();
        
    }

}
