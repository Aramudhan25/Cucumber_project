package cucumber.CommonFunction;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class commonAction {
  public static WebDriver driver;
 public static Actions aa;
 public static Alert al;
  
  public void browserlaunch(String url) {
	  EdgeOptions options = new EdgeOptions();
	  options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
	  WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver(options);
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
  }
  public void browserClose() {
	  driver.quit();
  }

  	public void sendkeys(WebElement e,String value) {
  		e.sendKeys(value);
  	}
  	public void max() {
  		driver.manage().window().maximize();
  	}
  		public void window() {
  		 String parent = driver.getWindowHandle();
      	 Set<String> child = driver.getWindowHandles();
      	 for (String x:child) {
  			 if(!parent.equals(x)) {
  				 driver.switchTo().window(x);
  			 }}
  	}
  	public void parentframe() {
  		driver.switchTo().parentFrame();
  		
  	}
  	public void dframe() {
  		driver.switchTo().defaultContent();
  	}
  	public void mouseOver(WebElement ele) {
		aa =new Actions(driver);
		aa.moveToElement(ele).build().perform();
		
	}
	public void mouseOvers(WebElement e) {
		aa.doubleClick(e);
		
	}public void mouse(WebElement e) {
		aa.clickAndHold(e);
}
	public void mousecontext(WebElement e) {
		aa.contextClick();
	}
	public void mouseclick(WebElement e) {
		aa.click();
		
	}
	public void alert(WebElement e) {
		al.accept();
		
	}public void alertdis(WebElement e) {
		al.dismiss();
		
	}
	public void alertsend(String a) {
		al.sendKeys(a);
		
	}
	public void select(WebElement e,int i) {
		Select s =new Select(e);
		s.selectByIndex(i);
	}	
	public void fframe(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	public void javadown(WebElement el) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].scrollIntoView(true)", el)  ;         
	}
	public void javaup(WebElement e) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(false)", e)    ;       
	}	
	 public void Takess() throws IOException {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File f1 = ts.getScreenshotAs(OutputType.FILE);
		 File f = new File("C:\\Users\\aramudhan\\eclipse-workspace\\cucumber\\target\\s2.png");
		 FileUtils.copyFile(f1, f);
	 }
	
	
	 
	 public void javaexecutorclick( WebElement e) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", e)    ;       
	}	
	 public void javaexecutorsetvalue(WebElement e) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAtribute('value',null", e) ;       
	}	

 public void clicked(WebElement e) {
	 e.click();
 }
 public void normalsend(WebElement e1,String r) {
	 e1.sendKeys(r);
 }

}
