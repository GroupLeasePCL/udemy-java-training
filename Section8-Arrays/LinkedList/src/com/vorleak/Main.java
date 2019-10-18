package com.vorleak;

import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbounge");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
//        addInOrder(placesToVisit, "Sydney");
//        addInOrder(placesToVisit, "Melbonge");
//        addInOrder(placesToVisit, "Brisbane");
//        addInOrder(placesToVisit, "Perth");
//        addInOrder(placesToVisit, "Canberra");
//        addInOrder(placesToVisit, "Adelaide");
//        addInOrder(placesToVisit, "Darwin");
//        printList(placesToVisit);
//        addInOrder(placesToVisit, "Alice Springs");
//        printList(placesToVisit);
//        //visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+ i.next());
        }
        System.out.println("=================================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity + "is already includeed as destination");
                return false;
            }else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                return false;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.getFirst() == ""){
            System.out.println("No cities in the itenerary");
            return;
        }else{
            System.out.println("Now visiting "+ listIterator.next());
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;

                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(!goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;

                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    public static void printMenu() {
        System.out.println("Availible action:\n press");
        System.out.println("0 - to quit \n");
        System.out.println("1 - to go next city \n");
        System.out.println("2 - to go previous city");
        System.out.println("3 - print menu option");
    }

}
