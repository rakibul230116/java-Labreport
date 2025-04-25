package Labreport.L37;

import javax.swing.*;
import java.awt.*;

// Class that represents the frame (container) and its components
class MyFrame extends JFrame {
    private JButton button;
    private JLabel label;

    // Constructor to set up the UI components
    public MyFrame() {
        // Set the title and default close operation
        super("Swing Example with Association");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create components
        button = new JButton("Click Me");
        label = new JLabel("Hello World!");

        // Add action listener to button (association with action)
        button.addActionListener(e -> label.setText("Button Clicked"));

        // Layout setup
        setLayout(new FlowLayout());
        add(button);
        add(label);

        setVisible(true);
    }
}


public class javaSwing {
    public static void main(String[] args) {

        new MyFrame();
    }
}

