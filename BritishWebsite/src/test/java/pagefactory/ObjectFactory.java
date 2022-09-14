package pagefactory;

import pages.BritishWeb_AddToCart;
import pages.BritishWeb_Homepage;

public class ObjectFactory {
	
	private BritishWeb_Homepage britishWebHomePage ;
	private BritishWeb_AddToCart britishWebAddToCart;
	
	public BritishWeb_Homepage getHomePage() {
		if(britishWebHomePage ==null) {
			britishWebHomePage = new BritishWeb_Homepage();
		}
		return britishWebHomePage;
	}

	
	public BritishWeb_AddToCart getAddToCartPage() {
		if(britishWebAddToCart ==null) {
			britishWebAddToCart = new BritishWeb_AddToCart();
		}
		return britishWebAddToCart;
	}

	
	
	
}
