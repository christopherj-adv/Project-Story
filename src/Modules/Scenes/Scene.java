package Modules.Scenes;

import Modules.Entity;
import Modules.Characters.*;

import java.util.ArrayList;

public class Scene extends Entity
{
    String sceneText;
    ArrayList<Choice> choices; // The choices that show up in each scene (i.e. what you can do)
    ArrayList<Choice> activeChoices; // Only the ones that pass skillchecks

    int id; // Scene unique identifier

    public Scene(String name, String description, int id)
    {
        super(name);
        this.sceneText = description;
        this.id = id;

        choices = new ArrayList<Choice>();
    }
    public Scene(String name, String description, int id, Choice[] options)
    {
        super(name);
        this.sceneText = description;
        this.id = id;

        choices = new ArrayList<Choice>();

        for (int i = 0; i < options.length; i++)
        {
            choices.add(options[i]);
        }
    }

    public void addChoice(Choice c)
    {
        choices.add(c);
    }

    // Set up the choices to be displayed
    public void activateScene(Player p)
    {
        if (choices == null)
        {
            return;
        }
    
    
        activeChoices = new ArrayList<Choice>();
    
        for (int i = 0; i < choices.size(); i++)
        {
            Choice curChoice = choices.get(i);

            if (curChoice.isVisible(p))
            {
                activeChoices.add(curChoice);
            }
        }
    }

    // List of choices that pass skill checks.
    public Choice[] getActiveChoices()
    {
        if (activeChoices == null || activeChoices.size() < 0)
        {
            return null;
        }

        Choice[] choices = new Choice[activeChoices.size()];

        for (int i = 0; i < activeChoices.size(); i++)
        {
            choices[i] = activeChoices.get(i);    
        }

        return choices;
    }

    public String getSceneText()
    {
        return sceneText;
    }

    public int getId()
    {
        return id;
    }
}
