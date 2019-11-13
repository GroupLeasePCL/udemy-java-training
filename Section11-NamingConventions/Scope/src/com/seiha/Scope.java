package com.seiha;

import java.util.Scanner;

public class Scope {
    private int x;

    public Scope(Scanner x) {
        System.out.println("Please input number");
        this.x = x.nextInt();
    }
    public void display(){
        for(int x=0; x<=12; x++){
            System.out.println(x + " Time: " + this.x + " equal :"+ x*this.x);
        }
    }
}
