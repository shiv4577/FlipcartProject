package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import CongicPropertyPakage.ReadPropertyFile;

public class Baseclass {
	
	ReadPropertyFile readconfig = new ReadPropertyFile();
	public String BaseUrl= readconfig.GetApplicationUrl();
	public String username=readconfig.GetUsername();
	public String password =readconfig.GetpPassword();
	public String  Searchitam=readconfig.GetSearchItam();
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void Setup(String br) {
		
		if(br.equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jar\\chromedriver.exe\\");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "E:\\Selenium Jar\\chromedriver.exe\\");
			driver= new ChromeDriver();
		}
	}
	
	@AfterClass
	public void Teardown() {
		driver.quit();
	}
	
}
