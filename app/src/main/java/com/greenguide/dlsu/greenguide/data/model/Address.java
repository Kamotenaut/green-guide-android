package com.greenguide.dlsu.greenguide.data.model;

public class Address {

    private String name, address, contactPerson, contactNo, email;

    public Address(String name,
                   String address,
                   String contactPerson,
                   String contactNo,
                   String email){

        this.name = name;
        this.address = address;
        this.contactPerson = contactPerson;
        this.contactNo = contactNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
