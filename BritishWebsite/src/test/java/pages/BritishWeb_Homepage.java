package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;
import britishweb_interface.Britishweb_Interface;
import enums.Clothing_BritishWebEnums;
import enums.CreateAccount_BritishWebEnums;

public class BritishWeb_Homepage extends TestBase implements Britishweb_Interface {
	
	
    private String createAccountDetails = "//input[@id='%s']";
	
//	private String menuTabs = "//li[@class='nav-bar__item']//a[contains(text(),'%s')]";
	
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
	

	
	public BritishWeb_Homepage() {	
	
		PageFactory.initElements(driver, this);
	}
	
	
	public void createAccount() {
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		myAccountTab.click();
		createAccountLink.click();
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_FirstName.getResoucesName()))).sendKeys("Gunveer");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_LastName.getResoucesName()))).sendKeys("Singh");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_Email.getResoucesName()))).sendKeys("ekomkar500@gmail.com");
		driver.findElement(By.xpath(String.format(createAccountDetails, CreateAccount_BritishWebEnums.CREATEACCOUNT_Name_Password.getResoucesName()))).sendKeys("HelloWorld@123");
		
	}

	public void clickClothingTab() {
		
		for(Clothing_BritishWebEnums c : Clothing_BritishWebEnums.values()) {
			Actions action = new Actions(driver);
			action.moveToElement(clothingTab).build().perform();
			driver.findElement(By.xpath(String.format(clothingOption, c.getResoucesName()))).click();
		}
	}

	public void clickStationeryTab() {
		
		
	}

	public void clickHomewareTab() {
	
		
	}

	public void addProductToCart() {
	
		
	}

	
	
	
	
}