package AutomationExercisesPages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import javax.servlet.annotation.WebFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utils.BaseConfig;

public class PlaceOrder_RegisterBeforeCheckout extends BaseConfig{
	WebDriver driver;
	

public void PlaceOrder_RegisterBeforeCheckout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

@FindBy (xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
WebElement home;

@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
WebElement signup;

@FindBy(xpath = "//div[@class='modal-content']//a[@href='/view_cart']")
WebElement popupViewCart;

@FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
WebElement proceedToCheckoutBtn;

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

@FindBy(xpath = "//h2[contains(text(),'Address Details')]")
WebElement AddressDetails;

@FindBy(xpath = "//h2[contains(text(),'Review Your Order')]")
WebElement ReviewYourOrder;

@FindBy(xpath = "//textarea[@name='message']")
WebElement message;

@FindBy(xpath = "//a[@href='/payment']")
WebElement PlaceOrderBtn;

//Payment

@FindBy(xpath = "//input[@name='name_on_card']")
WebElement NameOnCard;

@FindBy(xpath = "//input[@name='card_number']")
WebElement CardNumber;

@FindBy(xpath = "//input[@name='cvc']")
WebElement CVC;

@FindBy(xpath = "//input[@name='expiry_month']")
WebElement expiryMonth;

@FindBy(xpath = "//input[@name='expiry_year']")
WebElement expirtYear;

@FindBy(xpath = "//button[@id='submit']")
WebElement payAndConfirmOrderBtn;

@FindBy(xpath = "//div[contains(text(),'Your order has been placed successfully!')]")
WebElement successfulOrder;

@FindBy(xpath = "//a[normalize-space()='Delete Account']")
WebElement deleteAccount;

//Account Delete

@FindBy(xpath = "//div[@class='col-sm-9 col-sm-offset-1']/h2")
WebElement accountedDeleted;




public void PlaceOrder_RegisterBeforeCheckout()
{
	Assert.assertTrue(home.isDisplayed(), "Home page is not visible successfully!");
	signup.click();
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

	List <WebElement>products=driver.findElements(By.xpath("//div[@class='col-sm-9 padding-right']//div[@class='col-sm-4']"));
	WebElement prod=products.stream().filter(p->p.findElement(By.xpath("//p")).getText().
			equalsIgnoreCase("Men Tshirt")).findFirst().orElse(null);
	prod.findElement(By.xpath("//div[@class='choose']")).click();
	popupViewCart.click();
	proceedToCheckoutBtn.click();
	Assert.assertTrue(AddressDetails.isDisplayed(), "Address Details Not Displyed");
	Assert.assertTrue(ReviewYourOrder.isDisplayed(), "Review Order Not Displyed");
	message.sendKeys("Sample Message here...");
	PlaceOrderBtn.click();
	NameOnCard.sendKeys("Visa");
	CardNumber.sendKeys("1234567898");
	CVC.sendKeys("311");
	expiryMonth.sendKeys("05");
	expirtYear.sendKeys("2027");
	payAndConfirmOrderBtn.click();
	assertTrue(successfulOrder.isDisplayed(), "Order not placed");
	deleteAccount.click();
	Assert.assertTrue(accountedDeleted.isDisplayed(), "Account is not deleted");
	continuebtn.click();
	}
}