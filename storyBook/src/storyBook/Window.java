package storyBook;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Window {
	
	Font gameFont = new Font("Ariel Black", java.awt.Font.BOLD, 18);
	Font buttonFont = new Font("Ariel Black", java.awt.Font.BOLD, 28);

    JFrame frame = new JFrame();
    Container c;

    JPanel gamePicPanel = new JPanel();
    JPanel gameTextPanel = new JPanel();
    JPanel backButtonPanel = new JPanel();
    JPanel nextButtonPanel = new JPanel();

    JButton backButton = new JButton("Back");
    JButton nextButton = new JButton("Next");

    JTextArea gameText = new JTextArea();

    JLabel gamePicLabel = new JLabel();

    // All page images
    public ImageIcon cover;
    public ImageIcon page1;
    public ImageIcon page2;
    public ImageIcon page3;
    public ImageIcon page4;
    public ImageIcon page5;
    public ImageIcon page6;
    public ImageIcon page7;
    public ImageIcon page8;

    public void createStoryWindow() {
        loadImages();

        // Frame setup
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // Image panel
        gamePicPanel.setLayout(new BorderLayout());
        gamePicPanel.setBounds(100, 50, 600, 200);
        gamePicPanel.setBackground(Color.blue);
        gamePicPanel.add(gamePicLabel);

        // Text area
        gameText.setEditable(false);
        gameText.setLineWrap(true);
        gameText.setWrapStyleWord(true);
        gameText.setFont(gameFont);

        gameTextPanel.setLayout(new BorderLayout());
        gameTextPanel.setBounds(100, 250, 600, 100);
        //gameTextPanel.setBackground(Color.blue);
        gameTextPanel.add(gameText);

        // Back button
        backButton.setFont(buttonFont);
        backButtonPanel.setBounds(100, 400, 100, 50);
        //backButtonPanel.setBackground(Color.blue);
        backButtonPanel.add(backButton);

        // Next button
        nextButton.setFont(buttonFont);
        nextButtonPanel.setBounds(600, 400, 100, 50);
        //nextButtonPanel.setBackground(Color.blue);
        nextButtonPanel.add(nextButton);

        // Add all to frame
        c = frame.getContentPane();
        c.add(gamePicPanel);
        c.add(gameTextPanel);
        c.add(backButtonPanel);
        c.add(nextButtonPanel);

        frame.setVisible(true);
    }

    private void loadImages() {
        try {
            cover = new ImageIcon(ImageIO.read(new File("res/GamePic/bookCover.png")));
            page1 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookCover.png")));
            page2 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookPage2.png")));
            page3 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookPage3.png")));
            page4 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookPage4.png")));
            page5 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookPage5.png")));
            page6 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookPage6.png")));
            page7 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookPage7.png")));
            page8 = new ImageIcon(ImageIO.read(new File("res/GamePic/bookPage8.png")));
        } catch (IOException e) {
            System.out.println("Failed to load one or more images.");
            e.printStackTrace();
        }
    }

    public void setButtonHandler(ButtonHandler bh) {
        backButton.addActionListener(bh);
        nextButton.addActionListener(bh);
    }
}
