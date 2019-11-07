package com.vorleak;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args){
        Map<String, String> languages = new HashMap<>();
        languages.put("java", "A java languages");
        languages.put("Jdk", "A jdk languages");
        languages.put("Algol", "A Algol languages");
        languages.put("Basic", "A Basic languages");

        System.out.println(languages.containsKey("java"));
        if(languages.containsKey("java")){
            System.out.println("java is already in the Map");
        }else{
            System.out.println("java is not in the Map ");
        }

        System.out.println("==========================");
        if(languages.remove("Algol","A Algol languages")){
            System.out.println("Algol is removed");
        }

        languages.replace("Basic","A Basic languages","A replace of basic languages");

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }

}
