package AutomationExercisesPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.servlet.annotation.WebFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utils.BaseConfig;

public class PlaceOrder_RegisterWhileCheckout extends BaseConfig{
	WebDriver driver;
	

public void PlaceOrder_RegisterWhileCheckout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

@FindBy (xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
WebElement home;

@FindBy(xpath = "//div[@class='modal-content']//a[@href='/view_cart']")
WebElement popupViewCart;

@FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
WebElement shoppingcartpage;

@FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
WebElement proceedToCheckout;

@FindBy(xpath = "//p//a[@href='/login']")
WebElement registerOrLogin;

//New User Signup!

@FindBy (xpath = "//div[@class='signup-form']")
WebElement NewUserSignup;

@FindBy(xpath = "//input[@placeholder='Name']")
WebElement userName;

@FindBy(xpath = "//input[@data-qa='signup-email']")
WebElement emailAddress;

@FindBy (xpath = "//button[@data-qa='signup-button']")
WebElement signUp;

//ENTER ACCOUNT INFORMATION

@FindBy (xpath = "//div[@class='col-sm-4 col-sm-offset-1']//h2/b[contains(text(),'Enter Account Information')]")
WebElement enterAccountInformation;

@FindBy (xpath = "//input[@value='Mrs']")
WebElement title;

@FindBy (xpath = "//input[@id='name']")
WebElement enterAccountName;

@FindBy(xpath = "//input[@id='email']")
WebElement enterAccountEmail;

@FindBy(xpath = "//input[@id='password']")
WebElement enterAccountPassword;

@FindBy(xpath = "//select[@id='days']")
WebElement daysDropdown;

@FindBy (xpath = "//select[@id='months']")
WebElement monthsDropdown;

@FindBy(xpath = "//select[@id='years']")
WebElement yearsDropdown;

@FindBy(xpath = "//input[@id='newsletter']")
WebElement Newsletter;

@FindBy(xpath = "//input[@id='optin']")
WebElement specialOffer;

//ADDRESS INFORMATION

@FindBy(xpath = "//input[@id='first_name']")
WebElement addressFirstName;

@FindBy (xpath = "//input[@id='last_name']")
WebElement addressLastName;

@FindBy(xpath = "//input[@id='company']")
WebElement addressCompany;

@FindBy (xpath = "//input[@id='address1']")
WebElement addressLine1;

@FindBy (xpath = "//input[@id='address2']")
WebElement addressLine2;

@FindBy (xpath = "//select[@id='country']")
WebElement adressCountry;

@FindBy(xpath = "//input[@id='state']")
WebElement addressState;

@FindBy(xpath = "//input[@id='city']")
WebElement addressCity;

@FindBy(xpath = "//input[@id='zipcode']")
WebElement addressZipCode;

@FindBy(xpath = "//input[@id='mobile_number']")
WebElement addressMobileNumber;

@FindBy (xpath = "//button[contains(text(),'Create Account')]")
WebElement createAccountBtn;

//Account Created

@FindBy (xpath = "//div[@class='col-sm-9 col-sm-offset-1']/h2")
WebElement accountCreated;

@FindBy(xpath = "//a[@data-qa='continue-button']")
WebElement continuebtn;

@FindBy(xpath = "//ul/li[10]")
WebElement LoggedInUser;

@FindBy(xpath = "//a[normalize-space()='Delete Account']")
WebElement deleteAccount;

//Account Delete

@FindBy(xpath = "//div[@class='col-sm-9 col-sm-offset-1']/h2")
WebElement accountedDeleted;


public void PlaceOrder_RegisterWhileCheckout()
{
//	FileInputStream ipfile=FileInputStream("C:\\Users\\lru3825\\eclipse-workspace\\Automation_Exercise\\src\\main\\java\\Utils\\config.properties");
//	Properties prop=new Properties();
//	prop.load(ipfile);	
	
	Assert.assertTrue(home.isDisplayed(), "Home page is not visible successfully!");
	
	List <WebElement>products=driver.findElements(By.xpath("//div[@class='col-sm-9 padding-right']//div[@class='col-sm-4']"));
	WebElement prod=products.stream().filter(p->p.findElement(By.xpath("//p")).getText().
			equalsIgnoreCase("Men Tshirt")).findFirst().orElse(null);
	prod.findElement(By.xpath("//div[@class='choose']")).click();
	popupViewCart.click();
	proceedToCheckout.click();
	registerOrLogin.click();	
	
	Assert.assertTrue(NewUserSignup.isDisplayed(), "New User is not Signup!");
	
	
	
	userName.sendKeys("Lalita");
	emailAddress.sendKeys("pandhalkar.leeta1@gmail.com");
	signUp.click();
	Assert.assertTrue(enterAccountInformation.isDisplayed(), "Enter Account Information title not displayed");
	title.click();
	Assert.assertEquals(userName, enterAccountName,"Username are not the same");
	Assert.assertEquals(emailAddress, enterAccountEmail,"Email address not matched");
	enterAccountPassword.sendKeys("B1zmat1cs@");
	 
	Select daysSelect=new Select(daysDropdown);
	daysSelect.selectByIndex(5);
	daysSelect.getFirstSelectedOption().click();
	
	Select monthSelect=new Select(monthsDropdown);
	monthSelect.selectByIndex(5);
	monthSelect.getFirstSelectedOption().click();
	
	Select yearSelect=new Select(yearsDropdown);
	yearSelect.selectByIndex(5);
	yearSelect.getFirstSelectedOption().click();
	
	Newsletter.click();
	specialOffer.click();
	
	addressFirstName.sendKeys("Address First Name");
	addressLastName.sendKeys("Address Last Name");
	addressCompany.sendKeys("Bizmatics India");
	addressLine1.sendKeys("Address Line 1");
	addressLine2.sendKeys("Address Line 2");
	
	Select country=new Select(adressCountry);
	country.selectByValue("India");
	country.getFirstSelectedOption().click();
	addressState.sendKeys("Maharashtra");
	addressCity.sendKeys("Nagpur");
	addressZipCode.sendKeys("440030");
	addressMobileNumber.sendKeys("9595771145");
	createAccountBtn.click();
	Assert.assertTrue(accountCreated.isDisplayed(), "Account is not Created");
	continuebtn.click();
	Assert.assertTrue(LoggedInUser.isDisplayed(), "Loggin in user is not displayed");
	deleteAccount.click();
	Assert.assertTrue(accountedDeleted.isDisplayed(), "Account is not deleted");
	continuebtn.click();
	
	
	

}























































































}
