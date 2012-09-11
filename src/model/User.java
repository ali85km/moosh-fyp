package model;

import java.util.Date;

public class User {

	private String firstname;
	private String lastname;
	private String username;
	private boolean gender;
	private Date birthday;
	private Citizenship citizenship;
	private String passport;
	private String homePhone;
	private String cellPhone;
	private String email;
	private String address;

	public User(String firstname, String lastname, String username,
			boolean gender, Date birthday, Citizenship citizenship,
			String passport, String homePhone, String cellPhone,
			String address, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.gender = gender;
		this.birthday = birthday;
		this.citizenship = citizenship;
		this.passport = passport;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.email = email;
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Citizenship getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(Citizenship citizenship) {
		this.citizenship = citizenship;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
