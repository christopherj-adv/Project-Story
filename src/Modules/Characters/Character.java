package Modules.Characters;

import Modules.*;
public class Character extends Entity
{
    // Stats
    int health, maxHealth, strength,
        constitution, agility, intelligence,
        perception, defence, resistance, charisma;

    public Character(String name)
    {
        super(name);
    }

    public Data createData()
    {
        String fo = getClassName(); // Will be written to file.
        return null;
    }
    @Override
    public String getClassName()
    {
        return "Character";
    }
}
