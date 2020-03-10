package Reporting;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class ExtendReport extends TestListenerAdapter {
	
	

	public void OnStart(ITestContext textContext) {
		
		String timestamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "Test-Report-"+timestamp+".html";
		
		
		
	}
	
}
