package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class HighScores extends JPanel {
    private BufferedImage background;
    private BufferedImage template;
    private JLabel label;



    public HighScores(JFrame frame){
        super.setBackground(Color.GREEN);
        JPanel panel = new JPanel(new BorderLayout());
        this.label = new JLabel("High Scores");
        //this.label.setEditable(false);
        //this.label.setSize(100, 20);
        //super.add(this.label);
        panel.add(label, BorderLayout.CENTER);

        String[] columnNames = {"Position", "Name", "Score"};

        Object[][] data = {
                {1, "Player1", 8756},

                {2, "Player2", 865},

                {3, "Player3", 534},

                {4, "Player4", 98},

                {5, "Player5", 8}
        };


        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        panel.add(scrollPane);
        super.add(scrollPane);

    }
}
