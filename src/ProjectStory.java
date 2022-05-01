import Modules.Characters.Player;
import Modules.Scenes.Choice;
import Modules.Scenes.Scene;
import Modules.Scenes.SceneDirectory;

public class ProjectStory
{
    // Game runner
    Player  userPlayer;
    PSGUI window;

    SceneDirectory sceneDirectory;

    ProjectStory(SceneDirectory story)
    {

        this.sceneDirectory = story;

        window = new PSGUI();
        userPlayer = new Player(System.getProperty("user.name"), 10, 10, 1, 5, 5, 5, 5);


        


        window.updateScene(sceneDirectory.getSceneByIdx(0), userPlayer);



        StringBuilder sb = new StringBuilder();

        

    }

    public static void main(String[] args)
    {
        new ProjectStory(new SceneDirectory(true));
    }
}
