package Labreport.L38;

import javax.swing.*;
import java.awt.*;

class CustomList extends JList<String> {
    public CustomList(String[] items) {
        super(items);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @Override
    public void updateUI() {
        super.updateUI();
        setBackground(Color.LIGHT_GRAY);
        setSelectionBackground(Color.GREEN);
        setSelectionForeground(Color.WHITE);
    }
}

public class javaswing {
    public static void main(String[] args) {
        String[] items = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape"};
        CustomList fruitList = new CustomList(items);
        JScrollPane listScrollPane = new JScrollPane(fruitList);
        JFrame frame = new JFrame("Custom JList Example with Inheritance");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        frame.add(listScrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
