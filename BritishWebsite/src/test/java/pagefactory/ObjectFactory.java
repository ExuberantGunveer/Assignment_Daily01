package pagefactory;

import pages.BritishWeb_Homepage;

public class ObjectFactory {
	
	private BritishWeb_Homepage britishWebHomePage ;
	
	public BritishWeb_Homepage getHomePage() {
		if(britishWebHomePage ==null) {
			britishWebHomePage = new BritishWeb_Homepage();
		}
		return britishWebHomePage;
	}

	
	
	
	
	
}
