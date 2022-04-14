package Modules.Items;

import Modules.Entity;

public abstract class Item implements Entity
{
    private String name;
    private String description;

    enum rarity { COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, HOLY}

    // Setters:
    public void setName(String name)
    {
        this.name = name;
    }
    
    // Getters:
    public String getName()
    {
        return name;
    }

    
}
