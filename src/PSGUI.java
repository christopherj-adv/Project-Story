import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Modules.Scenes.*;

public class PSGUI extends WindowAdapter
{
    JFrame windowFrame;

    JPanel titleTextPanel;
    JPanel sceneTextPanel;
    JPanel infoPanel;
    JPanel choiceTextPanel;    

    JTextArea titleText;
    JTextArea sceneText;
    JTextArea infoText;


    PSGUI()
    {
        // Initialize window frame
        windowFrame = new JFrame("Project Story");
        windowFrame.setSize(750, 650);
        windowFrame.addWindowListener(this); // Lets the window and the program interact.

        // Initialize panels and their respective settings.
        titleTextPanel = new JPanel();
        sceneTextPanel = new JPanel();
        infoPanel = new JPanel();
        choiceTextPanel = new JPanel();

        titleTextPanel.setBackground(Color.black);
        sceneTextPanel.setBackground(Color.black);
        infoPanel.setBackground(Color.black);
        choiceTextPanel.setBackground(Color.black);

        // Add these panels to the frame.
        windowFrame.add(titleTextPanel, BorderLayout.NORTH);
        windowFrame.add(sceneTextPanel, BorderLayout.WEST);
        windowFrame.add(infoPanel, BorderLayout.EAST);
        windowFrame.add(choiceTextPanel, BorderLayout.SOUTH);


        // Initialize text objects and basic settings / fonts.
        titleText = new JTextArea();
        sceneText = new JTextArea();
        infoText = new JTextArea();

        titleTextPanel.add(titleText);
        sceneTextPanel.add(sceneText);
        infoPanel.add(infoText);

        
        titleText.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        sceneText.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        infoText.setFont(new Font("Comic Sans MS", Font.BOLD, 16));



        sceneText.setAlignmentX(JTextArea.LEFT_ALIGNMENT);



        sceneText.setLineWrap(true);

        sceneText.setSize(625, 100);

        






        JButton xd = new JButton();
        xd.setText("ksnadfolasn");

        choiceTextPanel.add(xd);
        

        titleText.setEditable(false);
        sceneText.setEditable(false);
        
       


        windowFrame.setVisible(true);
    }

    void updateScene(Scene sc)
    {
        titleText.setText(sc.getName());
        sceneText.setText(sc.getSceneText());
        infoText.setText("hdiojafbojs");
    }


    // Ensures program ends when window is closed.
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
