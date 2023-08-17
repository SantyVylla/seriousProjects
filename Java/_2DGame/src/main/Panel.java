package main;
import entity.Player;
import tile.TileManager;
import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable{

    //Screen settings
    final int originalTileSize = 16;  // size of the character or tile in pixels
    final int scale = 3;  // The scale of the window for make it bigger

    public final int tileSize = originalTileSize * scale;  // The size show in the screen
    public final int maxScreenCol = 16;  // columns of the screen in tiles
    public final int maxScreenRow = 12;  // rows of the screen in tiles
    public final int screenWidth = maxScreenCol * tileSize;  // 768
    public final int screenHeight = maxScreenRow * tileSize;  // 576

    //World parameters
    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;
    public final int worldWidth = maxWorldCol * tileSize;
    public final int worldHeight = maxWorldRow * tileSize;

    //Fps
    int fps = 60;

    KeyHandler keyH = new KeyHandler();  // Create a new key handler
    public Player player = new Player(this, keyH);  // Create a new player
    Thread gameThread;  // The thread that the game runs on (the game loop)
    TileManager tileM = new TileManager(this);


    public Panel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));  // Set the size of the panel
        this.setBackground(Color.BLACK);  // Set the background color of the panel
        this.setDoubleBuffered(true);    // Set double buffering to true, improves performance
        this.addKeyListener(keyH);  // Add the key listener to the panel
        this.setFocusable(true);  // Allow the panel to receive input
    }

    public void startGameThread() {
        gameThread = new Thread(this);  // Create a new thread
        gameThread.start();  // Start the thread
    }

    @Override
    public void run() {
        double drawInterval = 1000000000.0 / fps;  // The amount of time in nanoseconds between each frame
        double delta = 0;
        long lastDrawTime = System.nanoTime();  // The time in nanoseconds at the last frame
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastDrawTime) / drawInterval;
            lastDrawTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }


        }
    }

    public void update() {
        player.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call the paintComponent method of the parent class
        Graphics2D g2d = (Graphics2D) g;  // Cast the graphics object to a Graphics2D object
        tileM.draw(g2d);
        player.paintComponent(g2d);  // Call the paintComponent method of the player
        g2d.dispose(); // Release system resources used
    }
}
