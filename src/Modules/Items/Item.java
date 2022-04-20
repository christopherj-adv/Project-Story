package Modules.Items;

import Modules.Entity;

enum itemRarity { COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, HOLY}
public class Item extends Entity
{
    int itemID;
    String description;
    itemRarity rarity;

    Item(String name, String description, int itemID)
    {
        super(name);
        this.itemID = itemID;
        this.description = description;
        this.rarity = itemRarity.COMMON;
    }
    Item(String name, String description, int itemID, itemRarity rarity)
    {
        super(name);
        this.itemID = itemID;
        this.description = description;
        this.rarity = rarity;
    }

    // Must be changed to fit GUI components later.
    public String rarityAsColor(itemRarity rarity)
    {
        switch (rarity) {
            case COMMON:
                
                break;
            case UNCOMMON:
                break;
            case RARE:
                break;
            case EPIC:
                break;
            case LEGENDARY:
                break;
            case HOLY:
                break;
            default:
                break;
        }

        return "UNDEFINED";
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
