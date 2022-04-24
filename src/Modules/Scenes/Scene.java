package Modules.Scenes;
import java.util.ArrayList;

import Modules.Entity;

public class Scene extends Entity
{
    String sceneText;
    ArrayList<Choice> choices;

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


    }

    void addChoice(String choiceDescription, SkillCheck sCheck)
    {
        if (sCheck != null)
        {
            
        }
    }
    String[] getChoices()
    {

    }
}
