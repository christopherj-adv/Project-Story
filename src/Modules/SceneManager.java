package Modules;

import java.util.ArrayList;

import Modules.Entities.Scenes.*;

/*
    This class serves the purpose of cataloging all of the scenes so they can be retreived by the main program.
    It's currently very useful because it hides all of the bulky text from the main program, allowing space to be conserved for just the logic.
    For the time being, a value of true will be used here to auto-generate a story. In the future, I'd like to implement the saving and loading of progress using this class.
*/

public class SceneManager
{

    int currentSceneID;
    Scene currentScene;

    ArrayList<Scene> directory;

    public SceneManager(boolean useDefaultStory)
    {
        directory = new ArrayList<Scene>();

        if (useDefaultStory)
        {
            /* Format:
                directory.add(new Scene(
                    "",
                    "",
                    0));
            */

            // Main Scenes
            directory.add(new Scene(
                "Exit",
                "A small sidewinder snake sneaks up on you and bites your leg! Miles from the nearest cleric and with no potions in sight, you succumb to the venom and enter a long, deep sleep.",
                0));
            
            directory.add(new Scene(
                "Instructions",
                "To play this game, simply press on the buttons at the bottom of your screen. Have fun!",
                100));

            directory.add(new Scene(
                "The Forest",
                "You wake up in small pile of leaves in a forest. The sky is overcast, but just enough sunlight peeks through for you to see the surrounding nature.",
                1));
            
            directory.add(new Scene(
                "Deeper into the forest...",
                "As you walk further along, you notice a once distant hissing sound get louder and louder.",
                2));

            directory.add(new Scene(
                "Act quick!",
                "You suddenly pinpoint the source of the sound - it's coming from a black and gold sidewinder, which slithers its way over to you. It's rather large, for a snake, and it rears its head. It hisses sharply and takes a dive at you.",
                3));
            
            directory.add(new Scene(
                "A Quick Swipe",
                "As you swing at the snake, it makes a sudden leftward movement. It was caught off guard by your quick thinking! It drops back to the floor and starts preparing another attack...",
                11));

            directory.add(new Scene(
                "Run Away!", 
                "    Fear takes over and you start madly dashing away from the snake. You make it to a more secluded spot, and then realize the forest has gone completely quiet.\n\n    You look at your hands and see red. The snake managed to just barely nick your skin. As moving becomes more and more tiresome, you decide to rest by one of the many large trees. For your mind, time has now become an abstract concept and the color white fills your vision. You have died.", 
                12));

            directory.add(new Scene(
                "Scouring Your Bag", 
                "You quickly rummage through your bag as the serpent lurks forward. Because you had researched the kinds of wildlife this forest contained, you had decided to pack some anti-venom. You quickly down the bottle just as the snake takes a bite. You quickly grab the snake by its head and clamp its mouth shut. You make eye contact with it and it appears to be almost grinning at you...", 
                13));

            directory.add(new Scene(
                "Snatch the Snake", 
                "You grab the snake just as it makes a forward lurch. Despite your impressive reflexes, it manages to wiggle out of your grip. It then rapidly bites you and your vision goes black. You have died!", 
                14));

            directory.add(new Scene(
                "Strike again!", 
                "You lunge toward the snake and strike again and again with your stick. The snake coils up and exhales one last breath. You take off your virtual reality headset and look over at your friend. Your friend, grinning, says, \"Aw man, I totally had you there at the beggining!\"", 
                21));            

            directory.add(new Scene(
                "Show Mercy",
                "You decide to show the snake some mercy and drop the stick as a gesture. The snake seems to start... grinning. It perks up and strikes again, this time managing to bite you. Blots of black start filling your vision and you collapse to the floor. You have died!",
                22));

            directory.add(new Scene(
                "Retreat!",
                "You start running from the snake and manage to climb up a tree. The snake starts to slowly slither its way up.",
                23));

            directory.add(new Scene(
                "Jump!",
                "You decide to leap over to another tree. This proves to be a horrible idea because the nearest tree is quite far. You attempt the jump anyways and manage to grab onto the other tree's branch. Unfortunately, the branch snaps and you fall to your doom. You have died!",
                31));

            directory.add(new Scene(
                "Fighting Back",
                "You start pulling smaller branches off the tree to throw at the snake. Its somewhat reppelled at first, but it finds an opening to bite your leg. It clamps down on said leg and it pulls you down. You both fall off the tree to your dooms. You have died!",
                32));
            
            directory.add(new Scene(
                "Throw the Snake",
                "You fling the snake so hard that a cone of fire forms around it. The snake zooms out into orbit. You look at your hand in total shock, wondering where this immense power came from. You then realize that you didn't actually take anti-venom, but the experimental potion you were sent to this very forest to collect! A few moments pass and your head is struck by a fast moving object. The snake orbited the earth and collided with you! A ring of fire now surrounds the earth and starts to consume the planet. You have quite possibly chosen the worst ending. You have died.",
                41));
            
            directory.add(new Scene(
                "Drop the Snake",
                "You decide to drop the snake and run off. For some reason, your legs start moving extremely quickly and you surpass speeds upwards of 500 miles per hour. At this point, you are no longer able to slowdown nor turn fast enough to avoid the oncoming trees. Your body slams against a large tree and you disintegrate. You have died.",
                42));



            /*
                These choices get attached to the scene through the addChoice method. The scenes still point to the choices as Choice objects, while the choices point to the scenes throug their integer ID's.
            */

            // Instructions
            addChoice(new Choice("Play", 1), 100);

            // The Forest
            addChoice(new Choice("Stand up and dust yourself off.", 2), 1); // -> Deeper into the forest...
            addChoice(new Choice("Go back to sleep.", 0), 1);               // -> Gameover
            
            // Deeper into the forest...
            addChoice(new Choice("A snake has just appeared!", 3), 2);      // -> A Snake Has Appeared!

            // A Snake Has Appeared!
            addChoice(new Choice("Grab a stick and swing.", 11), 3);
            addChoice(new Choice("Turn around and run.", 12), 3);
            addChoice(new Choice("Search your bag for anti-venom.", 13), 3);
            addChoice(new Choice("Attempt to grab the snake.", 14), 3);

            // A Quick Swipe
            addChoice(new Choice("Strike the snake again.", 21), 11);
            addChoice(new Choice("Show mercy.", 22), 11);
            addChoice(new Choice("Drop the stick and retreat.", 23), 11);

            // Scouring Your Bag
            addChoice(new Choice("Throw the snake as far as possible.", 41), 13);
            addChoice(new Choice("Drop the snake and run.", 42), 13);

            // Retreat!
            addChoice(new Choice("Parkour over to another tree.", 31), 23);
            addChoice(new Choice("Pull branches to throw at the snake.", 32), 23);

            // Start over choice
            addChoice(new Choice("Start over.", 1), new int[] { 0, 12, 14, 21, 22, 31, 32, 41, 42 });

            currentSceneID = 100;
            currentScene = getSceneByID(currentSceneID);

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
    public void addChoice(Choice c, int sceneID)
    {
        // Skips choices that aren't linked to anything.
        if (sceneID == -1)
        {
            return;
        }

        Scene s = getSceneByID(sceneID);

        if (s != null)
        {
            s.addChoice(c);
        }
    }
    // For multiple scenes
    public void addChoice(Choice c, int[] sceneIDs)
    {
        for (int i = 0; i < sceneIDs.length; i++)
        {
            addChoice(c, sceneIDs[i]);
        }
    }
    public Scene getSceneByID(int id)
    {
        for (Scene scene : directory)
        {
            if (scene.getId() == id)
            {
                return scene;
            }
        }

        return null;
    }
    public int getCurrentSceneID()
    {
        return currentSceneID;
    }
    public Scene getCurrentScene()
    {
        return currentScene;
    }
    public void updateScene(Scene newScene)
    {
        if (directory.contains(newScene))
        {
            currentScene = newScene;
            currentSceneID = newScene.getId();
        }
    }
    public void updateScene(int newSceneID)
    {
        for (Scene scene : directory)
        {
            if (scene.getId() == newSceneID)
            {
                currentSceneID = newSceneID;
                currentScene = scene;
                break;
            }
        }
    }
}
