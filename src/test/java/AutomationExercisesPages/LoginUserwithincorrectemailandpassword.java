package AutomationExercisesPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utils.BaseConfig;

public class LoginUserwithincorrectemailandpassword extends BaseConfig {

	@FindBy (xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement signup;
	
	@FindBy (xpath = "//div[@class='login-form']/h2")
	WebElement loginToYourAccount;
	
	@FindBy (xpath = "//input[@data-qa='login-email']")
	WebElement loginEmail;
	
	@FindBy (xpath = "//input[@data-qa='login-password']")
	WebElement loginPassword;
	
	@FindBy (xpath = "//button[@data-qa='login-button']")
	WebElement loginBtn;

	@FindBy(xpath = "//ul/li[10]")
	WebElement LoggedInUser;
	
	@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
	WebElement incorrect;
	
	public  void LoginUserwithCorrectEmailAndPassword()
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		signup.click();
		Assert.assertTrue(loginToYourAccount.isDisplayed(), "Login to your account is not visible");
		loginEmail.sendKeys("Rajput.leeta1@gmail.com");
		loginPassword.sendKeys("B1zmat1cs@");
		loginBtn.click();
		Assert.assertTrue(incorrect.isDisplayed(), "Your email or password is correct!");
				
	}
	
	
	
}
