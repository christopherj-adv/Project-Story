package Modules;
    /*
        This is the most generic "Object." Characters, Scenes, and Items all extend this.
    */

public abstract class Entity
{
    String name;
    String className; // try making final
    String nameColor; // Color used when name is printed

    public Entity(String name)
    {
        this.name = name;
    }

    // Abstract Methods:
    public abstract Data createData(); // Used to generate the data needed to recreate an instance of this entity. Should return data that can be written to file.
    
    
    // Public Setters:
    public void setName(String name)
    {
        this.name = name;
    }
    public void setNameColor(String color)
    {
        nameColor = color;
    }
    // Public Getters:
    public String getName()
    {
        return name;
    }
    public String getClassName() // Used particularly to help write to file so that the right type of object is instatiated.
    {
        return className;
    }
}
