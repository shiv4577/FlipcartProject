package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishListClass {

private WebDriver driver;
	
	@FindBy(xpath="//*[@class='sc-product-image']")private WebElement CLICKONBIKENAME;
	
	@FindBy(xpath="//a[@id='wishListMainButton-announce']")private WebElement CLICKONADDTOWISHLIST;
	@FindBy(xpath="//input[@id='ap_email']")private WebElement MOBILENOFORWISHLIST;
	@FindBy(xpath="//input[@id='continue']")private WebElement CONTINUEWISHLIST;
	@FindBy(xpath="//*[@id='ap_password']")private WebElement PASSWORDWISHLIST;
	@FindBy(xpath="//*[@id='signInSubmit']")private WebElement CONTINEWISHLIST;
	@FindBy(xpath="//*[@name='isPrivate'][@value='Y']")private WebElement RADIOBUTTON;
	@FindBy(xpath="//input[@type='image']")private WebElement CREATEWISHLIST;
	
public AddToWishListClass(WebDriver driver){
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void AddToWishListMethod(){
	
	
	CLICKONBIKENAME.click();
	CLICKONADDTOWISHLIST.click();
	MOBILENOFORWISHLIST.sendKeys("8208118436");
	CONTINUEWISHLIST.click();
	PASSWORDWISHLIST.sendKeys("40904090");
	CONTINEWISHLIST.click();
	RADIOBUTTON.click();
	CREATEWISHLIST.click();
}

}
