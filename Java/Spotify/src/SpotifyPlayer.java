import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class SpotifyPlayer extends Spotify {

    public void reproductor() {
        SpotifyPlayer player = new SpotifyPlayer();
        String carpetaMusica = "C:\\Users\\USER\\projects\\Java\\Spotify\\src\\Songs";

        File carpeta = new File(carpetaMusica);
        File[] archivos = carpeta.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().endsWith(".mp3")) {
                    String title = archivo.getName().substring(0, archivo.getName().lastIndexOf(".mp3"));
                    String artist = "Unknown Artist";
                    String album = "Unknown Album";

                    Song song = new Song(title, artist, album);

                    Playlist playlist = new Playlist("Default Playlist");
                    playlist.addSong(song);

                    player.playlists.add(playlist);

                    player.reproducirArchivoMP3(archivo.getAbsolutePath());
                }
            }
        }

        player.play();
    }

    public void reproducirArchivoMP3(String rutaArchivo) {
        try {
            FileInputStream fis = new FileInputStream(rutaArchivo);
            BufferedInputStream bis = new BufferedInputStream(fis);
            Player player = new Player(bis);

            System.out.println("Reproduciendo: " + rutaArchivo);

            // Reproduce el archivo MP3
            player.play();

            System.out.println("Terminado: " + rutaArchivo);
        } catch (Exception e) {
            System.out.println("Error al reproducir el archivo: " + rutaArchivo);
            e.printStackTrace();
        }
    }
}

