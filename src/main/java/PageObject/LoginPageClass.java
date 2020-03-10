package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {

	private WebDriver ldriver;

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement SEARCHITAM;
	@FindBy(xpath = "//*[@value='Go']")
	private WebElement GO;

	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[3]/div/span/div/div/span/a/div/img")
	private WebElement CLICKONSEARCHITAM;

	public LoginPageClass(WebDriver rdriver) {

		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	/*
	 * public void AmezoneLoginMethod1() {
	 * 
	 * SEARCHITAM.sendKeys("Bike"); GO.click(); CLICKONBIKE.click();
	 * 
	 * }
	 */
 
	public void SearchitamMethod(String Searchitam ) {
		SEARCHITAM.sendKeys(Searchitam);
	}
	
	public void clickOnGoMethhod() {
		GO.click();
	}
	
	public void ClickonSreachItamMethod() {
		CLICKONSEARCHITAM.click();
	}
}
