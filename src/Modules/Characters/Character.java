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
}
