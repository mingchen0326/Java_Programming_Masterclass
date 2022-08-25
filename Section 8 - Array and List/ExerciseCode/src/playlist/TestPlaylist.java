package playlist;

public class TestPlaylist {
    public static void main(String[] args) {
        Song newSong = new Song("Yellow", 2.50);
        String get = newSong.toString();
        System.out.println(get);
    }
}
