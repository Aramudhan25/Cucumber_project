package cucumber.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import cucumber.CommonFunction.commonAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.locators.FbLocatorsStore;

public class facebook extends commonAction { 
	//public static WebDriver driver;
	commonAction co = new commonAction();
	FbLocatorsStore fbstore = new FbLocatorsStore();
	@Given("launch the url {string}")
	public void launch_the_url(String string) {
		// co.browserlaunch(string);
		
	   // WebDriverManager.edgedriver().setup();
	   //  driver = new EdgeDriver();
	    // driver.get(string);
	    // driver.manage().window().maximize();
	    // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Given("create account")
	public void create_account() {
		WebElement er = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		er.isDisplayed();
	
	    	}

	@Given("user clicks")
	public void user_clicks() {
	WebElement em = driver.findElement(By.id("email"));

		em.sendKeys("amudhan");
		
	}

	@When("user sends")
	public void user_sends() {
		WebElement em1 = driver.findElement(By.id("pass"));
		em1.sendKeys("amudhan123");
	    
	}

	@Given("User clicks on create account")
	public void user_clicks_on_create_account() {
	 WebElement cli = driver.findElement(By.xpath("//a[text()='Create new account']"));
	co.clicked(cli);
	 
		
	}

	@When("user enters the firstname with one dim map {string}")
	public void user_enters_the_firstname_with_one_dim_map(String string1) {
		driver.switchTo();
		WebElement create = driver.findElement(By.xpath("//input[@name='firstname']"));

		create.sendKeys(string1);
	    	}

	@When("user enters the surname with one dim map {string}")
	public void user_enters_the_surname_with_one_dim_map(String string2) {
		WebElement createsur1 = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		createsur1.sendKeys(string2);
	}

	@Then("user send email {string}")
	public void user_send_email(String string3) {
		WebElement emails = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	
		emails.sendKeys(string3);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement remail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		remail.sendKeys(string3);
		
	}

	@When("user send password {string}")
	public void user_send_password(String string4) {
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
       pass.sendKeys(string4);
		
	
	}

	@Then("user send dropdown")
	public void user_send_dropdown() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//select[@id='day']")).sendKeys("25");
	    driver.findElement(By.xpath("//select[@id='month']")).sendKeys("march");
	    driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
	}

	@When("user select gender")
	public void user_select_gender() {
	    driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	}

	@Then("user click sign up")
	public void user_click_sign_up() {
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
	    	}



}
