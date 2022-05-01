package Modules.Scenes;

import java.util.ArrayList;


/*
    This class serves the purpose of cataloging all of the scenes so they can be retreived by the main program.
    It's currently very useful because it hides all of the bulky text from the main program, allowing space to be conserved for just the logic.
    For the time being, a value of true will be used here to auto-generate a story. In the future, I'd like to implement the saving and loading of progress using this class.
*/

public class SceneDirectory
{

    int currentScene;
    ArrayList<Scene> directory;

    public SceneDirectory(boolean useDefaultStory)
    {
        if (useDefaultStory)
        {
            directory = new ArrayList<Scene>();

            directory.add(new Scene(
                "Exit",
                "A small sidewinder snake sneaks up on you and bites your leg! Miles from the nearest cleric and with no potions in sight, you succumb to the venom and enter a long, deep sleep.",
                0));
            
            directory.add(new Scene(
                "The Forest",
                "You wake up in small pool of water in a forest. The sky is overcast, but just enough sunlight peeks through for you to see the surrounding nature.",
                1));
            
                directory.add(new Scene(
                "Deeper into the forest...",
                "As you walk further along, you notice a once distant hissing sound get louder and louder.",
                2));



            // The Forest Choices
            addChoice(new Choice("Stand up and dust yourself off.", 2), 2);
            addChoice(new Choice("Go back to sleep.", 1), 0); // gameover
            
            // Deeper into the forest... Choices
            addChoice(new Choice("A snake has just appeared!", -1), -1);


            // gameover
            addChoice(new Choice("Start over.", 1), 0);




        }
    }
    public void addScene(Scene s)
    {
        if (directory.contains(s))
        {
            return;
        }
        else
        {
            directory.add(new Scene(s.getName(), s.getSceneText(), directory.size()));
        }
    }
    public void addChoice(Choice c, int idx)
    {
        Scene s = getSceneByIdx(idx);

        if (s != null)
        {
            s.addChoice(c);
        }
    }
    public Scene getSceneByIdx(int idx)
    {
        if (directory.size() < idx)
        {
            return null;
        }
        else
        {
            return directory.get(idx);
        }
    }
}
