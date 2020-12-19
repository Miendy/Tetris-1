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
//        super.setBackground(Color.blue);

        try {
            this.background = ImageIO.read(this.getClass().getResource("/backgrounds/background2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }



        //JFrame frame1 = new JFrame("High Score");
        JPanel panel = new JPanel(new BorderLayout());
        this.label = new JLabel("High Scores");
        //this.label.setEditable(false);
        //this.label.setSize(100, 20);
        //super.add(this.label);
        //panel.add(label, BorderLayout.CENTER);
        JPanel outerPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());

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
        //table.setFillsViewportHeight(true);

        topPanel.add(this.label, BorderLayout.PAGE_START);
        topPanel.add(scrollPane, BorderLayout.CENTER);


        //panel.add(scrollPane);
        //scrollPane.setSize(100,100);

        outerPanel.add(topPanel);
        super.add(outerPanel);

        //super.add(scrollPane);
        //frame.add(panel);
        //super.add(frame);

//        JFrame frame = new JFrame("Play");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JPanel outerPanel = new JPanel(new BorderLayout());
//        JPanel topPanel = new JPanel(new BorderLayout());
//        JLabel label = new JLabel("Enter proper data: ");
//        xxJButton btn = new JButton("Click");
//        String data [][] = new String [100][4];
//        String column[]={"No.","Player 1","Player 2","Strategy"};
//        JTable table = new JTable(data, column);
//        JScrollPane sp=new JScrollPane(table);
//        topPanel.add(label, BorderLayout.PAGE_START);
//        topPanel.add(sp, BorderLayout.CENTER);
//        xxtopPanel.add(btn, BorderLayout.PAGE_END);
//        outerPanel.add(topPanel);
//        frame.add(outerPanel);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);

    }


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(this.background, 0, 0, null);
    }
}
