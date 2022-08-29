package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();


    }

    private boolean addSong(String songTitle, double songDuration) {
        return this.songList.add(new Song(songTitle, songDuration));
    }

    private boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song songToAdd = this.songList.findSong(trackNumber);
        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songToAdd = this.songList.findSong(songTitle);
        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        } else {
            System.out.println("This album does not have a title " + songTitle);
            return false;
        }
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            for (int i=0; i<this.songs.size(); i++) {
                if (songs.contains(song)) {
                    return false;
                }
            }
            songs.add(song);
            return true;
        }

        public Song findSong(String songTitle) {
            for (int i=0; i<this.songs.size(); i++) {
                Song checkSong = this.songs.get(i);
                if (checkSong.getTitle().equals(songTitle)) {
                    return checkSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (trackNumber >= 0 && trackNumber < songs.size()) {
                return songs.get(index);
            } else {
                System.out.println("This album does not have a track " + trackNumber);
                return null;
            }
        }
    }

}
