import java.util.ArrayList;
import java.util.List;

public class PremiumUser extends User {
    private List<Song> downloadedSongs;

    public PremiumUser(String name) {
        super(name);
        downloadedSongs = new ArrayList<>();
    }

    public void likeSong(Song... songs) {
        for (Song song : songs) {
            likeSong(song);
        }
    }

    @Override
    public void createPlaylist(String name) {
        super.createPlaylist(name);
    }

    @Override
    public void deletePlaylist(String name) {
        if (this.getPlaylists().size() > 1) {
            super.deletePlaylist(name);
        }
    }

    public void downloadSong(Song song) {
        System.out.println("Downloading song: " + song.getTitle());
    }

    public void downloadedSongs () {
        for (Song song : downloadedSongs) {
            System.out.println(song);
        }
    }

}
