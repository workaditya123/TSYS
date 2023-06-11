package pomfb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {

	
	@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	private WebElement emailOrPhoneNo;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;

	
	@FindBy(xpath="//button[@data-testid='royal_login_button']")
	private WebElement login;

	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login()
	{
		emailOrPhoneNo.sendKeys("adityawork555@gmail.com");
		password.sendKeys("999555auau22907808");
		login.click();
	}
	
}



//input[@placeholder='Email address or phone number']
//input[@placeholder='Password']
//button[@data-testid='royal_login_button']
