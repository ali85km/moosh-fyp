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

    public User(String firstnameIn, String lastnameIn, String usernameIn,
            boolean genderIn, Date birthdayIn, Citizenship citizenshipIn,
            String passportIn, String homePhoneIn, String cellPhoneIn,
            String addressIn, String emailIn) {
        this.firstname = firstnameIn;
        this.lastname = lastnameIn;
        this.username = usernameIn;
        this.gender = genderIn;
        this.birthday = birthdayIn;
        this.citizenship = citizenshipIn;
        this.passport = passportIn;
        this.homePhone = homePhoneIn;
        this.cellPhone = cellPhoneIn;
        this.email = emailIn;
        this.address = addressIn;
    }

    public String getAddress() {
        return this.address;
    }

    public Date getBirthday() {
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

    public String getUsername() {
        return this.username;
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setAddress(String addressIn) {
        this.address = addressIn;
    }

    public void setBirthday(Date birthdayIn) {
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

    public void setUsername(String usernameIn) {
        this.username = usernameIn;
    }
}
