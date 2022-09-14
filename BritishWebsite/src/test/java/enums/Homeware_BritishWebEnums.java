package enums;

public enum Homeware_BritishWebEnums {
	
	Homeware_Name_ArtPrints("Art + Prints"),
	Homeware_Name_Kitchenware("Kitchenware"),
	Homeware_Name_Home("Home"),
	Homeware_Name_Books("Books"),
	Homeware_Name_Candles("Candles + Fragrance");
	
private String name ;
	
	private Homeware_BritishWebEnums(String name) {
		this.name=name;
	}
	
	public String getResoucesName() {
		return name;
	}
	

}
