package Modules.Entities.Scenes;

import Modules.Entities.Entity;

import java.util.ArrayList;




public class Scene extends Entity
{
    String sceneText;
    ArrayList<Choice> choices; // The choices that show up in each scene (i.e. what you can do)

    final private int id; // Scene unique identifier

    public Scene(String name, String description, int id)
    {
        super(name);
        this.sceneText = description;
        this.id = id;

        choices = new ArrayList<Choice>();
    }

    public void addChoice(Choice c)
    {
        choices.add(c);
    }

    public ArrayList<Choice> getChoices()
    {
        return choices;
    }

    public Choice getChoiceByName(String text)
    {
        if (choices.size() > 0)
        {
            for (Choice choice : choices)
            {
                if (choice.getName().equals(text))
                {
                    return choice;
                }
            }
        }

        return null;
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
