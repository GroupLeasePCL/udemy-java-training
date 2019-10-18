package com.vorleak;

public class Contact {
    private String name;
    private String PhoneNumber;

    public Contact(String name, String number) {
        this.name = name;
        this.PhoneNumber = number;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
