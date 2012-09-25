package model;


public class User {

	
		
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String gender;
    private String birthday;
    private String citizenship;
    private String passport;
    private String homePhone;
    private String cellPhone;
    private String email;
    private String address;
	
    public User(String firstname, String lastname, String username,
			String password, String gender, String birthday,
			String citizenship, String passport, String homePhone,
			String cellPhone, String email, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.birthday = birthday;
		this.citizenship = citizenship;
		this.passport = passport;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.email = email;
		this.address = address;
	}
	
    
    
    @Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname
				+ ", username=" + username + ", password=" + password
				+ ", gender=" + gender + ", birthday=" + birthday
				+ ", citizenship=" + citizenship + ", passport=" + passport
				+ ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
				+ ", email=" + email + ", address=" + address + "]";
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
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
