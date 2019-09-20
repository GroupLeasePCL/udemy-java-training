package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	 Album album = new Album("Album1","hip hop");
	 album.addSong("Sleak Kley",1.2);
	 album.addSong("Bon Phum",1.5);
	 albums.add(album);

	 album = new Album("Album2","classic");
	 album.addSong("Nik Oun",2);
	 album.addSong("Stueng Songkae",1.4);
	 albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Berk Luy",playList);
        albums.get(0).addToPlayList("Sleak Kley",playList);
        albums.get(0).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(6,playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
        }else {
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    System.out.println("PlayList complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }else {
                        System.out.println("We reach the end of playList");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }else {
                        System.out.println("We're at the start of playList");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                       if(listIterator.hasPrevious()){
                           System.out.println("Now replaying "+ listIterator.previous().toString());
                           forward = false;
                       }else {
                           System.out.println("We're at the start of list");
                       }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+ listIterator.next());
                            forward = true;
                        }else {
                            System.out.println("We're reach the end of list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - Quit\n"+
                           "1 - play next song\n"+
                           "2 - play previous song\n"+
                           "3 - replay current song\n"+
                           "4 - list song in the playList\n"+
                           "5 - print available actions\n"+
                           "5 - to delete song from playlist");
    }
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("------------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------");
    }
}
