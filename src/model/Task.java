package model;

import java.util.Date;

public class Task {

	private int id;
	private String title;
	private Date assignDate;
	private Date dueDate;
	private Date endDate;

	public Task(int id, String title, Date assignDate, Date dueDate,
			Date endDate) {
		this.id = id;
		this.title = title;
		this.assignDate = assignDate;
		this.dueDate = dueDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getAssignDate() {
		return assignDate;
	}

	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
