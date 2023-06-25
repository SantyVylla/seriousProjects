public class Main {
    public static void main(String[] args) {
        FreeUser freeUser = new FreeUser("Bernardo");
        Song barbieGirl = new Song("Barbie Girl", "Aqua", "Aquarium");
        Song calling = new Song("Calling", "Metro Boomin", "Not All Heroes Wear Capes");
        Song noHeart = new Song("No Heart", "21 Savage", "Savage Mode");
        Song anhilate = new Song("Annihilate", "Metro Boomin", "Not All Heroes Wear Capes");
        Song danger = new Song("Danger", "Offset", "FATHER OF 4");

        Playlist playlist = new Playlist("My Playlist");
        playlist.addSong(barbieGirl);
        playlist.addSong(calling);
        playlist.addSong(noHeart);
        playlist.addSong(anhilate);
        playlist.addSong(danger);

        freeUser.addPlaylist(playlist);
        freeUser.likeSong(barbieGirl, calling, noHeart, danger);
        freeUser.play(barbieGirl);

        SpotifyPlayer spotifyPlayer = new SpotifyPlayer();
        spotifyPlayer.reproductor();
    }
}
