package cucumber.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.CommonFunction.commonAction;
import net.bytebuddy.asm.Advice.This;


public class FbLocatorsStore extends commonAction{
	 
	public FbLocatorsStore() {
		PageFactory.initElements(driver, this);
		
	}
		
	


}

