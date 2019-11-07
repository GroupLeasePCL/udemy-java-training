package com.vorleak;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapLocationMain {
    private static Map<Integer, MapLocation> locations = new HashMap<Integer, MapLocation>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new MapLocation(0,"Location 0"));
        locations.put(1, new MapLocation(1,"Location 1"));
        locations.put(2, new MapLocation(2,"Location 2"));
        locations.put(3, new MapLocation(3,"Location 3"));
        locations.put(4, new MapLocation(4,"Location 4"));
        locations.put(5, new MapLocation(5,"Location 5"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);

        locations.get(2).addExit("N",5);

        locations.get(3).addExit("W",1);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);

        Map<String, String> command = new HashMap<String, String>();
        command.put("quite","Q");
        command.put("south","S");
        command.put("west","W");
        command.put("north","N");
        command.put("east","E");



        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.println(exit + ", ");
            }
            System.out.println("");
            String direction = scanner.nextLine().toLowerCase();
            if(direction.length() > 0){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(command.containsKey(word)){
                        direction = command.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);

            }else {
                System.out.println("direction are not allow");
                break;
            }
        }
    }
}
