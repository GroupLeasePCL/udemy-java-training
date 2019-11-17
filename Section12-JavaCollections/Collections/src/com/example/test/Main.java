package com.example.test;

public class Main {

    public static void main(String[] args) {

	Theathre theathre = new Theathre("OLympic",8,12);
	    theathre.getSeats();
        if(theathre.reserveSeat("H11")){
            System.out.println("Please pay");
        }  else {
            System.out.println("Sorry, seat is taken");
        }
        if(theathre.reserveSeat("H11")){
            System.out.println("Please pay");
        }  else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
