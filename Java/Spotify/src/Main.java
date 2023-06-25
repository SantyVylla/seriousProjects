public class Main {
    public static void main(String[] args) {
        FreeUser freeUser = new FreeUser("Bernardo");

        Song barbieGirl = new Song("Barbie Girl", "Aqua", "Aquarium");
        Song calling = new Song("Calling", "Metro Boomin", "Not All Heroes Wear Capes");
        Song noHeart = new Song("No Heart", "21 Savage", "Savage Mode");
        Song annihilate = new Song("Annihilate", "Metro Boomin", "Not All Heroes Wear Capes");
        Song danger = new Song("Danger", "Offset", "FATHER OF 4");

        Playlist playlist = new Playlist("My Playlist");
        playlist.addSongs(barbieGirl, calling, noHeart, annihilate, danger);
        freeUser.addPlaylist(playlist);
        freeUser.likeSong(barbieGirl, calling, noHeart, danger);


        SpotifyPlayer spotifyPlayer = new SpotifyPlayer();
        spotifyPlayer.reproductor(freeUser);
    }
}
