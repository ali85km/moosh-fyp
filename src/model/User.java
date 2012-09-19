package model;


public class User {

	
		
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private boolean gender;
    private String birthday;
    private Citizenship citizenship;
    private String passport;
    private String homePhone;
    private String cellPhone;
    private String email;
    private String address;

   

    public User(String firstname, String lastname, String username,
			String password, boolean gender, String birthday,
			Citizenship citizenship, String passport, String homePhone,
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

	public String getAddress() {
        return this.address;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getCellPhone() {
        return this.cellPhone;
    }

    public Citizenship getCitizenship() {
        return this.citizenship;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getHomePhone() {
        return this.homePhone;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getPassport() {
        return this.passport;
    }
    
    public String getPassword() {
		return password;
	}

	public String getUsername() {
        return this.username;
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setAddress(String addressIn) {
        this.address = addressIn;
    }

    public void setBirthday(String birthdayIn) {
        this.birthday = birthdayIn;
    }

    public void setCellPhone(String cellPhoneIn) {
        this.cellPhone = cellPhoneIn;
    }

    public void setCitizenship(Citizenship citizenshipIn) {
        this.citizenship = citizenshipIn;
    }

    public void setEmail(String emailIn) {
        this.email = emailIn;
    }

    public void setFirstname(String firstnameIn) {
        this.firstname = firstnameIn;
    }

    public void setGender(boolean genderIn) {
        this.gender = genderIn;
    }

    public void setHomePhone(String homePhoneIn) {
        this.homePhone = homePhoneIn;
    }

    public void setLastname(String lastnameIn) {
        this.lastname = lastnameIn;
    }

    public void setPassport(String passportIn) {
        this.passport = passportIn;
    }

	public void setPassword(String password) {
		this.password = password;
	}
    
    public void setUsername(String usernameIn) {
        this.username = usernameIn;
    }
}
