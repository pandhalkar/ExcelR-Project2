package AutomationExercisesPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Utils.BaseConfig;

public class VerifyTestCasesPage extends BaseConfig {

	@FindBy (xpath = "//div[@class='col-sm-8']/div/ul/li[1]")
	WebElement home;

	@FindBy(xpath = "//div[@class='col-sm-6']//button[contains(text(),'Test Cases')]")
	WebElement TestCaseBtn;
	
	@FindBy (xpath = "//div[@class='col-sm-9 col-sm-offset-1']/h2")
	WebElement TestCasesTitle;
	
	public void VerifyTestCasesPage()
	{
		Assert.assertTrue(home.isDisplayed(), "Home Page is not visible successfully");
		TestCaseBtn.click();
		Assert.assertTrue(TestCasesTitle.isDisplayed(), "Test Cases Page is not visible successfully");
		
	}
	
	
	
}
