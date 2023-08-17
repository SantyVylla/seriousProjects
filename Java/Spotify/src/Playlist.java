import java.util.ArrayList;
import java.util.List;

public class Playlist extends Spotify{
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return name + " - " + songs.size() + " songs";
    }

    public void play() {
        System.out.println("Playing playlist: " + name);
        for (Song song : songs) {
            System.out.println("Playing song: " + song.getTitle());
        }
    }
}

