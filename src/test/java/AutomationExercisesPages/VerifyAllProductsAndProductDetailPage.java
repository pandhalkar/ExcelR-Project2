package AutomationExercisesPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BaseConfig;

public class VerifyAllProductsAndProductDetailPage extends BaseConfig {
	WebDriver driver;

	public void AllProductDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

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



	public void allProduct_details() 
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		ProductsBtn.click();
		Assert.assertTrue(AllProductTitle.isDisplayed(), "All Product Title not visible ");
		List<WebElement> products = driver.findElements(By.xpath("productList"));
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.xpath("//p")).getText().equalsIgnoreCase("Blue Top"))
				.findFirst().orElse(null);
		prod.findElement(By.xpath("chooseProduct")).click();
		Assert.assertTrue(productName.isDisplayed(), "Product Name not Displayed!");
		Assert.assertTrue(productCategory.isDisplayed(), "Product category not Displayed!");
		Assert.assertTrue(productPrice.isDisplayed(), "Product price not Displayed!");
		Assert.assertTrue(productAvailability.isDisplayed(), "Product availibility not Displayed!");
		Assert.assertTrue(productCondition.isDisplayed(), "Product condition not Displayed!");
		Assert.assertTrue(productBrand.isDisplayed(), "Product Brand not Displayed!");		
	}

}
