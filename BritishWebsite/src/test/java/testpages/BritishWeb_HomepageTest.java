package testpages;

import org.testng.annotations.Test;

import base.TestBase;

public class BritishWeb_HomepageTest extends TestBase {

	@Test(priority = 1)
	public void clickCreateAccount()  
	{
		obj.getHomePage().createAccount();
	}	
	
	
	@Test(priority = 2)
	public void checkBritishRedCrossMenuList()
	{
		obj.getHomePage().clickClothingTab();	
		obj.getHomePage().clickStationeryTab();
		obj.getHomePage().clickHomewareTab();
	}
	
	
}
