package com.example.test;

public class Main {

    public static void main(String[] args) {

        Account tharyAccount = new Account("Thary");
        tharyAccount.deposit(1000);
        tharyAccount.withdraw(500);
        tharyAccount.withdraw(-200);
        tharyAccount.deposit(-200);
        tharyAccount.calculateBalance();
        tharyAccount.balance = 5000;
        System.out.println(" Balance on account is " + tharyAccount.getBalance());
        tharyAccount.transactions.add(4500);
        tharyAccount.calculateBalance();
    }
}
