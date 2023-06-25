import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSongs(Song... songsToAdd) {
        for (Song song : songsToAdd) {
            songs.add(song);
        }
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return name + " - " + songs.size() + " songs";
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}

