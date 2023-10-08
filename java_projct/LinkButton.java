import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinkButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Open Link Example");
        JPanel panel = new JPanel();

        JButton openButton = new JButton("Open Link");
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Define the URL you want to open
                String url = "https://www.google.com";

                try {
                    // Create a URI object from the URL string
                    URI uri = new URI(url);

                    // Check if the Desktop class is supported (works on Windows, macOS, and Linux)
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();

                        // Check if the browser is supported (not all platforms have a registered browser)
                        if (desktop.isSupported(Desktop.Action.BROWSE)) {
                            // Open the URL in the default web browser
                            desktop.browse(uri);
                        } else {
                            System.out.println("No browser support");
                        }
                    } else {
                        System.out.println("Desktop not supported");
                    }
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

        panel.add(openButton);
        frame.add(panel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
