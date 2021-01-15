package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HighScores extends JPanel {
    private BufferedImage background;
    private BufferedImage template;
    private JLabel label;
    private JFrame frame;


    public HighScores(JFrame frame){
//        super.setBackground(Color.blue);

        try {
            this.background = ImageIO.read(this.getClass().getResource("/backgrounds/background2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        JPanel panel = new JPanel(new BorderLayout());
        this.label = new JLabel("High Scores");

        JPanel outerPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());

        String[] columnNames = {"Position", "Name", "Score"};

        ArrayList<String> playerNames = new ArrayList<String>();
        ArrayList<Integer> playerScores = new ArrayList<Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader("scores.txt"))) {
            for(String line; (line = br.readLine()) != null; ) {
                String[] scores = line.split(":");
                String playerName = scores[0];
                playerNames.add(playerName);
                int playerScore = Integer.parseInt(scores[1]);
                playerScores.add(playerScore);
                //System.out.println(playerName+" == "+ playerScore);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Object[][] data = {
                {1, playerNames.get(0), playerScores.get(0)},

                {2, playerNames.get(1), playerScores.get(1)},

                {3, playerNames.get(2), playerScores.get(2)},

                {4, playerNames.get(3), playerScores.get(3)},

                {5, playerNames.get(4), playerScores.get(4)}
        };

        
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        //table.setFillsViewportHeight(true);

        topPanel.add(this.label, BorderLayout.PAGE_START);
        topPanel.add(scrollPane, BorderLayout.CENTER);

        outerPanel.add(topPanel);
        super.add(outerPanel);



    }


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(this.background, 0, 0, null);
    }
}
