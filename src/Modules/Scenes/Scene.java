package Modules.Scenes;

import Modules.Entity;

public abstract class Scene extends Entity
{
    String description;

    Scene(String name, String description)
    {
        super(name);
    }
    
}
