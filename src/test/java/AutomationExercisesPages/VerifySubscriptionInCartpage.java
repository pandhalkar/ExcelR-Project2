package AutomationExercisesPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BaseConfig;

public class VerifySubscriptionInCartpage extends BaseConfig {
	WebDriver driver;

	public void VerifySubscriptionInCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;
	
	@FindBy(xpath = "//a[normalize-space()='Cart']")
	WebElement cart;
	
	@FindBy(xpath = "//div[@class='single-widget']/h2")
	WebElement subscriptionTitle;

	@FindBy(xpath = "//input[@id='susbscribe_email']")
	WebElement subscriptionEmail;
	
	@FindBy(xpath = "//button[@id='subscribe']")
	WebElement subscribeBtn;
	
	@FindBy(xpath = "//div[@class='alert-success alert']")
	WebElement successfulltSubscribed;
	

	public void VerifySubscriptionInCartPage() {
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		cart.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		Assert.assertTrue(subscriptionTitle.isDisplayed(), "Subscription title is not visible successfully");
		subscriptionEmail.sendKeys("abc.123@yopmail.com");
		subscribeBtn.click();
		Assert.assertTrue(successfulltSubscribed.isDisplayed(), "Successfully not subscribed");

		
	}

}
