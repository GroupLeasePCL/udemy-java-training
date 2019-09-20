package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("095 525 6749");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action 6 to show available action");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shouting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact no found!");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContact , newContact)){
            System.out.println("success update");
        }else {
            System.out.println("error updating");
        }

    }
    private static void removeContact(){
        System.out.println("Enter existing contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact no found!");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("success deleted");
        }else {
            System.out.println("error delete");
        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact:");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact no found!");
            return;
        }
        System.out.println("name: "+existingContact.getName()+" -> Phone number:"+existingContact.getPhoneNumber());
    }

    private static void addNewContact(){
        System.out.println("Enter new name:");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact was add: name="+name+" phone number="+phone);
        }else {
            System.out.println("can not add: name="+name+" already exist!");
        }
    }
    private static void startPhone(){
        System.out.println("Staring phone...");
    }
    private static void printActions(){
        System.out.println("0 - shutdown\n"+
                           "1 - print contact\n"+
                           "2 - add new contact\n"+
                           "3 - update contact\n"+
                           "4 - remove contact\n"+
                           "5 - query contact\n"+
                           "6 - print list available actions");
        System.out.println("Choose your action now:");
    }

}
