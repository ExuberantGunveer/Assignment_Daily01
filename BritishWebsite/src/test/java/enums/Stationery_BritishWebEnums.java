package enums;

public enum Stationery_BritishWebEnums {
	
	Stationery_Name_GreetingsCards("Greetings Cards"),
	Stationery_Name_BirthdayCards("Birthday Cards"),
	Stationery_Name_CongratulationsCards("Congratulations Cards"),
	Stationery_Name_ThankYouCards("Thank You Cards"),
	Stationery_Name_Notebooks("Notebooks");
	
private String name ;
	
	private Stationery_BritishWebEnums(String name) {
		this.name=name;
	}
	
	public String getResoucesName() {
		return name;
	}

}
