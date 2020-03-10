package AllTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.AddToCartPage;
import PageObject.Baseclass;
@Test
public class AddToCartTestCase extends Baseclass {

	public void AddToCartTestCaseMethod() {
		
	
		AddToCartPage addtocart = new AddToCartPage(driver);
		addtocart.AmezoneADDTOCARTMethod();
		
	}
	
}
