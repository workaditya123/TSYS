package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomfb.LoginOrSignUpPage;

public class TestClass1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Velocity\\Silenium\\New path\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS );
	driver.get("https://www.facebook.com/");
	LoginOrSignUpPage loginOrSignUpPage =new LoginOrSignUpPage (driver);
	loginOrSignUpPage .login();
}
}
