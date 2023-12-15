package AutomationExercisesPages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {
	WebDriver driver;
	public void testmethod(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//input[@data-qa='login-email']")
	WebElement emailid;
	
	@FindBy (xpath = "//input[@data-qa='login-password']")
	WebElement password;
	
	@FindBy (xpath = "//button[@data-qa='login-button']")
	WebElement loginBtn;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lru3825\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		WebDriver driver1=new ChromeDriver();
//		WebDriver driver2=new ChromeDriver();
//		WebDriver driver3=new ChromeDriver();
//		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver1.get("https://macmillan-education-mexico-testing-env.myshopify.com/");
//		
//		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver2.get("https://macmillan-education-mexico-pesos-staging.myshopify.com/");
//		
//		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver3.get("https://macmillan-education-brazil-testing-env.myshopify.com/");
		
		
		FileInputStream ipfile=Properproper("C:\\Users\\lru3825\\eclipse-workspace\\Automation_Exercise\\src\\main\\java\\Utils\\config.properties");
		Properties prop=new Properties();
		prop.load(ipfile);
		String launch=prop.getProperty("MEM");

		
		
	}


	private static FileInputStream Properproper(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
