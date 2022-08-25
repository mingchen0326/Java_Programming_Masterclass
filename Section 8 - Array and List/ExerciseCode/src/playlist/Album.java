package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            Song newSong = new Song(songTitle, songDuration);
            this.songs.add(newSong);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String songTitle) {
        for (int i=0; i<this.songs.size(); i++) {
            Song checkSong = this.songs.get(i);
            if (checkSong.getTitle().equals(songTitle)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index < 0) || (index >= this.songs.size())) {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        } else {
            Song songToAdd = this.songs.get(trackNumber);
            playlist.add(songToAdd);
            return true;
        }
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songToAdd = findSong(songTitle);
        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        } else {
            System.out.println("This album does not have a title " + songTitle);
            return false;
        }
    }
}
