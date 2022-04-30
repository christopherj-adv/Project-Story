import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import Modules.Characters.Player;
import Modules.Scenes.*;
import Modules.Scenes.Choice;

public class PSGUI extends WindowAdapter
{
    JFrame windowFrame;

    JPanel titleTextPanel;
    JPanel sceneTextPanel;
    JPanel choiceButtonPanel;    
    JPanel infoPanel;

    JTextArea titleText;
    JTextArea sceneText;
    JTextArea infoText;
    JPanel emptySpace; // Covers extra space that would otherwise look white.

    PSGUI()
    {
        // Initialize window frame
        windowFrame = new JFrame("Project Story");
        windowFrame.setSize(750, 750);
        windowFrame.addWindowListener(this); // Lets the window and the program interact.

        // Initialize panels and their respective settings.
        titleTextPanel = new JPanel();
        sceneTextPanel = new JPanel();
        choiceButtonPanel = new JPanel();
        infoPanel = new JPanel();
        emptySpace = new JPanel();

        titleTextPanel.setBackground(Color.black);
        sceneTextPanel.setBackground(Color.black);
        infoPanel.setBackground(Color.black);
        choiceButtonPanel.setBackground(Color.black);

        // Add these panels to the frame.
        windowFrame.add(titleTextPanel, BorderLayout.NORTH);
        windowFrame.add(sceneTextPanel, BorderLayout.WEST);
        windowFrame.add(choiceButtonPanel, BorderLayout.SOUTH);
        windowFrame.add(infoPanel, BorderLayout.EAST);
        windowFrame.add(emptySpace, BorderLayout.CENTER);

        emptySpace.setBackground(Color.black);

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



        sceneText.setLineWrap(true);

        // Set coloring for components
        titleText.setBackground(Color.black);
        sceneText.setBackground(Color.black);
        infoText.setBackground(Color.black);
        choiceButtonPanel.setBackground(Color.black);
        
        titleText.setForeground(Color.white);
        sceneText.setForeground(Color.white);
        infoText.setForeground(Color.white);
        choiceButtonPanel.setForeground(Color.white);

        // Set size and settings for the components
        titleText.setSize(750, 100);
        sceneText.setSize(475, 325);
        infoText.setSize(225, 325);
        choiceButtonPanel.setSize(750, 325);

        titleText.setEditable(false);
        sceneText.setEditable(false);
        
       


        windowFrame.setVisible(true);
    }

    void updateScene(Scene sc, Player p)
    {
        titleText.setText(sc.getName());
        sceneText.setText(sc.getSceneText());
        infoText.setText(p.getStatsAsString());


        // Activates the available choices.
        sc.activateScene(p);

        Choice[] choices =  sc.getActiveChoices();

        // The following code determines what grid size will be used.

        GridLayout gl;

                
        
        
        
        choiceButtonPanel.setLayout(gl);



    }

    // Ensures program ends when window is closed.
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
