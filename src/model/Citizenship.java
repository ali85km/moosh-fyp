package model;

public class Citizenship {

	private String name;

	public static final Citizenship IRAN = new Citizenship("Iran");
	public static final Citizenship UNITED_STATES = new Citizenship("UnitedStates");
	public static final Citizenship MALAYSIA = new Citizenship("Malaysia");
	public static final Citizenship CANADA = new Citizenship("Canada");
	public static final Citizenship ITALY = new Citizenship("Italy");
	public static final Citizenship FRANCE = new Citizenship("France");
	public static final Citizenship GERMANY = new Citizenship("Germany");

	public String getName() {
		return name;
	}

	private Citizenship() {

	}

	private Citizenship(String nameIn) {
		this.name = nameIn;
	}
}
