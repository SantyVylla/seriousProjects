import java.util.ArrayList;
import java.util.List;

public class PremiumUser extends User {
    private List<Song> downloadedSongs;

    public PremiumUser(String name) {
        super(name);
        downloadedSongs = new ArrayList<>();
    }

    public void play(Song song) {
        System.out.println("Playing song: " + song.getTitle());
    }

    public void downloadSong(Song song) {
        System.out.println("Downloading song: " + song.getTitle());
        downloadedSongs.add(song);
    }

    public void showDownloadedSongs() {
        for (Song song : downloadedSongs) {
            System.out.println(song);
        }
    }

}
