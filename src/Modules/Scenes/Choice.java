package Modules.Scenes;
import Modules.Entity;
import Modules.Characters.*;

public class Choice extends Entity
{
    String text;

    int linkOut; // The scene this choice links to.
    
    SkillCheck skillCheck; // Controls whether the character meets the criteria for this choice to be visible to the user.


    public Choice(String text, int linkOut)
    {
        super(text);
        this.linkOut = linkOut;

        skillCheck = null;
    }

    public Choice(String text, int linkOut, SkillCheck skillCheck)
    {
        super(text);
        this.linkOut = linkOut;
        
        this.skillCheck = skillCheck;
    }

    boolean isVisible(Player p)
    {
        // For choices with no skill checks.
        if (skillCheck == null)
        {
            return true;
        }

        if (skillCheck.testCheck(p))
        {
            return true;
        }

        return false;
    }
}
