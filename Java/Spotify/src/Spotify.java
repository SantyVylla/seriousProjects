import java.util.ArrayList;
import java.util.List;

public abstract class Spotify {
    protected List<Playlist> playlists;

    public Spotify() {
        this.playlists = new ArrayList<>();
    }

    public abstract void play();

}
