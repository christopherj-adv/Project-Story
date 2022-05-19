package Modules.Entities.Scenes;

import Modules.Entities.Characters.*;

// Used to dynamically add options in scenes.
public class SkillCheck
{
    int checkID;
    
    // Stats to check:

    int minHealth;
    int minLevel;
    int minStrength;
    int minMagic;
    int minDefense;
    int minResistance;

    String nameCheck; // Check for a specific name.
    String subStringNameCheck; // Check if a specific string is in the Character name.

    public SkillCheck(int minHealth, int minLevel, int minStrength, int minMagic, int minDefense, int minResistance, String nameCheck, String subStringNameCheck)
    {
        this.minHealth = minHealth;
        this.minLevel = minLevel;
        this.minStrength = minStrength;
        this.minMagic = minMagic;
        this.minDefense = minDefense;
        this.minResistance = minResistance;

        this.nameCheck = nameCheck;
        this.subStringNameCheck = subStringNameCheck;
    }

    public boolean testCheck(Player c)
    {
        if (c.getHealth() < minHealth)
        {
            return false;
        }
        if (c.getLevel() < minLevel)
        {
            return false;
        }
        if (c.getStrength() < minStrength)
        {
            return false;
        }
        if (c.getMagic() < minMagic)
        {
            return false;
        }
        if (c.getDefense() < minDefense)
        {
            return false;
        }
        if (c.getResistance() < minResistance)
        {
            return false;
        }

        // Check for name
        if (nameCheck != null)
        {
            if (!c.getName().equals(nameCheck))
            {
                return false;
            }
        }
        else if (subStringNameCheck != null) // Check for name substring, doesn't make sense to do both
        {
            
        }



        return true;
    }
}
