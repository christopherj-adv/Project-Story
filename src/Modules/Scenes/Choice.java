package Modules.Scenes;
import Modules.Characters.*;

public class Choice
{
    String text;

    Scene linkIn;
    Scene parent;
    Scene linkOut;
    
    SkillCheck skillCheck; // Controls whether the character meets the criteria for this choice to be visible to the user.


    Choice(String text, Scene linkIn, Scene parent, Scene linkOut)
    {
        this.text = text;
        this.linkIn = linkIn;
        this.parent = parent;
        this.linkOut = linkOut;

        skillCheck = null;
    }

    Choice(String text, Scene linkIn, Scene parent, Scene linkOut, SkillCheck skillCheck)
    {
        this.text = text;
        this.linkIn = linkIn;
        this.parent = parent;
        this.linkOut = linkOut;
        this.skillCheck = skillCheck;
    }

    boolean isVisible(Player c)
    {
        // For choices with no skill checks.
        if (skillCheck == null)
        {
            return true;
        }

        if (skillCheck.testCheck(c))
        {
            return true;
        }

        return false;
    }
}
