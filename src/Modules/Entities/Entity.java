package Modules.Entities;
    /*
        This is the most generic game object. Characters, Scenes, and Items all extend this.
    */

public abstract class Entity
{
    String name;

    public Entity(String name)
    {
        this.name = name;
    }

    // Public Setters:
    public void setName(String name)
    {
        this.name = name;
    }
    
    // Public Getters:
    public String getName()
    {
        return name;
    }
}
