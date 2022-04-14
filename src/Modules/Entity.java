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

    // Abstract Methods:
    public abstract Data createData(); // Used to generate the data needed to recreate an instance of this entity. Should return data that can be written to file.
    public abstract String getClassName(); // Used particularly to help write to file so that the right type of object is instatiated.
    
    
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
