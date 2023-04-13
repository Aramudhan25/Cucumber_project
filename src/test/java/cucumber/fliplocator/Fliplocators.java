package cucumber.fliplocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.CommonFunction.commonAction;

public class Fliplocators extends commonAction {
      
	public Fliplocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement otp;
	@FindBy(xpath="//p[text()='Please verify you are a human']")
	private WebElement humanverify;
	@FindBy(xpath="//button[text()='✕']")
	private WebElement closex;
	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobile;
	@FindBy(xpath="(//div[@class='_3879cV'])[2]")
	private WebElement pocodisplaycli;
	@FindBy(xpath="(//div[@class='_4rR01T'])[21]")
	private WebElement clickanypoco;
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addcart;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getOtp() {
		return otp;
	}
	public WebElement getHumanverify() {
		return humanverify;
	}
	public WebElement getClosex() {
		return closex;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getPocodisplaycli() {
		return pocodisplaycli;
	}
	public WebElement getClickanypoco() {
		return clickanypoco;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	
}
