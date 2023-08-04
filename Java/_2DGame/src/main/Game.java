package main;
import javax.swing.*;

public class Game {

    public void run() {
        JFrame window = new JFrame();  // Create a new window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        window.setResizable(false); // Prevent the user from resizing the window
        window.setTitle("2D Game"); // Set the title of the window

        Panel panel = new Panel(); // Create a new panel
        window.add(panel); // Add the panel to the window
        window.pack(); // Resize the window to fit the panel

        window.setLocationRelativeTo(null); // Center the window on the screen
        window.setVisible(true); // Make the window visible

        panel.startGameThread();  // Start the game thread
    }

}
