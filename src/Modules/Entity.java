package Modules;
    /*
        This is the most generic "Object." Characters, Scenes, and Items all extend this.
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
