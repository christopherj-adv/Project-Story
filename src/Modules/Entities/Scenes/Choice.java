package Modules.Entities.Scenes;

import Modules.Entities.Entity;

public class Choice extends Entity
{
    int linkOut; // The scene (by id) this choice links to.
    
    public Choice(String text, int linkOut)
    {
        super(text);
        this.linkOut = linkOut;
    }

    public int getLinkOut()
    {
        return linkOut;
    }
}
