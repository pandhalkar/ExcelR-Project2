package AutomationExercisesPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utils.BaseConfig;

public class PlaceOrderLoginBeforeCheckout extends BaseConfig {

	@FindBy (xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

	@FindBy(xpath = "//a[@href='/login']")
	WebElement signupLoginBtn;
	
	@FindBy (xpath = "//input[@data-qa='login-email']")
	WebElement emailid;
	
	@FindBy (xpath = "//input[@data-qa='login-password']")
	WebElement password;
	
	@FindBy (xpath = "//button[@data-qa='login-button']")
	WebElement loginBtn;
	
	public void VerifyTestCasesPage()
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		signupLoginBtn.click();
		emailid.sendKeys("pandhalkar.leeta1@gmail.com");
		password.sendKeys("pandhalkar.leeta1@gmail.com");
		loginBtn.click();

		

		
	}
	
	
	
}
