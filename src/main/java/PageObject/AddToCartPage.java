package PageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	WebElement ADDTOCART;
	@FindBy(xpath = "//*[@id='hlb-view-cart-announce']")
	private WebElement CART;

	public AddToCartPage(WebDriver rdriver) {

		this.driver = rdriver;
	PageFactory.initElements(rdriver, this);
	}

	public void AmezoneADDTOCARTMethod() {
		String MainWindow = driver.getWindowHandle();
		// To handle the new open window
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		while (it.hasNext()) {
			String childwindowid = it.next();
			if (!MainWindow.equalsIgnoreCase(childwindowid)) {
				// Switching to Child window
				driver.switchTo().window(childwindowid);

				/*
				 * Select SelectQuantity = new Select(driver.findElement(By.id("quantity")));
				 * SelectQuantity.selectByIndex(1);
				 */

				ADDTOCART.click();
				CART.click();

			}

		}

		
	}

}
