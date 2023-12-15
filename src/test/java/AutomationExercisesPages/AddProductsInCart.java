package AutomationExercisesPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BaseConfig;

public class AddProductsInCart extends BaseConfig {
	WebDriver driver;

	public void AddProductsInCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

	@FindBy (xpath = "//div[@class='features_items']//div[@class='col-sm-4'][1]")
	WebElement firstProduct;
	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement ProductsBtn;

	@FindBy(xpath = "//div[@class='features_items']/h2")
	WebElement AllProductTitle;

	@FindBy(xpath = "//div[@class='col-sm-4']")
	WebElement productList;

	@FindBy(xpath = "//div[@class='choose']")
	WebElement chooseProduct;

	@FindBy(xpath = "//div[@class='product-information']/h2")
	WebElement productName;

	@FindBy(xpath = "//div[@class='product-information']//p[contains(text(),'Category')]")
	WebElement productCategory;

	@FindBy(xpath = "//div[@class='product-information']//span[contains(text(),'Rs.')]")
	WebElement productPrice;

	@FindBy(xpath = "//div[@class='product-information']//b[contains(text(),'Availability:')]")
	WebElement productAvailability;

	@FindBy(xpath = "//div[@class='product-information']//b[contains(text(),'Condition:')]")
	WebElement productCondition;

	@FindBy(xpath = "//div[@class='product-information']//b[contains(text(),'Brand:')]")
	WebElement productBrand;



	public void AddProductsInCart() 
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		ProductsBtn.click();
		Assert.assertTrue(AllProductTitle.isDisplayed(), "All Product Title not visible ");
		Actions action=new Actions(driver);
		action.moveToElement(firstProduct).perform();
		
		Assert.assertTrue(productName.isDisplayed(), "Product Name not Displayed!");
		Assert.assertTrue(productCategory.isDisplayed(), "Product category not Displayed!");
		Assert.assertTrue(productPrice.isDisplayed(), "Product price not Displayed!");
		Assert.assertTrue(productAvailability.isDisplayed(), "Product availibility not Displayed!");
		Assert.assertTrue(productCondition.isDisplayed(), "Product condition not Displayed!");
		Assert.assertTrue(productBrand.isDisplayed(), "Product Brand not Displayed!");		
	}

}
