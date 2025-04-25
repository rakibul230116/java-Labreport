package Labreport.L35;

import java.awt.*;
import java.awt.event.*;

public class AbstractWindow extends Frame {


    TextField searchBox;
    Button pressButton;

    public AbstractWindow () {
        // Set window properties
        setTitle("Search Box and Button");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setVisible(true);


        searchBox = new TextField(20); // 20 columns width
        add(searchBox);

        // Create the "Press Text" button
        pressButton = new Button("Press Text");
        add(pressButton);


        pressButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchText = searchBox.getText(); // Get text from search box
                System.out.println("You searched for: " + searchText);
            }
        });


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        new AbstractWindow ();
    }
}
