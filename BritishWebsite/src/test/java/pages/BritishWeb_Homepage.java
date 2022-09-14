package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import britishweb_interface.Britishweb_Interface;
import enums.Clothing_BritishWebEnums;
import enums.CreateAccount_BritishWebEnums;
import enums.Homeware_BritishWebEnums;
import enums.Stationery_BritishWebEnums;

public class BritishWeb_Homepage extends TestBase implements Britishweb_Interface {
	
	
    private String createAccountDetails = "//input[@id='%s']";
	
	private String clothingOption = "//li[@class='nav-dropdown__item ']//a[contains(text(),'%s')]";
	
	private String productLink = "//a[contains(text(),'%s')]";
	
	private String stationery = "//li[@class='nav-dropdown__item ']//a[contains(text(),'%s')]";
	
	private String homeware = "//li[@class='nav-dropdown__item ']//a[contains(text(),'%s')]";
	
	@FindBy(xpath = "//img[@title='British Red Cross']")
	WebElement redCrossLink ;
	
	@FindBy(xpath="//a[@class='header__action-item-link hidden-pocket hidden-lap']")
	WebElement myAccountTab;
	
	@FindBy(xpath="//form[@id='header_customer_login']//following-sibling::div[@class='popover__secondary-action']//button[@class='link link--accented']")
	WebElement createAccountLink;
	
	@FindBy(xpath="//button[contains(text(),'Create my account')]")
	WebElement createMyAccountTab ;
	
	@FindBy(xpath="//li[@class='nav-bar__item']//a[contains(text(),'Clothing')]")
	WebElement clothingTab ;
	
	@FindBy(xpath = "//li[@class='nav-bar__item']//a[contains(text(),'Stationery')]")
	WebElement stationeryTab;
	
	@FindBy(xpath = "//li[@class='nav-bar__item']//a[contains(text(),'Homeware')]")
	WebElement homewareTab ;
	
	@FindBy(xpath = "//input[@class='search-bar__input']")
	WebElement searchBar ;
	
	@FindBy(xpath = "//a[contains(text(),'Designed by Refugees Large Fresh Lemongrass Soy Wax Scented Ca...')]")
	WebElement firstProduct;
	
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	WebElement addToCart; 
	
	@FindBy(xpath = "//span[@class='header__cart-count']")
	WebElement addToCartValue ;

	@FindBy(xpath = "(//input[@inputmode='numeric'])[2]")
	WebElement quantityValue;
	
	public BritishWeb_Homepage() {	
	
		PageFactory.initElements(driver, this);
	}
		
	public void createAccount() {		
		
	// Handled Cookies Message	
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	// Get the Title of Page	
		String britishWebTitle = driver.getTitle();
		System.out.println("The Title of Website is : "+britishWebTitle);
	// Verified The Title of HomePage	
		Assert.assertEquals( prop.getProperty("expectedTitle"), britishWebTitle,"title is mis-match");
	// Verified The Title of HomePage with Soft Assertion		
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(prop.getProperty("expectedText"), britishWebTitle,"Title of Website is not Matching");
	// Enter The Details For New Account
		myAccountTab.click();		
		createAccountLink.click();
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_FirstName.getResoucesName()))).sendKeys("Gunveer");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_LastName.getResoucesName()))).sendKeys("Singh");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_Email.getResoucesName()))).sendKeys("ekomkar500@gmail.com");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_Password.getResoucesName()))).sendKeys("HelloWorld@123");
		}

	public void clickClothingTab() {	
		
	// Click on Clothing Tab Menu And Selecting The Different Value from List 
		for(Clothing_BritishWebEnums c : Clothing_BritishWebEnums.values()) {			
			Actions action = new Actions(driver);
			action.moveToElement(clothingTab).build().perform();
			driver.findElement(By.xpath(String.format(clothingOption, c.getResoucesName()))).click();
	// Verify The Title of Selected Page from List		
			String expectedtitle = driver.getTitle();
			System.out.println("The Title of " + expectedtitle + " Page is : "+expectedtitle);
			Assert.assertEquals(c.getResoucesName(), expectedtitle, "Title is Not Matching");
		}
	}

	public void clickStationeryTab() {		
		
	// Click on StationeryTab Menu And Selecting The Different Value from List 
		for(Stationery_BritishWebEnums s : Stationery_BritishWebEnums.values()) {
			Actions action = new Actions(driver);
			action.moveToElement(stationeryTab).build().perform();
			driver.findElement(By.xpath(String.format(stationery, s.getResoucesName()))).click();
	// Verify The Title of Selected Page from List		
			String expectedtitle = driver.getTitle();
			System.out.println("The Title of " + expectedtitle + " Page is : "+expectedtitle);
			Assert.assertEquals(s.getResoucesName(), expectedtitle, "Title is Not Matching");
			
	}}

	public void clickHomewareTab() {
	
	// Click on HomewareTab Menu And Selecting The Different Value from List 
		for(Homeware_BritishWebEnums h : Homeware_BritishWebEnums.values()) {
			Actions action = new Actions(driver);
			action.moveToElement(homewareTab).build().perform();
			driver.findElement(By.xpath(String.format(homeware, h.getResoucesName()))).click();
	// Verify The Title of Selected Page from List		
			String expectedtitle = driver.getTitle();
			System.out.println("The Title of " + expectedtitle + " Page is : "+expectedtitle);
			Assert.assertEquals(h.getResoucesName(), expectedtitle, "Title is Not Matching");
			}		
	}

	
}
