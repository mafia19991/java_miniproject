import javax.swing.*;
import java.awt.*;

public class LinkButton {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Scrollable Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a JTextArea with a large amount of text
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                    + "Pellentesque quis nunc sit amet mi semper cursus nec non ligula. "
                    + "Suspendisse potenti. Fusce vel hendrerit ligula. Sed et justo vitae arcu "
                    + "tempor vulputate.");

            // Create a JScrollPane and add the JTextArea to it
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Set the preferred size of the JScrollPane (optional)
            scrollPane.setPreferredSize(new Dimension(300, 200));

            // Add the JScrollPane to the JFrame
            frame.add(scrollPane);

            frame.setVisible(true);
        });
    }
}
