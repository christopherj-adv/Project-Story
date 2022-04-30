import Modules.Characters.Player;
import Modules.Scenes.Choice;
import Modules.Scenes.Scene;

public class ProjectStory
{
    // Game runner
    Player p = new Player("Player");
    PSGUI window;

    ProjectStory()
    {
        window = new PSGUI();

        Scene gameover = new Scene("Exit", "You have met a terrible fate!", 0);
        Choice exit = new Choice("Exit", gameover, null);

        Scene example = new Scene("The Forest", "You wake up in small pool of water in a forest. The sky is overcast, but small rays of sunlight peek through the clouds.", 1);
        Choice exampleA = new Choice("Stand up and dust yourself off.", null, null);
        
        window.updateScene(example);

    }

    public static void main(String[] args)
    {
        new ProjectStory();
    }
}
