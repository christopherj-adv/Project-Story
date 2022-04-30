import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Modules.Scenes.*;

public class PSGUI extends WindowAdapter
{
    JFrame windowFrame;
    JPanel windowPanel;

    FlowLayout fl = new FlowLayout();

    JTextArea titleText;
    JTextArea sceneText;

    PSGUI()
    {
        // Initialize window frame
        windowFrame = new JFrame("Project Story");
        windowFrame.setSize(750, 650);
        windowFrame.addWindowListener(this); // Lets the window and the program interact
        
        // Initialize window panel
        windowPanel = new JPanel();
        windowFrame.add(windowPanel, BorderLayout.NORTH);
        windowPanel.setBackground(Color.black);

        // Initialize title text
        titleText = new JTextArea();
        windowPanel.add(titleText, BorderLayout.NORTH);
        titleText.setBackground(Color.black);
        titleText.setForeground(Color.white);
        titleText.setEditable(false);
        titleText.setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        // Initialize scene text
        sceneText = new JTextArea();
        windowPanel.add(sceneText, BorderLayout.SOUTH);
        sceneText.setBackground(Color.white);
        sceneText.setForeground(Color.black);
        sceneText.setEditable(false);
        sceneText.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        sceneText.setLineWrap(true);

        windowFrame.setVisible(true);
    }

    void updateScene(Scene sc)
    {
        titleText.setText(sc.getName());
        sceneText.setText(sc.getSceneText());
    }


    // Ensures program ends when window is closed.
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
