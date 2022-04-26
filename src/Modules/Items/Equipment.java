package Modules.Items;

import Modules.Entity;

public class Equipment extends Entity
{
    String description;

    // If wearable, it goes into the Armor slot. If not, it goes into the offhand slot.
    boolean wearable;

    int strengthModifier;
    int magicModifier;
    
    public Equipment(String name, String description, int strengthModifier, int magicModifier, boolean wearable)
    {
        super(name);
        this.description = description;
        this.strengthModifier = strengthModifier;
        this.magicModifier = magicModifier;
        this.wearable = wearable;
    }

    // Getters
    public String getDescription()
    {
        return description;
    }
    public int getStrengthModifier()
    {
        return strengthModifier;
    }
    public int getMagicModifier()
    {
        return magicModifier;
    }
    public boolean isWearable()
    {
        return wearable;
    }
}
