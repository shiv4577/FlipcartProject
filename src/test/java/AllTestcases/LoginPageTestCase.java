package AllTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AddToCartPage;
import PageObject.AddToWishListClass;
import PageObject.Baseclass;
import PageObject.LoginPageClass;
import PageObject.SignInPageClass;


@Test
public class LoginPageTestCase extends Baseclass {
	
	public void SIgnINPageTestCase() throws InterruptedException{
		
		 
		SignInPageClass Sign = new SignInPageClass(driver);
		Sign.ClickOnSignInMethod();
		Sign.EnterUserName(username);
		Sign.ContinueMethod();
		Thread.sleep(2000);
		Sign.EnterPasswordMethod(password);	
		
		
}
	
	
	}