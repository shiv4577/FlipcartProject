package AllTestcases;

import org.testng.annotations.Test;

import PageObject.Baseclass;
import PageObject.LoginPageClass;

@Test
public class SearchItamTestCase extends Baseclass{

	public void SrachItamMethod() {
		
		LoginPageClass login = new LoginPageClass(driver);
		login.SearchitamMethod(Searchitam);;
		login.clickOnGoMethhod();
		login.ClickonSreachItamMethod();
	}
}
