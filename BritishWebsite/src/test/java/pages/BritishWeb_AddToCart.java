package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import britishweb_interface.AddToCart_Interface;

public class BritishWeb_AddToCart extends TestBase implements AddToCart_Interface {
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Designed by Refugees Large Fresh Lemongrass Soy Wax Scented Ca...')]")
	WebElement firstProduct;
	
	@FindBy(xpath = "//a[contains(text(),'Designed by Refugees Large Spicy Orange Soy Wax Scented Candle')]")
	WebElement secondProduct;
	
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	WebElement addToCart; 
	
	@FindBy(xpath = "//span[@class='header__cart-count']")
	WebElement addToCartValue ;

	@FindBy(xpath = "(//input[@inputmode='numeric'])[2]")
	WebElement quantityValue;
	
	public BritishWeb_AddToCart()
	{
		PageFactory.initElements(driver, this);
	}
	

	public void addProductToCart() {
		
	// Navigate to NewIn Page
		driver.navigate().to(prop.getProperty("newInUrl"));		
	// Verify The Title of Page	
		String newInPageTitle = driver.getTitle();
		System.out.println("The Title of Website is : "+ newInPageTitle);
		firstProduct.click();
	//  Add Product To Cart	
		addToCart.click();
	// 	Get Text Of Cart Value
		String CartValue = addToCartValue.getText();
		System.out.println("The Cart Value is : "+ CartValue);
	//  Converting the String Cart Value to Integer	
		int cartValueInt = Integer.parseInt(CartValue);
		System.out.println("The Integer Value of Cart after Conversion is :  "+cartValueInt);
	//	Get Text Of Quantity Value
		String quantityVal = quantityValue.getAttribute("value");
		System.out.println("The Checkout Value in String is : "+ quantityVal);
	//  Converting the String Quantity Value to Integer		
		int quantityValueInt = Integer.parseInt(quantityVal);
		System.out.println("The Integer Value of Quantity after Conversion is :  "+quantityValueInt);
	// Verifying that Cart Value is Equal To Quantity Value	
		if(cartValueInt==quantityValueInt) {
			System.out.println("The Product Quantity value in Cart is Equal to The Quantity Value");
		}else {
			System.out.println("The Product Quantity value in Cart is Not Equal to The Quantity Value");
		}
		
				
	}

}
