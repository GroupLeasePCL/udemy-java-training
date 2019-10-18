package com.vorleak;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContact;
    private String myNumber;

    public MobilePhone(ArrayList<Contact> myContact, String myNumber) {
        this.myContact = myContact;
        this.myNumber = myNumber;
    }

    public void startPhone(){
        System.out.println("Starting phone ...");
    }

    public void shutDownPhone(){
        System.out.println("Phone is shutdown ...");
    }

}