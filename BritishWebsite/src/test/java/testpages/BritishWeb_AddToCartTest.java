package testpages;

import org.testng.annotations.Test;

import base.TestBase;

public class BritishWeb_AddToCartTest extends TestBase{
	@Test(priority = 1)
	public void clickCreateAccount()  
	{
		obj.getHomePage().createAccount();
	}	
	
	@Test(priority = 2)
	public void verifyAddToCart()
	{
		obj.getAddToCartPage().addProductToCart();
	}
	

}
