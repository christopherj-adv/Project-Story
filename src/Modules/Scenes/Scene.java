package Modules.Scenes;

import Modules.Entity;

public abstract class Scene extends Entity
{
    String description;
    Choice[] options;

    Scene(String name, String description)
    {
        super(name);
        this.description = description;
    }
    Scene(String name, String description, Choice[] options)
    {
        super(name);
        this.description = description;
        this.options = options;
    }

    void addChoice()
    {
        // TODO: Add choices to array here.
    }
}
