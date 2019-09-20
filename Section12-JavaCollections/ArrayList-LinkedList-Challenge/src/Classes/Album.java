package Classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //add song
    public boolean addSong(String title,double duration){
        if (checkSong(title)==null){
            this.songs.add(new Song(title,duration));
            return  true;
        }
        return false;
    }
    //check song
    private Song checkSong(String title){
        for (Song checkedSong:this.songs ){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
    //add to playlist
    public boolean addToPlayList(int Number, LinkedList<Song> playList) {
        int index = Number -1;
        if((index >0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + Number);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = checkSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

}
