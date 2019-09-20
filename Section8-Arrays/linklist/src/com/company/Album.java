package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    String name;
    String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    private Song findSong(String title){
        for (Song checkSong : this.songs){
            if(checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }
    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
    public boolean addToPlaylist(int tractNum, LinkedList<Song> playlist){
        int index = tractNum-1;
        if(index>=0 && index<=(this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("not have tract: "+ tractNum);
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkSong = findSong(title);
        if(checkSong !=null){
            playlist.add(checkSong);
            return true;
        }
        System.out.println("not have in album");
        return false;
    }
}
