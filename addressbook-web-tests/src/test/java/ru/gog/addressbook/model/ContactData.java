package ru.gog.addressbook.model;
//comment
public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String phone;
    //comment
    public ContactData(String firstname, String lastname, String email, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        //comment
        this.email = email;
        this.phone = phone;
    }
    //comment
    public String getFirstname() {
        return firstname;
    }
    //comment
    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
    //comment
    public String getPhone() {
        return phone;
    }
}//comment
