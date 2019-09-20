package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkList list = new MyLinkList(null);
        list.traverse(list.getRoot());

//        create array data
        String arrData = "Pig Dog Cow Lion";
        String[] data = arrData.split(" ");
        for(String s : data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}
