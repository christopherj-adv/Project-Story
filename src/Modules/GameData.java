package Modules;

// Whether this class is needed remains to be seen. The theory is that it will hold information that will be used to write to disk later.

public class GameData
{
    private byte[] data;
    
    public void generateDataBytes(Entity data) // Generates data based "data" variable, which should be an instance of an Entity-extending Class.
    {
        
    }

    void createDataFromScene()
    {
        /*
            List of variables to track:
                - Name
                - Description
                - 

        */
    }


    public byte[] getData()
    {
        return data;
    }
}
