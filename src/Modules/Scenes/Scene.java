package Modules.Scenes;

import Modules.Entity;
import Modules.Characters.*;

import java.util.ArrayList;

public class Scene extends Entity
{
    String sceneText;
    ArrayList<Choice> choices; // The choices that show up in each scene (i.e. what you can do)
    ArrayList<Choice> activeChoices; // Only the ones that pass skillchecks

    Scene(String name, String description)
    {
        super(name);
        this.sceneText = description;
    }
    Scene(String name, String description, Choice[] options)
    {
        super(name);
        this.sceneText = description;

        choices = new ArrayList<Choice>();

        for (int i = 0; i < options.length; i++)
        {
            choices.add(options[i]);
        }
    }

    // Set up the scene to be displayed
    void activateScene(Player c)
    {
        for (int i = 0; i < choices.size(); i++)
        {
            Choice curChoice = choices.get(i);

            if (curChoice.isVisible(c))
            {
                activeChoices.add(curChoice);
            }
        }

    }

    String getChoices()
    {
        int cs = choices.size();

        if (cs == 0)
        {
            return null;
        }

        StringBuilder sb = new StringBuilder(); // Will be used to assemble the list of choices.

        for (int i = 0; i < cs; i++)
        {
            Choice curChoice = choices.get(i);
            sb.append(i + ". " + curChoice.text);
        }

        return sb.toString();
    }
}
