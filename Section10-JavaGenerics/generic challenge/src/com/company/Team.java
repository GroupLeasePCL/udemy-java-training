package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int play=0, won=0, lost=0, tied=0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team.");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " added to team " + this.name);
            return true;
        }
    }
    public int numPlayer(){
        return this.members.size();
    }
    public void mathResult(Team oppent, int ourScore, int theirScore){
        String ms;
        if(ourScore > theirScore){
            won++;
            ms = " win ";
        }else if(ourScore == theirScore){
            tied++;
            ms = " balance ";
        }else {
            lost++;
            ms = " lost ";
        }
        play++;
        if(oppent != null){
            System.out.println(this.getName() + ms + oppent.getName());
            oppent.mathResult(null,theirScore,ourScore);
        }
    }
    public int rangking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.rangking() > team.rangking()){
            return -1;
        }else {
            return 0;
        }
    }
}
