package Modules;
import Modules.Color.Color;

    /*
        This is the most generic "Object." Characters, Scenes, and Items all extend this.

    */

public interface Entity
{
    Data createData(); // Used to generate the data needed to recreate an instance of this entity. Should return data that can be written to file.

    String getName();
    String getClassName(); // Used particularly to help write to file so that the right type of object is instatiated.
}
