package enums;

public enum Clothing_BritishWebEnums {
	
	CLOTHING_Name_TShirt("T-Shirts + Sweatshirts"),
	CLOTHING_Name_CyclingJersey("Cycling Jerseys"),
	CLOTHING_Name_Socks("Socks");
	
	private String name ;
	
	private Clothing_BritishWebEnums(String name) {
		this.name=name;
	}
												
	public String getResoucesName() {
		return name;
	}

}
