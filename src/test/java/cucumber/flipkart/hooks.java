package cucumber.flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.CommonFunction.commonAction;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends commonAction {
	 
	commonAction co = new commonAction();

	@Before
	public void blaunch(Scenario scenario) throws IOException {
		
		File f = new File("C:\\Users\\aramudhan\\eclipse-workspace\\cucumber\\src\\test\\resources\\credential.property");
		FileInputStream f1 = new FileInputStream(f);
		Properties p = new Properties();
		p.load(f1);
		String propertyurl = p.getProperty("url");
		String property = p.getProperty("username");
		System.out.println(property);
		String property2 = p.getProperty("password");
		System.out.println(property2);
		co.browserlaunch(propertyurl);
		p.setProperty("pass", "amu");
		FileOutputStream f2 = new FileOutputStream(f);
		p.store(f2, "updating");
	final byte[] ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(ss, "image1/png");
	
		
		 
		
	}
 @After
	public void bclose(Scenario scenario) {
		final byte[] ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(ss, "image1/png");
			
	co.browserClose();
		
			
 }	
	}

	
