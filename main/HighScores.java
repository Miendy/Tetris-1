package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class HighScores extends JPanel {
    private BufferedImage background;
    private BufferedImage template;
    private JTextArea textarea;



    public HighScores(JFrame frame){
        super.setBackground(Color.GREEN);
        this.textarea = new JTextArea("High Scores");
        super.add(this.textarea);

        String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};

        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", 5, Boolean.FALSE},
                {"John", "Doe",
                        "Rowing", 3, Boolean.TRUE},
                {"Sue", "Black",
                        "Knitting", 2, Boolean.FALSE},
                new Object[]{"Jane", "White",
                        "Speed reading", 20, Boolean.TRUE},
                {"Joe", "Brown",
                        "Pool", 10, Boolean.FALSE}
        };

        JTable table = new JTable(data, columnNames);
        super.add(table);

    }
}
