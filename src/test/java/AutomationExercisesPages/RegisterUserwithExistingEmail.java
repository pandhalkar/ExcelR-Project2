package AutomationExercisesPages;

import javax.servlet.annotation.WebFilter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utils.BaseConfig;

public class RegisterUserwithExistingEmail extends BaseConfig{
	WebDriver driver;
	

@FindBy (xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
WebElement home;

@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
WebElement signup;

//New User Signup!

@FindBy (xpath = "//div[@class='signup-form']")
WebElement NewUserSignup;

@FindBy(xpath = "//input[@placeholder='Name']")
WebElement userName;

@FindBy(xpath = "//input[@data-qa='signup-email']")
WebElement emailAddress;

@FindBy (xpath = "//button[@data-qa='signup-button']")
WebElement signUp;

@FindBy (xpath = "//p[contains(text(),'Email Address already exist!')]")
WebElement existingUser;

public void registerUser()
{
	Assert.assertTrue(home.isDisplayed(), "Home page is not visible successfully!");
	signup.click();
	Assert.assertTrue(NewUserSignup.isDisplayed(), "New User is not Signup!");
	userName.sendKeys("Lalita");
	emailAddress.sendKeys("pandhalkar.leeta1@gmail.com");
	signUp.click();
	Assert.assertTrue(existingUser.isDisplayed(), "This is not the Existing User");
}


















































































}
