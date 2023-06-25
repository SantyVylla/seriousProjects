public class FreeUser extends User {

    public FreeUser(String name) {
        super(name);
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

    @Override
    public void addSongToPlaylist(Song song, String playlistName) {
        for (int i = 0; i < this.getPlaylists().size(); i++) {
            if (getPlaylists().get(i) != null && this.getPlaylists().get(i).getName().equals(playlistName)) {
                super.addSongToPlaylist(song, playlistName);
            }
        }
    }

    public void addPlaylist(Playlist playlist) {
        getPlaylists().add(playlist);
    }
}

