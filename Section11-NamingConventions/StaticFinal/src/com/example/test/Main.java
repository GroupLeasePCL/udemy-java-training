package com.example.test;

public class Main {

    public static void main(String[] args) {

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int pw = 123456;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(2222);
        password.letMeIn(3434);
        password.letMeIn(343);
        password.letMeIn(55);
        password.letMeIn(123456);

    }
}
