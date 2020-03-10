package CongicPropertyPakage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.yaml.snakeyaml.introspector.Property;

public class ReadPropertyFile {

	Properties prop;
	
	public  ReadPropertyFile() {
		File file = new File("C:\\Users\\ASUS\\Desktop\\teat\\FlipcartProject\\Configartion\\Config.property");
		
		try {
		FileInputStream IP= new FileInputStream(file);
		prop= new Properties();
		prop.load(IP);
	}
		catch(Exception e) {
			System.out.println("exception is "+e.getMessage());
		}
}
	
	
	public String GetApplicationUrl() {
		String url=prop.getProperty("BaseUrl");
		return url;
	}
	public String GetUsername() {
		String Username=prop.getProperty("username");
		return Username;
	}
	public String GetpPassword() {
		String Password=prop.getProperty("password");
		return Password;
	
	}
	public String GetSearchItam() {
		String SearchItam=prop.getProperty("Searchitam");
		return SearchItam;
	
	}
}