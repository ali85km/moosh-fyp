package model;

public class TcWorkHours {

	private int day[]=new int[30];
	
	public TcWorkHours(int[] day) {
		super();
		this.day = day;
	}

	public int[] getDay() {
		return day;
	}

	public void setDay(int day[]) {
		this.day = day;
	}
		
}
