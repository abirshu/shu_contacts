package com.example.shu_contact;

public class dataholder {
    private String name;
    private String dept;
    private String email;
    private String bloodGroup; // Added Blood Group field
    private String contact; // Added Contact field

    public dataholder() {
        // Default constructor required for Firebase Realtime Database
    }

    public dataholder(String name, String dept, String email, String bloodGroup, String contact) {
        this.name = name;
        this.dept = dept;
        this.email = email;
        this.bloodGroup = bloodGroup;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
