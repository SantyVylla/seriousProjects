import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String name;
    private List<Song> likedSongs;
    private List<Playlist> playlists;

    public User(String name) {
        this.name = name;
        likedSongs = new ArrayList<>();
        playlists = new ArrayList<>();
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
        playlists.removeIf(playlist -> playlist.getName().equals(name));
    }

    public void addSongToPlaylist(Song song, String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(playlistName)) {
                playlist.addSong(song);
                break;
            }
        }
    }

    public void showLikedSongs() {
        for (Song song : likedSongs) {
            System.out.println(song);
        }
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

}

