package model;

public class Question {

	private int choice;
	private String comment;
	
	public Question(int choice, String comment) {
		super();
		this.choice = choice;
		this.comment = comment;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
