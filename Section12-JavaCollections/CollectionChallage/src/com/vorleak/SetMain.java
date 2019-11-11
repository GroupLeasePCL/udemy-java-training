package com.vorleak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main (String[] args){

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1 ; i<=100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println("There are " + squares.size() + "​squares and " + cubes.size() + "​cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("Union​contain "+ union.size() + "​element");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains "+intersection.size() + " element");
        for(int i: intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "There is a sentence here";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all","nature","is","but","art", "unknown", "to","thee"};
        String[] divineWords = {"to","err","is","human","forgive", "divine"};

        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        for(String j: diff1){
            System.out.println(j + " ");
        }
        System.out.println("=========");
        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        for(String k: diff2){
            System.out.println(k + " ");
        }
        System.out.println("=========");

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersection.retainAll(divine);

        System.out.println("Symmetric difference ");
        unionTest.removeAll(intersectionTest);
        for(String e: unionTest){
            System.out.println(e + " ");
        }
        System.out.println("=========");
        if(nature.containsAll(divine)){
            System.out.println("divin is a subset of nature");
        }
        if(nature.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of nature");
        }
        if(divine.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of divine");
        }
    }
}
