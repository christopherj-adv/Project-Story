package Modules.Scenes;

import Modules.Characters.Character;

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

    SkillCheck(int minHealth, int minLevel, int minStrength, int minMagic, int minDefense, int minResistance, String nameCheck, String subStringNameCheck)
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

    boolean testCheck(Character c)
    {
        if (c.getHealth() < minHealth)
        {
            return false;
        }



        return true;
    }
}
