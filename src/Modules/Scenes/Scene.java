package Modules.Scenes;
import java.util.ArrayList;

import Modules.Entity;

public class Scene extends Entity
{
    String description;
    ArrayList<Choice> choices;

    Scene(String name, String description)
    {
        super(name);
        this.description = description;
    }
    Scene(String name, String description, Choice[] options)
    {
        super(name);
        this.description = description;
        
        choices = new ArrayList<Choice>();


    }

    void addChoice()
    {

        // TODO: Add choices to array here.
    }
}
