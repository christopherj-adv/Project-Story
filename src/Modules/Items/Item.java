package Modules.Items;

import Modules.Entity;

enum itemRarity { COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, HOLY}
public class Item extends Entity
{
    String description;

    itemRarity rarity;
    String nameColor; // Goes with rarity.

    public Item(String name, String description)
    {
        super(name);
        this.description = description;

        itemRarity rarity = itemRarity.COMMON;
        setNameColor(rarityAsColor(rarity));
    }
    public Item(String name, String description, itemRarity rarity)
    {
        // Initialize Values
        super(name);
        this.description = description;
        this.rarity = rarity;

        // Set the color of the item when used
        setNameColor(rarityAsColor(rarity));
    }

    // Must be changed to fit GUI components later.
    public String rarityAsColor(itemRarity rarity)
    {
        return "BLACK";
    }

    // Setters
    public void setNameColor(String color)
    {
        nameColor = color;
    }
    // Getters:
    public String getDescription()
    {
        return description;
    }
    public itemRarity getRarity()
    {
        return rarity;
    }
}
