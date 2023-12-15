package AutomationExercisesPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BaseConfig;

public class VerifyProductQuantityInCart extends BaseConfig {
	WebDriver driver;

	public void VerifyProductQuantityInCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

	@FindBy(xpath = "//div[@class='choose']")
	WebElement viewProduct;
	
	@FindBy (xpath = "//input[@id='quantity']")
	WebElement productQuantity;
	
	@FindBy (xpath = "//button[@class='btn btn-default cart']")
	WebElement productViewAddToCartBtn;

	@FindBy(xpath = "//div[@class='modal-body']//a[@href='/view_cart']")
	WebElement popupViewCart;

	@FindBy(xpath = "//div[@class='breadcrumbs']//li[contains(text(),'Shopping Cart')]")
	WebElement shoppingToCart;
	
	public void VerifyProductQuantityInCart() 
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		viewProduct.click();
		productQuantity.sendKeys("4");
		productViewAddToCartBtn.click();
		popupViewCart.click();
		Assert.assertTrue(shoppingToCart.isDisplayed(), "Shopping to Cart page is not displayed!");		
	}

}
