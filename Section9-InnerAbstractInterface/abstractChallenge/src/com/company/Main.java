package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

//        create array data
        String arrData = "1 2 3 4 5";
        String[] data = arrData.split(" ");
        for(String s : data){
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("4"));
        tree.traverse(tree.getRoot());


    }
}
