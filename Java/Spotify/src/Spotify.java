import java.util.ArrayList;
import java.util.List;

public abstract class Spotify {
    protected List<Playlist> playlists;

    public Spotify() {
        this.playlists = new ArrayList<>();
    }
    public void play() {
        for (Playlist playlist : playlists) {
            System.out.println("Playing playlist: " + playlist.getName());
            List<Song> songs = playlist.getSongs();
            for (Song song : songs) {
                System.out.println("Playing song: " + song.getTitle() + " by " + song.getArtist() + " from (" + song.getAlbum() + ")");
            }
        }
    }
}
