import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Modules.Scenes.*;

public class PSGUI extends WindowAdapter
{
    JFrame windowFrame;
    JPanel windowPanel;

    FlowLayout fl = new FlowLayout();

    String sceneTitle;
    String sceneText;

    JTextPane titlePane;

    PSGUI()
    {
        // Sets up windowFrame
        windowFrame = new JFrame("Project Story");
        windowFrame.setSize(750, 650);
        windowFrame.addWindowListener(this); // Lets the window and the program interact
        
        
        
        // Sets up windowPanel
        windowPanel = new JPanel();
        windowFrame.add(windowPanel, BorderLayout.CENTER);
        windowPanel.setBackground(Color.black);

        // Set Title Text Pane
        titlePane = new JTextPane();
        windowPanel.add(titlePane);
        titlePane.setBackground(Color.black);
        titlePane.setForeground(Color.white);
        titlePane.setEditable(false);

        titlePane.setFont(new Font("Comic Sans MS", Font.BOLD, 20));


        titlePane.setText("example");

        windowFrame.setVisible(true);

    }

    void updateScene(Scene sc)
    {

    }


    // Ensures program ends when window is closed.
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}
