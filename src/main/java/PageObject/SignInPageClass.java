package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageClass {

	private WebDriver ldriver;

	@FindBy(xpath = "//*[text()='Hello. Sign in']")private WebElement SIGNIN;
	
	@FindBy(xpath = "//*[@id='ap_email']")private WebElement MOBILENUMBER;

	@FindBy(xpath = "//*[@class='a-button-input']")private WebElement CONTINUECLICK;

	@FindBy(xpath = "//*[@id='ap_password']")private WebElement PAAsWord;
	
	public SignInPageClass(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
	}
	
	public void ClickOnSignInMethod() {
		SIGNIN.click();
	}
	public void EnterUserName(String uname) {
		MOBILENUMBER.sendKeys(uname);
	}
	
	public void ContinueMethod() {
		CONTINUECLICK.click();
	}
    public void EnterPasswordMethod(String pwd) {
    	PAAsWord.sendKeys(pwd);
    }
	/*
	 * public void SignInMethod() { SIGNIN.click();
	 * MOBILENUMBER.sendKeys("8208118436"); CONTINUECLICK.click();
	 * PAAsWord.sendKeys("40904090");; }
	 */
}
