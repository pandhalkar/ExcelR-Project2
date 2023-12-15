package AutomationExercisesPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.BaseConfig;

public class ContactUsForm extends BaseConfig {
	
	WebDriver driver;
	

public void contactUsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	WebElement ContactUs;
	
	@FindBy (xpath = "//div[@class='contact-form']/h2")
	WebElement GetInTouchTitle;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement contactUsName;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement contactUsEmail;
	
	@FindBy(xpath = "//input[@placeholder='Subject']")
	WebElement contactUsSubject;
	
	@FindBy(xpath = "//input[@name='upload_file']")
	WebElement contactUsUploadFile;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement contactUsSubmitBtn;
	
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement contactUsMSGBody;
	
	@FindBy(xpath = "//div[@class='status alert alert-success']")
	WebElement contactUsSuccess;
	
	@FindBy(xpath = "//div[@id='form-section']")
	WebElement contactUsHomeBtn;
	
	public void contactUsForm()
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		ContactUs.click();
		Assert.assertTrue(GetInTouchTitle.isDisplayed(), "Not landed on Contact Us page!");
		contactUsName.sendKeys("pandhalkar.leeta1@gmail.com");
		contactUsEmail.sendKeys("B1zmat1cs@");
		contactUsSubject.sendKeys("Verify Contact us Subject");
		contactUsMSGBody.sendKeys("Type here msg content..");
		contactUsUploadFile.sendKeys("C:\\Users\\lru3825\\Desktop\\suggestion.txt");
		contactUsSubmitBtn.click();
		Alert alert=driver.switchTo().alert();
		String alertMsg=driver.switchTo().alert().getText();
		System.out.println(alertMsg);		
		alert.accept();
		Assert.assertTrue(contactUsSuccess.isDisplayed(), "Your details haven't submitted successfully.");
		contactUsHomeBtn.click();
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");

	}
	
	
	
}
