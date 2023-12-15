package AutomationTestMethods;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationExercisesPages.*;


import Utils.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class execution extends BaseConfig{

	@Test (priority = 1)
	public void login()
	{
		RegisterUserPage registrationUserPage=new RegisterUserPage(driver);
		registrationUserPage.registerUser();
	}
	
	@Test (priority = 2)
	public void CorrectEmailAndPassword()
	{
		LoginUserwithCorrectEmailAndPassword correctEmailPassword=new LoginUserwithCorrectEmailAndPassword();
		correctEmailPassword.LoginUserwithCorrectEmailAndPassword();
	}
	
	@Test (priority = 3)
	public void inCorrectEmailAndPassword()
	{
		LoginUserwithincorrectemailandpassword incorrectEmailPassword=new LoginUserwithincorrectemailandpassword();
		incorrectEmailPassword.LoginUserwithCorrectEmailAndPassword();
	}
	
	
	@Test (priority = 4)
	public void logout()
	{
		LogoutUser logout=new LogoutUser();
		logout.logOut();
	}
	
	@Test (priority = 5)
	public void existingUser()
	{
		RegisterUserwithExistingEmail existingUser=new RegisterUserwithExistingEmail();
		existingUser.registerUser();
	}
	
	@Test (priority = 6)
	public void contactUsForm()
	{
		ContactUsForm contactUsForm=new ContactUsForm();
		contactUsForm.contactUsForm();
	}
	
	@Test (priority = 7)
	public void VerifyTestCasesPage()
	{
		VerifyTestCasesPage VerifyTestCasesPage=new VerifyTestCasesPage();
		VerifyTestCasesPage.VerifyTestCasesPage();
	}
	
	@Test (priority = 8)
	public void VerifyAllProductsAndProductDetailPage()
	{
		VerifyAllProductsAndProductDetailPage allproduct_details=new VerifyAllProductsAndProductDetailPage();
		allproduct_details.allProduct_details();
	}
	
	@Test (priority = 9)
	public void SearchProduct()
	{
		SearchProduct SearchProduct=new SearchProduct();
		SearchProduct.searchProduct();
	}
	
	@Test (priority = 10)
	public void VerifySubscriptionInHomePage()
	{
		VerifySubscriptionInHomePage subscription=new VerifySubscriptionInHomePage();
		subscription.VerifySubscriptionInHomePage();
	}
	
	@Test (priority = 11)
	public void VerifySubscriptionInCartpage()
	{
		VerifySubscriptionInCartpage subscriptionOnCart=new VerifySubscriptionInCartpage();
		subscriptionOnCart.VerifySubscriptionInCartPage();
	}
	
	@Test (priority = 12)
	public void AddProductsInCart()
	{
		AddProductsInCart AddProductsInCart=new AddProductsInCart();
		AddProductsInCart.AddProductsInCart();
	}
	
	@Test (priority = 13)
	public void VerifyProductQuantityInCart()
	{
		VerifyProductQuantityInCart VerifyProductQuantityInCart=new VerifyProductQuantityInCart();
		VerifyProductQuantityInCart.VerifyProductQuantityInCart();
	}
	
	@Test (priority = 14)
	public void PlaceOrder_RegisterWhileCheckout()
	{
		PlaceOrder_RegisterWhileCheckout RegisterWhileCheckout=new PlaceOrder_RegisterWhileCheckout();
		RegisterWhileCheckout.PlaceOrder_RegisterWhileCheckout();
	}
	
	@Test (priority = 15)
	public void PlaceOrder_RegisterBeforeCheckout()
	{
		PlaceOrder_RegisterBeforeCheckout RegisterBeforeCheckout=new PlaceOrder_RegisterBeforeCheckout();
		RegisterBeforeCheckout.PlaceOrder_RegisterBeforeCheckout();
	}
	
	
	
	
	
	
	
	
}
