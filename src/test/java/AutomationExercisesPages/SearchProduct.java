package AutomationExercisesPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BaseConfig;

public class SearchProduct extends BaseConfig {
	WebDriver driver;

	public void SearchProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

	@FindBy(xpath = "//a[@href='/products']")
	WebElement ProductsBtn;

	@FindBy(xpath = "//div[@class='features_items']/h2")
	WebElement AllProductTitle;

	@FindBy(xpath = "//input[@id='search_product']")
	WebElement searchProduct;

	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement searchBtn;

	@FindBy(xpath = "//div[@class='features_items']/h2")
	WebElement allSearchedProduct;

	public void searchProduct() {
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		ProductsBtn.click();
		Assert.assertTrue(AllProductTitle.isDisplayed(), "All Product Title not visible ");
		searchProduct.sendKeys("White Top");
		searchBtn.click();

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='features_items']"));
		WebElement prod = products.stream().filter(p -> p.findElement(By.xpath("//p")).getText().equals(searchProduct))
				.findFirst().orElse(null);
		Assert.assertTrue(allSearchedProduct.isDisplayed(), "All Search relatd product are not visible");
	}

}
