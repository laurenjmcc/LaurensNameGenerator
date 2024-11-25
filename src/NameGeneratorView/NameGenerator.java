package NameGeneratorView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NameGenerator extends JFrame {
    public NameGenerator() {
        // Constructor code will go here
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new NameGenerator().setVisible(true);
        });
    }
}
