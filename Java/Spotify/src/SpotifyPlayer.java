import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class SpotifyPlayer extends Spotify {
    private int limiteCanciones = 1;

    public void reproductor(User user) {
        SpotifyPlayer player = new SpotifyPlayer();
        String carpetaMusica = "C:\\Users\\USER\\projects\\Java\\Spotify\\src\\Songs";

        File carpeta = new File(carpetaMusica);
        File[] archivos = carpeta.listFiles();
        int contadorCanciones = 0;


        for (File archivo : archivos) {
            if (!reproducir(archivo)) {
                continue;
            }
            String rutaArchivo = archivo.getAbsolutePath();
            Playlist playlist = new Playlist("My Playlist");
            Song song = new Song(archivo.getName(), "Unknown Artist", "Unknown Album");
            playlist.addSong(song);

            player.playlists.add(playlist);
            player.reproducirArchivoMP3(rutaArchivo);

            if (user instanceof FreeUser) {
                if (limiteAlcanzado(contadorCanciones)) {
                    player.mostrarPublicidad();
                }
                contadorCanciones++;
            }

        }
    }

    public void reproducirArchivoMP3(String rutaArchivo) {
        try {
            FileInputStream fis = new FileInputStream(rutaArchivo);
            BufferedInputStream bis = new BufferedInputStream(fis);
            Player player = new Player(bis);

            System.out.println("Reproduciendo: " + rutaArchivo);

            // Reproduce el archivo MP3
            player.play();

            System.out.println("Terminado " + "ʕ•́ᴥ•̀ʔっ");
        } catch (Exception e) {
            System.out.println("Error al reproducir el archivo: " + rutaArchivo);
            e.printStackTrace();
        }
    }

    public void mostrarPublicidad() {
        System.out.println("Mostrando publicidad...");

        // Ruta del archivo de audio de publicidad
        String rutaPublicidad = "C:\\Users\\USER\\projects\\Java\\Spotify\\src\\Publicidad\\Anuncios.mp3";

        try {
            FileInputStream fis = new FileInputStream(rutaPublicidad);
            BufferedInputStream bis = new BufferedInputStream(fis);
            Player player = new Player(bis);

            System.out.println("Reproduciendo publicidad...");

            // Reproduce el archivo de audio de publicidad
            player.play();

            System.out.println("Publicidad finalizada.");
        } catch (Exception e) {
            System.out.println("Error al reproducir la publicidad: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static boolean reproducir(File archivo) {
        return archivo.isFile() && archivo.getName().endsWith(".mp3");
    }

    private static boolean thereIs(File[] archivos) {
        return archivos != null;
    }

    private boolean limiteAlcanzado(int contadorCanciones) {
        return contadorCanciones % limiteCanciones == 0 && contadorCanciones > 0;
    }

}

