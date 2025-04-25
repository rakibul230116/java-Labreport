package Labreport.L36;

import java.awt.*;
import java.awt.event.*;

class abstractWindow implements ActionListener {
    private Frame frame;
    private TextField textField;
    private Label outputLabel;

    public abstractWindow() {
        frame = new Frame();
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);
        frame.setSize(350, 350);
        frame.setLocationRelativeTo(null);

        // Button
        Button b = new Button("Click Here");
        b.setBounds(100, 200, 100, 30);
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);

        // Label
        Label label = new Label("Enter text:");
        label.setBounds(30, 100, 80, 30);

        // TextField
        textField = new TextField();
        textField.setBounds(120, 100, 150, 30);

        // Output Label
        outputLabel = new Label("");
        outputLabel.setBounds(30, 250, 200, 30);
        outputLabel.setForeground(Color.BLACK);

        // Add components to frame
        frame.add(b);
        frame.add(label);
        frame.add(textField);
        frame.add(outputLabel);

        // Window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = textField.getText();
        outputLabel.setText("You entered: " + inputText);
    }

    public static void main(String[] args) {
        new abstractWindow();
    }
}