package AutomationExercisesPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utils.BaseConfig;

public class LoginUserwithCorrectEmailAndPassword extends BaseConfig {

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
	
	@FindBy(xpath = "//a[normalize-space()='Delete Account']")
	WebElement deleteAccount;

	@FindBy(xpath = "//div[@class='col-sm-9 col-sm-offset-1']/h2")
	WebElement accountedDeleted;
	
	public  void LoginUserwithCorrectEmailAndPassword()
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		signup.click();
		Assert.assertTrue(loginToYourAccount.isDisplayed(), "Login to your account is not visible");
		loginEmail.sendKeys("pandhalkar.leeta1@gmail.com");
		loginPassword.sendKeys("B1zmat1cs@");
		loginBtn.click();
		Assert.assertTrue(LoggedInUser.isDisplayed(), "Logged in as username not displayed");
		deleteAccount.click();
		Assert.assertTrue(accountedDeleted.isDisplayed(), "ACCOUNT DELETED! is not visible");		
	}
	
	
	
}
