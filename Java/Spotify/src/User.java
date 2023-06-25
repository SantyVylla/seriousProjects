import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String name;
    private List<Song> likedSongs;
    private List<Playlist> playlists;

    public User(String name) {
        this.name = name;
        this.likedSongs = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void likeSong(Song song) {
        likedSongs.add(song);
    }

    public void unlikeSong(Song song) {
        likedSongs.remove(song);
    }

    public void createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
    }

    public void deletePlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(name)) {
                playlists.remove(playlist);
                break;
            }
        }
    }

    public void addSongToPlaylist(Song song, String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(playlistName)) {
                playlist.addSong(song);
                break;
            }
        }
    }

    protected void getLikedSongs() {
        for (Song song : likedSongs) {
            System.out.println(song);
        }
    }

    protected List<Playlist> getPlaylists() {
        return playlists;
    }

    public void showPlaylists() {
        for (Playlist playlist : playlists) {
            System.out.println(playlist);
        }
    }

    public void play(Song song) {
        System.out.println("Playing " + song);
    }
}

