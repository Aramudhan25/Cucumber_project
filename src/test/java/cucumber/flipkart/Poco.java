package cucumber.flipkart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.CommonFunction.commonAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.fliplocator.Fliplocators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Poco extends commonAction {
	//public static WebDriver driver;
	public static boolean presshold;
	//public static WebElement human;
	public static boolean pooco;
	public static WebElement po;
	public static boolean press;
	commonAction co = new commonAction();
Fliplocators fl = new Fliplocators();
	
	@Given("launch the url")
	public void launch_the_url() {
	 //  WebDriverManager.edgedriver().setup();
	  // driver = new EdgeDriver();
	  //  driver.get("https://www.flipkart.com");
	  //  driver.manage().window().maximize();
	   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  co.browserlaunch("https://www.flipkart.com");
		System.out.println("launch url from hook");
	}

	@And("user closes the login page")
	public void user_closes_the_login_page() {
		 
		// WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement user = fl.getUsername();  
		co.normalsend(user, "amudhan@gmail.com");
		//user.sendKeys("amudhan@gmail.com");
		  // WebElement req = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		   //req.click();
		WebElement otp = fl.getOtp();
		co.clicked(otp);
		   //co.clicked(req);
		   try {
		//WebElement hum = driver.findElement(By.xpath("//button[@class='_2KpZ6l _14EHzR _3dESVI']"));
		//presshold = hum.isDisplayed();
			  // WebElement verify = fl.getVerify();
			  // presshold = verify.isDisplayed();
			   WebElement humanverify = fl.getHumanverify();
				
				press = humanverify.isDisplayed();
			   
		   }
		   catch (Exception e) {
			  // WebElement humanverify = fl.getHumanverify();
				
				//press = humanverify.isDisplayed();
			   System.out.println(e.toString());
			   
		}
		 if(press==true) {
	 // driver.findElement(By.xpath("//button[text()='✕']")).click();
	  WebElement closex = fl.getClosex();
	  co.clicked(closex);
	}
		 else {
			System.out.println("verify button is displayed"+presshold);
		}
	}

	@When("user clicks on mobiles")
	public void user_clicks_on_mobiles() {
		//driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	   WebElement mobile = fl.getMobile();
	   co.clicked(mobile);
	}

	@Then("Poco should be displayed")
	public void poco_should_be_displayed() {
		try {
		
		 // po = driver.findElement(By.xpath("(//div[@class='_3879cV'])[2]"));
   WebElement pocodisplaycli = fl.getPocodisplaycli();
	     pooco = pocodisplaycli.isDisplayed();
	     System.out.println(pooco);
	     if (pooco=true) {
				//po.click();
				co.clicked(pocodisplaycli);
			}
	}
catch (Exception e) {
	System.out.println(e.toString());
}}
	@When("user clicks on poco")
	public void user_clicks_on_poco() {
		System.out.println("pococlick");
	
		//if (pooco=true) {
			//po.click();
			//co.clicked(human);
	//	}
	}

	@Then("Poco mobiles should be displayed")
	public void poco_mobiles_should_be_displayed() {
	    // WebElement window = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[21]"));
	    WebElement clickanypoco = fl.getClickanypoco();
		boolean er = clickanypoco.isDisplayed();
	     System.out.println(er);
	     if(er=true) {
	    	 co.clicked(clickanypoco);
	    	// window.click();
	     }
	    
	  // String parent = driver.getWindowHandle(); 
	   // Set<String> win1 = driver.getWindowHandles();
	   // for (String string1 : win1) {
	    //	if (!parent.equals(string1)) {
	    	
	     //driver.switchTo().window(string1);
	     co.window();
	    	//}
	  //  }
	    //WebElement clickwind = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	   // clickwind.click();
	     WebElement addcart = fl.getAddcart();
	    co.clicked(addcart);
	}


}
