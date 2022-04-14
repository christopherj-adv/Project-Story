package Modules.Items;

import Modules.Entity;
import Modules.Color.Color;
import Modules.Data;

enum itemRarity { COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, HOLY}
public class Item extends Entity
{
    String description;

    itemRarity rarity;

    public Item(String name, String description)
    {
        super(name);
        this.description = description;

        itemRarity rarity = itemRarity.COMMON;
        setName(rarityAsColor(rarity));
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

    public Data createData()
    {
        return null;
    }

    public String rarityAsColor(itemRarity rarity)
    {
        return Color.TEXT_BLACK;
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
